package com.hh.command;

import com.hh.device.Light;

public class LightOff implements Command {

	private Light light;
	
	public LightOff(Light light) {
		this.light = light;
	}
	
	@Override
	public void exceute() {
		light.off();
	}

}
