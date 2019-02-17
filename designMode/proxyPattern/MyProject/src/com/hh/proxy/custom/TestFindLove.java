package com.hh.proxy.custom;

import com.hh.proxy.jdk.Person;
import com.hh.proxy.jdk.ZhangSan;

public class TestFindLove {
	public static void main(String[] args) throws Exception {
		
		ZhangSan zs = new ZhangSan();
		Person instance = (Person)new HHMeipo().getInstance(zs);
		instance.findLove();
		
		
	}
}
