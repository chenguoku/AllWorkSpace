package com.hh.single;

import org.junit.jupiter.api.Test;

public class SingletonBean {

	public static int age = 0;
	
	private static volatile SingletonBean bean;

	private SingletonBean() {
	}

	public static SingletonBean getInstance() {

		if (bean == null) {
			synchronized (SingletonBean.class) {
				bean = new SingletonBean();
			}
		}
		return bean;
	}

}
