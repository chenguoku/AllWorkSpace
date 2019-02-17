package com.hh.main;

import java.util.Observable;
import java.util.Observer;

public class ObserverImpl2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("2222");
	}
	
}
