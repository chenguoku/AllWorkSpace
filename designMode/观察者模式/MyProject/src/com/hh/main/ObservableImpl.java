package com.hh.main;

import java.util.Observable;

public class ObservableImpl extends Observable {
	
	public void update() {
		
		this.setChanged();//��֪ͨ��֮ǰ����Ҫ�����������
		this.notifyObservers();
	}

}
