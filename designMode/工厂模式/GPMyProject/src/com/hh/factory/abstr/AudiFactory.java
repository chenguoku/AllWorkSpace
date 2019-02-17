package com.hh.factory.abstr;

import com.hh.factory.Audi;
import com.hh.factory.Car;

public class AudiFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		return new Audi();
	}

}
