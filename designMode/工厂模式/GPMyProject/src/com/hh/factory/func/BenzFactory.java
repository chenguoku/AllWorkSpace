package com.hh.factory.func;

import com.hh.factory.Benz;
import com.hh.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
