package com.hh.springMVC.framework.context;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import com.hh.springMVC.framework.annotation.HHAutowired;
import com.hh.springMVC.framework.annotation.HHController;
import com.hh.springMVC.framework.annotation.HHService;

public class HHApplicationContext {
	private Map<String, Object> instanceMapping = new ConcurrentHashMap<String, Object>();
	private List<String> cacheClass = new ArrayList<String>();
	private Properties config = new Properties();
	public HHApplicationContext(String location) {
		InputStream is = null;
		try {
			// 定位
			is = this.getClass().getClassLoader().getResourceAsStream(location);

			// 载入
			
			config.load(is);

			// 注册,把所有class找出来，存着
			String packageName = config.getProperty("scanPackage");
			doRegister(packageName);
			// 初始化，只要循环class
			doCreateBean();
			// 注入
			populate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @Title: doRegister @Description: 把所有符合条件的class找出来，注册到缓存中去 @param @param
	 *         packageName @return void @throws
	 */
	private void doRegister(String packageName) {
		URL url = this.getClass().getClassLoader().getResource("/" + packageName.replaceAll("\\.", "/"));

		File dir = new File(url.getFile());
		for (File file : dir.listFiles()) {
			// 如果是一个文件夹，继续递归
			if (file.isDirectory()) {
				doRegister(packageName + "." + file.getName());
			} else {
				cacheClass.add(packageName + "." + file.getName().replace(".class", "").trim());
			}
		}
	}

	/**
	 * 
	 * @Title: populate  
	 * @Description: 依赖注入
	 * @param     
	 * @return void    
	 * @throws
	 */
	private void populate() {
		// 首先判断IOC容器中是不是有东西
		if (instanceMapping.isEmpty()) {
			return;
		}
		for (java.util.Map.Entry<String, Object> entry : instanceMapping.entrySet()) {
			// 把所有属性都取出来，包括私有属性
			Field[] declaredFields = entry.getValue().getClass().getDeclaredFields();

			for (Field field : declaredFields) {
				if (!field.isAnnotationPresent(HHAutowired.class)) {
					continue;
				}

				HHAutowired annotation = field.getAnnotation(HHAutowired.class);
				String id = annotation.value().trim();
				if ("".equals(id)) {
					id = field.getType().getName();
				}
				field.setAccessible(true);// 把私有变量开发权限
				try {
					field.set(entry.getValue(), instanceMapping.get(id));

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}

	}

	public void doCreateBean() {
		// 检出有没有注册信息
		if (cacheClass.size() == 0) {
			return;
		}

		try {
			for (String className : cacheClass) {
				// 源码中这里会进行一个判断，className的类实现没实现接口，使用哪种代理
				Class<?> clazz = Class.forName(className);

				// 哪个类需要初始化，哪个类不需要初始化
				// 只要加了@Service，@Controller等都要初始化
				if (clazz.isAnnotationPresent(HHController.class)) {
					// 名字，默认类名首字母小写
					String id = lowerFirstChar(clazz.getSimpleName());
					instanceMapping.put(id, clazz.newInstance());
				} else if (clazz.isAnnotationPresent(HHService.class)) {
					HHService service = clazz.getAnnotation(HHService.class);
					// 如果自己设置了名字，就优先用他自己定义的名字
					String id = service.value();
					if (!id.equals(id.trim())) {
						instanceMapping.put(id, clazz.newInstance());
						continue;
					}

					// 如果是空的，就默认规则
					// 1.类名首字母小写
					// 如果这个类是接口
					// 2.可以根据类型匹配

					Class<?>[] interfaces = clazz.getInterfaces();
					for (Class<?> class1 : interfaces) {
						instanceMapping.put(class1.getName(), clazz.newInstance());
					}
				} else {
					continue;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getBean(String name) {
		return null;
	}

	public Map<String, Object> getAll() {
		return instanceMapping;
	}

	/**
	 * 
	 * @Title: lowerFirstChar @Description: 将首字母小写 @param @param
	 *         name @param @return @return String @throws
	 */
	private String lowerFirstChar(String name) {
		char[] charArray = name.toCharArray();
		charArray[0] += 32;
		return String.valueOf(charArray);
	}

	public Properties getConfig() {
		return config;
	}

	
}
