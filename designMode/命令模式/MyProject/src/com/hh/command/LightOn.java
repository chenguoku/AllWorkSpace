package com.hh.command;

import com.hh.device.Light;

public class LightOn implements Command {

	private Light light;
	
	public LightOn(Light light) {
		this.light = light;
	}
	
	@Override
	public void exceute() {
		light.on();
	}

}
