package com.hh.proxy.custom;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.hh.proxy.jdk.Person;

public class HHMeipo implements HHInvocationHandler {

	private Person person;
	
	//��ȡ�������˵ĸ�������
	public Object getInstance(Person person) throws Exception {
		this.person = person;
		Class clazz = person.getClass();
		return HHProxy.newProxyInstance(new HHClassLoader(), clazz.getInterfaces(), this);
		
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("����Ա���");
		System.out.println("��ʼ���к�ѡ...");
//		this.person.findLove();
		method.invoke(this.person, args);
		System.out.println("������ʵĻ�����׼����һ��");
		return null;
	}

}
