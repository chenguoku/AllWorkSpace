package com.hh.proxy.jdk;

public class ZhangSan implements Person {

	private String sex = "��";
	private String name = "����";

	@Override
	public void findLove() {

		System.out.println("�ҽУ�" + name+"�Ա�"+sex);
		System.out.println("����Ư����");
		System.out.println("���˵�");

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
