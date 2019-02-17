package com.hh.factory.abstr;

import com.hh.factory.Bmw;
import com.hh.factory.Car;

public class BmwFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
