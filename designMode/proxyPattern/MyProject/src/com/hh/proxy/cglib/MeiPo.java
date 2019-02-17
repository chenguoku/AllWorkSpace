package com.hh.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MeiPo implements MethodInterceptor {

	public Object getInstance(Class clazz) throws Exception {
		//ͨ��������ơ�����ʵ����
		Enhancer enhancer = new Enhancer();
		
		//�Ѹ�������Ϊ˭��
		enhancer.setSuperclass(clazz);
		
		enhancer.setCallback(this);
		
		return enhancer.create() ;
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("��˵ý�ţ������Ҷ���");
		System.out.println("��ʼ���к�ѡ...");
		
		proxy.invokeSuper(obj, args);
		
		System.out.println("������ʵĻ�����׼����һ��");
		return null;
	}

}
