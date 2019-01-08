package com.hh.base;

import com.hh.fly.FlyBase;
import com.hh.run.RunBase;

public abstract class Duck {

	FlyBase flyBase;
	RunBase runBase;
	
	public Duck() {
		
	}
	
	public void fly() {
		flyBase.fly();
	}
	
	public void run() {
		runBase.run();
	}
	
	public abstract void display();
	
	
}
