package com.hh.dome.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SwitchNumbers {

	public static void main(String[] args) throws Exception, IOException {
		int num = 0;
		int base = 0;
		BufferedReader buf = null;
		System.out.print("请输入你要转换的数字:");
		buf = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(buf.readLine());// 要转换的数字
		System.out.print("请输入想要转换的进制:");
		buf = new BufferedReader(new InputStreamReader(System.in));
		base = Integer.parseInt(buf.readLine());// 将转换为的进制
		System.out.println(Switch(num, base));
	}

	public static String Switch(int num, int base) {
		StringBuffer sb = new StringBuffer();
		String all = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digths = all.substring(0, base);// 将要转换的进制字母对应表
		//只能装字符型的栈 
		Stack s = new Stack();
		while (num != 0) {
			// digths.charAt(n % base) 返回指定索引处的值 
			s.push(digths.charAt(num % base));
			num /= base;
		}
		while (!s.isEmpty()) {
			sb.append(s.pop());
		}
		return sb.toString();
	}

}