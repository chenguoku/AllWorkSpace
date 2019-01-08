package com.hh.base;

import com.hh.fly.SlowFly;
import com.hh.run.SlowRun;

public class GreenDuck extends Duck {

	public GreenDuck() {
		flyBase = new SlowFly();
		runBase = new SlowRun();
	}
	
	@Override
	public void display() {
		System.out.println("бли╚");
	}

}
