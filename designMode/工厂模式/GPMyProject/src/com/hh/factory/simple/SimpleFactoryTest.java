package com.hh.factory.simple;

import com.hh.factory.Car;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		Car car = new SimpleFactory().getCar("Bmw");
		System.out.println(car.getName());
	}
}
