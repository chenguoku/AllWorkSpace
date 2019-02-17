package com.hh.factory.func;

import com.hh.factory.Audi;
import com.hh.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
