package com.hh.prototype.simple;

import java.util.ArrayList;

public class Prototype implements Cloneable {
	private int age;

	public ArrayList<String> list = new ArrayList<>();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
			prototype.list = (ArrayList<String>) list.clone();
		} catch (Exception e) {
		}
		return prototype;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
