package com.hh.coffeebar.coffee;

import com.hh.coffeebar.Drink;

public class Coffee extends Drink {
	@Override
	public float cost() {
		return super.getPrice();
	}

}
