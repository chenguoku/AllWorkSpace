package com.hh.testmain;

import com.hh.menu.ChineseMenu;
import com.hh.menu.USMenu;
import com.hh.menu.Waitress;

public class TestMain {
	public static void main(String[] args) {
		Waitress waitress = new Waitress();
		ChineseMenu chineseMenu = new ChineseMenu();
		USMenu usMenu = new USMenu();

		waitress.addIterator(chineseMenu.getIterator());
		waitress.addIterator(usMenu.getIterator());

		waitress.printMenu();
	}
}
