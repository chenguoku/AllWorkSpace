package com.hh.factory;

import com.hh.pizza.Pizze;

public abstract class OrderFactory {
	public abstract Pizze createPizze(String pizzeType);
}
