package com.hh.command;

import com.hh.device.Stereo;

public class StereoOn implements Command {

	private Stereo stereo;
	
	public StereoOn(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void exceute() {
		stereo.on();
	}

}
