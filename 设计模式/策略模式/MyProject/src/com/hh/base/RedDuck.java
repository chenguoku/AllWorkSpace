package com.hh.base;

import com.hh.fly.FastFly;
import com.hh.run.FastRun;

public class RedDuck extends Duck {

	public RedDuck() {
		flyBase = new FastFly();
		runBase = new FastRun();
	}
	
	
	@Override
	public void display() {
		System.out.println("ºìÉ«");
	}

}
