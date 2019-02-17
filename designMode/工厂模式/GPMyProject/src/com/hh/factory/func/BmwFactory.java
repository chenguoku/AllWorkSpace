package com.hh.factory.func;

import com.hh.factory.Bmw;
import com.hh.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
