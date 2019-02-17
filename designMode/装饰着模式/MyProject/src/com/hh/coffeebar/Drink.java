package com.hh.coffeebar;

public abstract class Drink {
	private String describe = "";
	private float price = 0f;

	public String getDescribe() {
		return describe + "-" + getPrice();
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract float cost();
}
