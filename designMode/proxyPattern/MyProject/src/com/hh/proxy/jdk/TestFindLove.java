package com.hh.proxy.jdk;

public class TestFindLove {
	public static void main(String[] args) throws Exception {
//		ZhangSan zs = new ZhangSan();
//		zs.findLove();
		
		/**
		 * ԭ��
		 * 1. �õ��������������ã�Ȼ���ȡ���Ľӿ�
		 * 2. JDK������������һ���࣬ͬʱʵ�����Ǹ��Ĵ��������ʵ�ֵĽӿ�
		 * 3. �ѱ�������������Ҳ�õ�
		 * 4. ���¶�̬����һ��class�ֽ���
		 * 5. Ȼ�����
		 */
		
		Person instance = (Person)new Meipo().getInstance(new ZhangSan());
		instance.findLove();
		System.out.println(instance.getClass());
		
	}
}
