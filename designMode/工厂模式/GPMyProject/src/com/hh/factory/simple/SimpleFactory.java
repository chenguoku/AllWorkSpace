package com.hh.factory.simple;

import com.hh.factory.Audi;
import com.hh.factory.Benz;
import com.hh.factory.Bmw;
import com.hh.factory.Car;

public class SimpleFactory {
	
	//实现统一化管理，专业化管理
	//如果没有工厂模式，小作坊，没有执行标准
	public Car getCar(String name) {
		if("BMW".equalsIgnoreCase(name)){
			return new Bmw();
		}else if("Benz".equalsIgnoreCase(name)){
			return new Benz();
		}else if("Audi".equalsIgnoreCase(name)){
			return new Audi();
		}else{
			System.out.println("这个产品产不出来");
			return null;
		}
	}
}
