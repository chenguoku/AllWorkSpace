package com.hh.springMVC.framework.servlet;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hh.springMVC.framework.annotation.HHController;
import com.hh.springMVC.framework.annotation.HHRequestMapping;
import com.hh.springMVC.framework.annotation.HHRequestParam;
import com.hh.springMVC.framework.context.HHApplicationContext;

public class HHDispatcherServlet extends HttpServlet {

	private static final String LOCATION = "contextConfigLocation";

//	private Map<Pattern, Handler> handlerMapping = new HashMap<Pattern,Handler>();
	private List<Handler> handlerMapping = new ArrayList<Handler>();

	private Map<Handler, HandlerAdapter> adapterMapping = new HashMap<Handler, HandlerAdapter>();

	private List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();

	// ��ʼ�����ǵ�IOC����
	@Override
	public void init(ServletConfig config) throws ServletException {

		// ��ʼ��Spring IOC ����
		// ��װ�����Ѿ�����
		HHApplicationContext context = new HHApplicationContext(config.getInitParameter(LOCATION));

		Map<String, Object> ioc = context.getAll();

		System.out.println(ioc.size());
		System.out.println(ioc.get("firstAction"));

		initMultipartResolver(context);
		initLocaleResolver(context);
		initThemeResolver(context);

		// HandlerMapping
		initHandlerMappings(context);
		// ������
		initHandlerAdapters(context);

		initHandlerExceptionResolvers(context);
		initRequestToViewNameTranslator(context);
		// ��ͼ������
		initViewResolvers(context);
		initFlashMapManager(context);

	}

	public void initMultipartResolver(HHApplicationContext context) {
	}

	public void initLocaleResolver(HHApplicationContext context) {
	}

	public void initThemeResolver(HHApplicationContext context) {
	}

	public void initHandlerMappings(HHApplicationContext context) {

		Map<String, Object> ioc = context.getAll();
		if (ioc.isEmpty()) {
			return;
		}
		// ֻҪ����Controller����
		// �������������Ӧ��Ҫ����@RequestMappingע�⣬���û�ӣ���������ǲ��ܱ��ⲿ���ʵ�
		for (Entry<String, Object> entry : ioc.entrySet()) {
			Class<? extends Object> clazz = entry.getValue().getClass();
			if (!clazz.isAnnotationPresent(HHController.class)) {
				continue;
			}

			String url = "";

			if (clazz.isAnnotationPresent(HHRequestMapping.class)) {
				HHRequestMapping requestMapping = clazz.getAnnotation(HHRequestMapping.class);
				url = requestMapping.value();
			}
			// ɨ��Controller�µ����з���
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if (!method.isAnnotationPresent(HHRequestMapping.class)) {
					continue;
				}
				HHRequestMapping requestMapping = method.getAnnotation(HHRequestMapping.class);
				String regex = (url + requestMapping.value()).replaceAll("/+", "/");

				Pattern pattern = Pattern.compile(regex);

				handlerMapping.add(new Handler(pattern, entry.getValue(), method));
				System.out.println("Mapping:" + regex + " " + method.toString());
			}

		}

		// RequestMapping�� ������һ�� url��һ��url�Ͷ�Ӧһ�����������������ϵ���浽Map��

	}

	/**
	 * 
	 * @Title: initHandlerAdapters @Description: ��������ƥ����̣�
	 *         ��Ҫ������̬ƥ�����ǵĲ��� @param @param context @return void @throws
	 */
	public void initHandlerAdapters(HHApplicationContext context) {

		if (handlerMapping.isEmpty()) {
			return;
		}
		Map<String, Integer> paramMapping = new HashMap<String, Integer>();
		// ֻ��ȡ���������ĳ������
		for (Handler handler : handlerMapping) {
			// ��������������еĲ���ȫ����ȡ����
			Class<?>[] parameterTypes = handler.method.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				Class<?> type = parameterTypes[i];
				if (type == HttpServletRequest.class || type == HttpServletResponse.class) {
					paramMapping.put(type.getName(), i);
				}
			}

			Annotation[][] pa = handler.method.getParameterAnnotations();
			for (int i = 0; i < pa.length; i++) {
				for (Annotation a : pa[i]) {
					if (a instanceof HHRequestParam) {
						String paramName = ((HHRequestParam) a).value();
						if (!"".equals(paramName.trim())) {
							paramMapping.put(paramName, i);
						}
					}
				}
			}

			adapterMapping.put(handler, new HandlerAdapter(paramMapping));

		}
	}

	public void initHandlerExceptionResolvers(HHApplicationContext context) {
	}

	public void initRequestToViewNameTranslator(HHApplicationContext context) {
	}

	public void initViewResolvers(HHApplicationContext context) {

		// ����ģ��ĸ����洢�������У����ģ���е��﷨����
		String tempateRoot = context.getConfig().getProperty("templateRoot");
		
		//������׾���һ���ļ�����ͨ�ļ�
		String rootPath = this.getClass().getClassLoader().getResource(tempateRoot).getFile();
		
		File rootDir = new File(rootPath);
		for (File template : rootDir.listFiles()) {
			viewResolvers.add(new ViewResolver(template.getName(),template));
		}

	}

	public void initFlashMapManager(HHApplicationContext context) {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	// ����������Լ�д��Controller����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			doDispatch(req, resp);

		} catch (Exception e) {
			resp.getWriter().write("500 Exception ,Msg:" + Arrays.toString(e.getStackTrace()));
		}
	}

	private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// ��ȡ����һ��handler����HandlerMapping��
		Handler handler = getHandler(req);
		if (handler == null) {
			resp.getWriter().write("404 Not Find");
			return;
		}

		// ȡ��һ��������
		HandlerAdapter ha = getHandlerAdapter(handler);

		// ����������ȥ�������Ǿ���ķ���
		HHModelAndView mv = ha.handler(req, resp, handler);

		// дһ��HHģ����
		// Veloctiy #
		// FreeMark #
		// JSP ${name}

		// HH @{name}
		applyDefaultViewName(resp, mv);
	}

	private void applyDefaultViewName(HttpServletResponse resp, HHModelAndView mv) throws Exception {
		if(null == mv){ return;}
		if(viewResolvers.isEmpty()){ return;}
		
		for (ViewResolver resolver : viewResolvers) {
			if(!mv.getView().equals(resolver.getViewName())){ continue; }
			
			String r = resolver.parse(mv);
			
			if(r != null){
				resp.getWriter().write(r);
				break;
			}
		}
	}

	private Handler getHandler(HttpServletRequest req) {
		// ѭ��HandlerMapping
		if (handlerMapping.isEmpty()) {
			return null;
		}

		// ��request��ȡurl
		String url = req.getRequestURI();
		String contextPath = req.getContextPath();
		url = url.replace(contextPath, "").replaceAll("/+", "/");

		for (Handler handler : handlerMapping) {
			Matcher matcher = handler.pattern.matcher(url);
			if (!matcher.matches()) {
				continue;
			}

			return handler;
		}
		return null;

	}

	private HandlerAdapter getHandlerAdapter(Handler handler) {

		if (adapterMapping.isEmpty()) {
			return null;
		}

		return adapterMapping.get(handler);
	}

	/**
	 * <p>
	 * Title: HandlerAdapter
	 * </p>
	 * <p>
	 * Description: ����������
	 * </p>
	 * 
	 * @author chenguoku
	 * @date 2019��3��3��
	 */
	private class HandlerAdapter {
		private Map<String, Integer> paramMapping;

		public HandlerAdapter(Map<String, Integer> paramMapping) {
			this.paramMapping = paramMapping;
		}

		// ��ҪĿ�����÷������url��Ӧ��method
		public HHModelAndView handler(HttpServletRequest req, HttpServletResponse resp, Handler handler)
				throws Exception {

			//ΪʲôҪ��req��ΪʲôҪ��resp��Ϊʲô��handler
			Class<?> [] paramTypes = handler.method.getParameterTypes();
			
			//Ҫ���������ֵ��ֻ��ͨ�����������ҵ������ĳ������
			
			Object [] paramValues = new Object[paramTypes.length];
			
			Map<String,String[]> params = req.getParameterMap();
			
			for (Entry<String, String[]> param : params.entrySet()) {
				String value = Arrays.toString(param.getValue()).replaceAll("\\[|\\]", "").replaceAll(",\\s", ",");
				
				if(!this.paramMapping.containsKey(param.getKey())){continue;}
				
				int index = this.paramMapping.get(param.getKey());
				
				//������ֵ�ǲ��е�
				paramValues[index] = castStringValue(value,paramTypes[index]);
			}
			
			//request �� response Ҫ��ֵ
			String reqName = HttpServletRequest.class.getName();
			if(this.paramMapping.containsKey(reqName)){
				int reqIndex = this.paramMapping.get(reqName);
				paramValues[reqIndex] = req;
			}
			
			
			String resqName = HttpServletResponse.class.getName();
				if(this.paramMapping.containsKey(resqName)){
				int respIndex = this.paramMapping.get(resqName);
				paramValues[respIndex] = resp;
			}
			
			boolean isModelAndView = handler.method.getReturnType() == HHModelAndView.class;
			Object r = handler.method.invoke(handler.controller, paramValues);
			if(isModelAndView){
				return (HHModelAndView)r;
			}else{
				return null;
			}

		}

		private Object castStringValue(String value, Class<?> clazz) {
			if (clazz == String.class) {
				return value;
			} else if (clazz == Integer.class) {
				return Integer.parseInt(value);
			} else if (clazz == int.class) {
				return Integer.parseInt(value);
			} else {
				return null;
			}
		}
	}

	/**
	 * <p>
	 * Title: Handler
	 * </p>
	 * <p>
	 * Description: HandlerMapping����
	 * </p>
	 * 
	 * @author chenguoku
	 * @date 2019��3��3��
	 */
	private class Handler {
		protected Object controller;
		protected Method method;
		protected Pattern pattern;

		protected Handler(Pattern pattern, Object controller, Method method) {
			this.pattern = pattern;
			this.controller = controller;
			this.method = method;
		}
	}

	private class ViewResolver {
		private String viewName;
		private File file;

		protected ViewResolver(String viewName, File file) {
			this.viewName = viewName;
			this.file = file;
		}

		protected String parse(HHModelAndView mv) throws Exception {

			StringBuffer sb = new StringBuffer();
			
			RandomAccessFile ra = new RandomAccessFile(this.file, "r");
			
			try{
				//ģ���ܵ��﷨�Ƿǳ����ӣ����ǣ�ԭ����һ����
				//�޷Ƕ�����������ʽ�������ַ�������
				//����ô�򵥣���Ҫ��Ϊ���ģ���ܵ��﷨���ж�ô�ĸߴ���
				//������������һ����ӵ�����ģ�壬Ҳ���ǹ���ѧԺ������ģ���﷨
				String line = null;
				while(null != (line = ra.readLine())){
					Matcher m = matcher(line);
					while (m.find()) {
						for (int i = 1; i <= m.groupCount(); i ++) {
							String paramName = m.group(i);
							
							Object paramValue = mv.getModel().get(paramName);
							System.err.println(paramValue);
							if(null == paramValue){ continue; }
							System.err.println(paramName);
							line = line.replaceAll("@\\{" + paramName + "\\}", paramValue.toString());
							System.err.println(line);
						}
					}
					
					sb.append(line);
				}
			}finally{
				ra.close();
			}
			return sb.toString();
		}

		private Matcher matcher(String str){
			Pattern pattern = Pattern.compile("@\\{(.+?)\\}",Pattern.CASE_INSENSITIVE);
			Matcher m = pattern.matcher(str);
			return m;
		}

		public String getViewName() {
			return viewName;
		}

		public void setViewName(String viewName) {
			this.viewName = viewName;
		}

		public File getFile() {
			return file;
		}

		public void setFile(File file) {
			this.file = file;
		}

	}

}
