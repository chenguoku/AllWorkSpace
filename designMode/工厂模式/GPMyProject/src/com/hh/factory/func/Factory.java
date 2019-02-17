package com.hh.factory.func;

import com.hh.factory.Car;

//工厂接口，就定义了所有工厂的执行标准
public interface Factory {
	
	//符合汽车上路标准
	Car getCar();
}
