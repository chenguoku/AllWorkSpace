package com.hh.main;

import com.hh.command.LightOff;
import com.hh.command.LightOn;
import com.hh.command.StereoOff;
import com.hh.command.StereoOn;
import com.hh.device.Light;
import com.hh.device.Stereo;

public class TestMain {
	public static void main(String[] args) {
		TraditionController controller = new TraditionController();
		
		Light light = new Light("bed");
		Stereo stereo = new Stereo("¹þ¹þ");
		
		LightOn lightOn = new LightOn(light);
		LightOff lightOff = new LightOff(light);
		StereoOn stereoOn = new StereoOn(stereo);
		StereoOff stereoOff = new StereoOff(stereo);
		
		controller.setCommand(1, lightOn, lightOff);
		controller.setCommand(2, stereoOn, stereoOff);
		
		controller.onButton(1);
		controller.offButton(1);
		controller.onButton(2);
		controller.offButton(2);
		
	}
}
