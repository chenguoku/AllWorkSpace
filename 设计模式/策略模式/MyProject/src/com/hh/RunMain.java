package com.hh;

import com.hh.base.GreenDuck;
import com.hh.base.RedDuck;
import com.hh.base.YelloDuck;

public class RunMain {
	public static void main(String[] args) {
		GreenDuck greenDuck = new GreenDuck();
		RedDuck redDuck = new RedDuck();
		YelloDuck yelloDuck = new YelloDuck();
		
		yelloDuck.display();
		yelloDuck.fly();
//		yelloDuck.run();
		
		greenDuck.display();
		greenDuck.fly();
		greenDuck.run();
		
		redDuck.display();
		redDuck.fly();
		redDuck.run();
	}
}
