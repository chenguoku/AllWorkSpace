package com.hh.factory;

import com.hh.pizza.Pizze;
import com.hh.pizza.USCheesePizze;
import com.hh.pizza.USGreekPizze;

public class USFactory extends OrderFactory {

	Pizze pizze;

	@Override
	public Pizze createPizze(String pizzeType) {

		if ("cheese".equals(pizzeType)) {
			pizze = new USCheesePizze();
		} else if ("greek".equals(pizzeType)) {
			pizze = new USGreekPizze();
		}

		return pizze;
	}

}
