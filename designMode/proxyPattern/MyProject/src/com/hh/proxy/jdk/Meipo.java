package com.hh.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

//������
public class Meipo implements InvocationHandler {

	private Person person;
	
	//��ȡ�������˵ĸ�������
	public Object getInstance(Person person) throws Exception {
		this.person = person;
		Class clazz = person.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
//		System.out.println("����Ա��ǣ�"+this.person.getSex());
		System.out.println("��ʼ���к�ѡ...");
//		this.person.findLove();
		method.invoke(this.person, args);
		System.out.println("������ʵĻ�����׼����һ��");
		return null;
	}
	

}
