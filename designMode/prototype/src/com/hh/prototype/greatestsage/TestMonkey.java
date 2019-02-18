package com.hh.prototype.greatestsage;

public class TestMonkey {
	public static void main(String[] args) throws Exception {
		TheGreatestSage sage = new TheGreatestSage();
		TheGreatestSage clone = (TheGreatestSage)sage.clone();
		
		System.out.println(sage == clone);
		System.out.println(sage.birthday == clone.birthday);
		System.out.println(sage.getStaff() == clone.getStaff());
	}
}
