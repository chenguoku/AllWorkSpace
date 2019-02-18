package com.hh.delegate;

public class DispatcherTest {

	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher(new ExcetorA());
		dispatcher.doing();
	}

}
