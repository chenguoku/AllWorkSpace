package com.hh.proxy.jdk;

public class ZhangSan implements Person {

	private String sex = "男";
	private String name = "张三";

	@Override
	public void findLove() {

		System.out.println("我叫：" + name+"性别："+sex);
		System.out.println("长得漂亮的");
		System.out.println("大波浪的");

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
