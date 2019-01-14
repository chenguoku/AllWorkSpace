package com.hh.testmain;

import com.hh.hometheater.HomeTheaterFacade;

public class TestMain {

	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
	}

}
