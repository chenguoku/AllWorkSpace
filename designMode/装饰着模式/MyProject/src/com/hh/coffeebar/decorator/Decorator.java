package com.hh.coffeebar.decorator;

import com.hh.coffeebar.Drink;

public class Decorator extends Drink {

	private Drink drink;

	public Decorator(Drink drink) {
		this.drink = drink;
	}

	@Override
	public float cost() {
		return super.getPrice() + drink.cost();
	}

	@Override
	public String getDescribe() {
		return super.getDescribe() + "&&" + drink.getDescribe();
	}

}
