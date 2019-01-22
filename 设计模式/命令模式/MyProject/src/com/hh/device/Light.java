package com.hh.device;

public class Light {

	private String name;

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + "On");
	}

	public void off() {
		System.out.println(name + "off");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
