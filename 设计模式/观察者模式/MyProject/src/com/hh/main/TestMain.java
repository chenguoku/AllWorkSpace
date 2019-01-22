package com.hh.main;

public class TestMain {
	public static void main(String[] args) {
		ObservableImpl observableImpl = new ObservableImpl();
		ObserverImpl observerImpl = new ObserverImpl();
		ObserverImpl2 observerImpl2 = new ObserverImpl2();
		
		observableImpl.addObserver(observerImpl);
		observableImpl.addObserver(observerImpl2);
		
		observableImpl.update();
	}
}
