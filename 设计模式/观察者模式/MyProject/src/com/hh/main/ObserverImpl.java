package com.hh.main;

import java.util.Observable;
import java.util.Observer;

public class ObserverImpl implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		System.out.println("1111");
	}

	
	
}
