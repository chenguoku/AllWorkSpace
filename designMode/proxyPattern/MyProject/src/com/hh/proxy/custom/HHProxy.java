package com.hh.proxy.custom;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

//生成代理对象的代码
public class HHProxy {
	
	private static String ln = "\r\n"; 
	
	public static Object newProxyInstance(HHClassLoader classLoader, Class<?>[] interfaces, HHInvocationHandler h)
			throws IllegalArgumentException {
		
		try {
			//1.生成源代码
			String generateSrc = generateSrc(interfaces[0]);
			
			//2.将生成的源代码输出到磁盘，保存为.java文件
			String path = HHProxy.class.getResource("").getPath();
			File f = new File(path + "$Proxy0.java");
			FileWriter fw = new FileWriter(f);
			fw.write(generateSrc);
			fw.flush();
			fw.close();
			
			//3.编译源代码，并且生成.class文件
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
			Iterable iterable = manager.getJavaFileObjects(f);
			
			CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
			task.call();
			manager.close();
			
			//4.将.class文件中的内容，动态加载到JVM中
			Class proxyClass = classLoader.findClass("$Proxy0");
			Constructor c = proxyClass.getConstructor(HHInvocationHandler.class);
			f.delete();
			
			//5.返回被代理后的代理对象
			return c.newInstance(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	private static String generateSrc(Class<?> interfaces) {
		StringBuffer src = new StringBuffer();
		src.append("package com.hh.proxy.custom;" + ln);
		src.append("import java.lang.reflect.Method;" + ln);
		src.append("public class $Proxy0 implements " +  interfaces.getName() + "{" + ln);
		
		src.append("HHInvocationHandler h;" + ln);
		
		src.append("public $Proxy0(HHInvocationHandler h) {" + ln);
		src.append("this.h = h;" + ln);
		src.append("}" + ln);
		
		for (Method m : interfaces.getMethods()) {
			src.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);
			
			src.append("try{" + ln);
			src.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" +m.getName()+"\",new Class[]{});" + ln);
			src.append("this.h.invoke(this,m,null);" + ln);
			src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
			src.append("}" + ln);
		}
		
		src.append("}");
		
//		System.out.println(src.toString());
		
		return src.toString();
	}
	
	
}
