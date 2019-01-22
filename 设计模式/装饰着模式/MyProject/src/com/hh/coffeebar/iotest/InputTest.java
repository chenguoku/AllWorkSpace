package com.hh.coffeebar.iotest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("F:\\11.txt")));

			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
