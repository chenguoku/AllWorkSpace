package com.hh.proxy.custom;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.hh.proxy.jdk.Person;

public class HHMeipo implements HHInvocationHandler {

	private Person person;
	
	//获取被代理人的个人资料
	public Object getInstance(Person person) throws Exception {
		this.person = person;
		Class clazz = person.getClass();
		return HHProxy.newProxyInstance(new HHClassLoader(), clazz.getInterfaces(), this);
		
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("你的性别是");
		System.out.println("开始进行海选...");
//		this.person.findLove();
		method.invoke(this.person, args);
		System.out.println("如果合适的话，就准备下一步");
		return null;
	}

}
