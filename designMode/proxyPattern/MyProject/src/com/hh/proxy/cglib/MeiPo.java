package com.hh.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MeiPo implements MethodInterceptor {

	public Object getInstance(Class clazz) throws Exception {
		//通过反射机制。给它实例化
		Enhancer enhancer = new Enhancer();
		
		//把父类设置为谁？
		enhancer.setSuperclass(clazz);
		
		enhancer.setCallback(this);
		
		return enhancer.create() ;
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("我说媒婆，帮你找对象");
		System.out.println("开始进行海选...");
		
		proxy.invokeSuper(obj, args);
		
		System.out.println("如果合适的话，就准备下一步");
		return null;
	}

}
