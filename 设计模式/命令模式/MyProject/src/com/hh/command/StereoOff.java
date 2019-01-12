package com.hh.command;

import com.hh.device.Stereo;

public class StereoOff implements Command {

	private Stereo stereo;

	public StereoOff(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void exceute() {
		stereo.off();
	}

}
