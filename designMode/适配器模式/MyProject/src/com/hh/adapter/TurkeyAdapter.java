package com.hh.adapter;

import com.hh.duck.Duck;
import com.hh.turkey.Turkey;

/**
 * ¶ÔÏóÊÊÅäÆ÷
 * 
 * @author Administrator
 *
 */
public class TurkeyAdapter implements Duck {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
		turkey.fly();
		turkey.fly();
		turkey.fly();
		turkey.fly();
		turkey.fly();
		
	}

}
