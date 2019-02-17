package com.hh.factory.simple;

import com.hh.factory.Audi;
import com.hh.factory.Benz;
import com.hh.factory.Bmw;
import com.hh.factory.Car;

public class SimpleFactory {
	
	//ʵ��ͳһ������רҵ������
	//���û�й���ģʽ��С������û��ִ�б�׼
	public Car getCar(String name) {
		if("BMW".equalsIgnoreCase(name)){
			return new Bmw();
		}else if("Benz".equalsIgnoreCase(name)){
			return new Benz();
		}else if("Audi".equalsIgnoreCase(name)){
			return new Audi();
		}else{
			System.out.println("�����Ʒ��������");
			return null;
		}
	}
}
