package com.hh.coffeebar;

import com.hh.coffeebar.coffee.Espresso;
import com.hh.coffeebar.coffee.ShortBlock;
import com.hh.coffeebar.decorator.Chocolate;
import com.hh.coffeebar.decorator.Milk;

public class CoffeeBar {

	public static void main(String[] args) {
		Drink drink;
		drink = new Espresso();
		System.out.println("Espresso price " + drink.cost());
		System.out.println("Espresso describe " + drink.getDescribe());
//		
		drink = new ShortBlock();
		drink = new Milk(drink);
		drink = new Chocolate(drink);
		System.out.println(drink.cost());
		System.out.println(drink.getDescribe());
	}

}
