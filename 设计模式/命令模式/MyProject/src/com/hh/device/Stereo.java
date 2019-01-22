package com.hh.device;

public class Stereo {

	private String name;

	public Stereo(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + "On");
	}

	public void off() {
		System.out.println(name + "Off");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
