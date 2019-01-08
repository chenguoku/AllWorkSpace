package com.hh.main;

import java.util.Observable;

public class ObservableImpl extends Observable {
	
	public void update() {
		
		this.setChanged();//发通知，之前，需要调用这个方法
		this.notifyObservers();
	}

}
