package com.hh.pizza;

public abstract class Pizze {
	private String name;

	public abstract void bake();

	public void cut() {
		System.out.println(name + "��Ƭ");
	}

	public void box() {
		System.out.println(name + "װ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
