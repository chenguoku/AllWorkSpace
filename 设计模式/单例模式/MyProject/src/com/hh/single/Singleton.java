package com.hh.single;

public class Singleton {
	private static Singleton instance;
	private int age;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		instance.setAge(instance.getAge()+1);
//		System.out.println("###"+instance.getAge());
		return instance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}