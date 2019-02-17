package com.hh.main;

import com.hh.factory.ChinaFactory;
import com.hh.factory.USFactory;

public class TestMain {
	public static void main(String[] args) {
		ChinaFactory chinaFactory = new ChinaFactory();
		USFactory usFactory = new USFactory();
//		new PizzeStore(chinaFactory);
		new PizzeStore(usFactory);
	}
}
