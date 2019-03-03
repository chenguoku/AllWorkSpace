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
			// ��λ
			is = this.getClass().getClassLoader().getResourceAsStream(location);

			// ����
			
			config.load(is);

			// ע��,������class�ҳ���������
			String packageName = config.getProperty("scanPackage");
			doRegister(packageName);
			// ��ʼ����ֻҪѭ��class
			doCreateBean();
			// ע��
			populate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @Title: doRegister @Description: �����з���������class�ҳ�����ע�ᵽ������ȥ @param @param
	 *         packageName @return void @throws
	 */
	private void doRegister(String packageName) {
		URL url = this.getClass().getClassLoader().getResource("/" + packageName.replaceAll("\\.", "/"));

		File dir = new File(url.getFile());
		for (File file : dir.listFiles()) {
			// �����һ���ļ��У������ݹ�
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
	 * @Description: ����ע��
	 * @param     
	 * @return void    
	 * @throws
	 */
	private void populate() {
		// �����ж�IOC�������ǲ����ж���
		if (instanceMapping.isEmpty()) {
			return;
		}
		for (java.util.Map.Entry<String, Object> entry : instanceMapping.entrySet()) {
			// ���������Զ�ȡ����������˽������
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
				field.setAccessible(true);// ��˽�б�������Ȩ��
				try {
					field.set(entry.getValue(), instanceMapping.get(id));

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}

	}

	public void doCreateBean() {
		// �����û��ע����Ϣ
		if (cacheClass.size() == 0) {
			return;
		}

		try {
			for (String className : cacheClass) {
				// Դ������������һ���жϣ�className����ʵ��ûʵ�ֽӿڣ�ʹ�����ִ���
				Class<?> clazz = Class.forName(className);

				// �ĸ�����Ҫ��ʼ�����ĸ��಻��Ҫ��ʼ��
				// ֻҪ����@Service��@Controller�ȶ�Ҫ��ʼ��
				if (clazz.isAnnotationPresent(HHController.class)) {
					// ���֣�Ĭ����������ĸСд
					String id = lowerFirstChar(clazz.getSimpleName());
					instanceMapping.put(id, clazz.newInstance());
				} else if (clazz.isAnnotationPresent(HHService.class)) {
					HHService service = clazz.getAnnotation(HHService.class);
					// ����Լ����������֣������������Լ����������
					String id = service.value();
					if (!id.equals(id.trim())) {
						instanceMapping.put(id, clazz.newInstance());
						continue;
					}

					// ����ǿյģ���Ĭ�Ϲ���
					// 1.��������ĸСд
					// ���������ǽӿ�
					// 2.���Ը�������ƥ��

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
	 * @Title: lowerFirstChar @Description: ������ĸСд @param @param
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
