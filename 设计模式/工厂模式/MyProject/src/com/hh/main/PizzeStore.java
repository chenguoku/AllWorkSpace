package com.hh.main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.hh.factory.OrderFactory;
import com.hh.pizza.Pizze;

public class PizzeStore {

	OrderFactory orderFactory;

	public PizzeStore(OrderFactory orderFactory) {
		this.orderFactory = orderFactory;
		setFactory();
	}

	private void setFactory() {
		do {
			String pizeeType = getPizeeType();
			Pizze pizze = orderFactory.createPizze(pizeeType);
			if (pizze != null) {
				pizze.bake();
				pizze.cut();
				pizze.box();
			}

		} while (true);

	}

	private String getPizeeType() {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("您需要的披萨类型？");
		String readLine = "";
		try {
			readLine = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return readLine;
	}

}
