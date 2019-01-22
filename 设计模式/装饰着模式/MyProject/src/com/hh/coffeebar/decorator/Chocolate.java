package com.hh.coffeebar.decorator;

import com.hh.coffeebar.Drink;

public class Chocolate extends Decorator {

	public Chocolate(Drink drink) {
		super(drink);
		setPrice(3.0f);
		setDescribe("ги©ка╕");
	}

}
