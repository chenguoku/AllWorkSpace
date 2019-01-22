package com.hh.coffeebar.decorator;

import com.hh.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink drink) {
		super(drink);
		setPrice(2.0f);
		setDescribe("еёдл");
	}

}
