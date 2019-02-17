package com.hh.factory.abstr;

import com.hh.factory.Car;

public class DefaultFactory extends AbstractFactory {

	private AudiFactory defaultFactory = new AudiFactory();
	
	@Override
	protected Car getCar() {
		return defaultFactory.getCar();
	}

}
