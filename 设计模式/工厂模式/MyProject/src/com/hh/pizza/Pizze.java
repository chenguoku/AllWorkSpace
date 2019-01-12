package com.hh.pizza;

public abstract class Pizze {
	private String name;

	public abstract void bake();

	public void cut() {
		System.out.println(name + "ÇÐÆ¬");
	}

	public void box() {
		System.out.println(name + "×°Ïä");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
