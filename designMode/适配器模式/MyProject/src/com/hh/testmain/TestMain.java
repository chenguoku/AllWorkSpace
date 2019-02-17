package com.hh.testmain;

import com.hh.adapter.TurkeyAdapter;
import com.hh.adapter.TurkeyAdapter2;
import com.hh.duck.Duck;
import com.hh.turkey.WildTurkey;

public class TestMain {
	public static void main(String[] args) {
//		WildTurkey turkey = new WildTurkey();
//		Duck turkeyDuck = new TurkeyAdapter(turkey);
//
//		turkeyDuck.quack();
//		turkeyDuck.fly();

		Duck turkeyAdapter2 = new TurkeyAdapter2();

		turkeyAdapter2.quack();
		turkeyAdapter2.fly();
	}

}
