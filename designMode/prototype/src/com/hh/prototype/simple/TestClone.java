package com.hh.prototype.simple;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype cp = new Prototype();
		cp.setAge(18);
		
		Prototype clone = (Prototype)cp.clone();
		System.out.println(clone.getAge());
		clone.setAge(32);
		System.out.println(cp.getAge());
		System.out.println(clone.getAge());
		System.out.println(cp.list == clone.list);
	}
}
