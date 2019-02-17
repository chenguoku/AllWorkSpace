package com.hh.factory.abstr;

import com.hh.factory.Benz;
import com.hh.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
