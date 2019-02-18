package com.hh.delegate;

public class Dispatcher implements IExector {

	private IExector exector;

	Dispatcher(IExector exector) {
		this.exector = exector;
	}

	@Override
	public void doing() {
		this.exector.doing();
	}

}
