package com.hh.factory.abstr;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DefaultFactory factory = new DefaultFactory();
		
		System.out.println(factory.getCar("bmw").getName());
	}

}
