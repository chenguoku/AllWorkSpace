package com.hh.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

//代理类
public class Meipo implements InvocationHandler {

	private Person person;
	
	//获取被代理人的个人资料
	public Object getInstance(Person person) throws Exception {
		this.person = person;
		Class clazz = person.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
//		System.out.println("你的性别是："+this.person.getSex());
		System.out.println("开始进行海选...");
//		this.person.findLove();
		method.invoke(this.person, args);
		System.out.println("如果合适的话，就准备下一步");
		return null;
	}
	

}
