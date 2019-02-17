package com.hh.factory.abstr;

import com.hh.factory.Car;

public abstract class AbstractFactory {

	protected abstract Car getCar();
	
	public Car getCar(String name) {
		if("BMW".equalsIgnoreCase(name)){
			return new BmwFactory().getCar();
		}else if("Benz".equalsIgnoreCase(name)){
			return new BenzFactory().getCar();
		}else if("Audi".equalsIgnoreCase(name)){
			return new AudiFactory().getCar();
		}else{
			System.out.println("�����Ʒ��������");
			return null;
		}
	}
	
}
