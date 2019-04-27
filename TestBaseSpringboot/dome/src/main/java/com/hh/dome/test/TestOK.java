package com.hh.dome.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class TestOK {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		getString(string);
		
	}
	
	public static void getString(String string) {
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			String value = map.get(String.valueOf(c));
			if (null == value) {
				map.put(String.valueOf(c), "1");
			}else {
				int num = Integer.parseInt(value);
				num++;
				map.put(String.valueOf(c), String.valueOf(num));
			}
		}
		map.forEach((x,y) -> {
			System.out.print(x);
			if (Integer.parseInt(y) != 1) {
				System.out.print(y);
			}
		});
		
	}
	
	@Test
	public void test() {
		Map<String, String> map = new HashMap<>();
		System.out.println(map.get("1"));
	}

}
