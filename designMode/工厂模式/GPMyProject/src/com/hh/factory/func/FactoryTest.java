package com.hh.factory.func;

public class FactoryTest {
	public static void main(String[] args) {
		
		
		//����ģʽ
		//������Ʒ�������̣���ӵ�и��ԵĹ���
		//�������գ����ɵĸ߿Ƽ��̶ȶ��ǲ�һ����
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar().getName());
		
		//��Ҫ�û����ģ�������
		//�����˵Ĵ���ʹ�õĸ��Ӷ�
		factory = new BmwFactory();
		System.out.println(factory.getCar().getName());
		
	}
}
