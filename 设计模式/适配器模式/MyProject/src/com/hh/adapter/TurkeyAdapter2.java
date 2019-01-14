package com.hh.adapter;

import com.hh.duck.Duck;
import com.hh.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		super.gobble();
	}
	
	@Override
	public void fly() {
		super.fly();
		super.fly();
		super.fly();
	}

}
