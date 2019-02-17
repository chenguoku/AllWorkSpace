package com.hh.factory.func;

public class FactoryTest {
	public static void main(String[] args) {
		
		
		//工厂模式
		//各个产品的生产商，都拥有各自的工厂
		//生产工艺，生成的高科技程度都是不一样的
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar().getName());
		
		//需要用户关心，生成商
		//增加了的代码使用的复杂度
		factory = new BmwFactory();
		System.out.println(factory.getCar().getName());
		
	}
}
