package com.hh.factory;

import com.hh.pizza.ChinaCheesePizze;
import com.hh.pizza.ChinaGreekPizze;
import com.hh.pizza.Pizze;

public class ChinaFactory extends OrderFactory {

	Pizze pizze;

	@Override
	public Pizze createPizze(String pizzeType) {

		if ("cheese".equals(pizzeType)) {
			pizze = new ChinaCheesePizze();
		} else if ("greek".equals(pizzeType)) {
			pizze = new ChinaGreekPizze();
		}

		return pizze;
	}

}
