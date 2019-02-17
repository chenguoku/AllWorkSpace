package com.hh.pizza;

public class ChinaGreekPizze extends Pizze {

	@Override
	public void bake() {
		super.setName("ChinaGreekPizze");
		System.out.println(super.getName()+"ÕýÔÚºæ±º");
	}

}
