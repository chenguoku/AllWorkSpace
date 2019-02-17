package com.hh.proxy.cglib;

public class TestCglib {
	public static void main(String[] args) throws Exception {
		LiSi lS = (LiSi)new MeiPo().getInstance(LiSi.class); 
		lS.findLove();
		
	}
}
