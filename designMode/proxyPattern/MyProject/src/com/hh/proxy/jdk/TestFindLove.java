package com.hh.proxy.jdk;

public class TestFindLove {
	public static void main(String[] args) throws Exception {
//		ZhangSan zs = new ZhangSan();
//		zs.findLove();
		
		/**
		 * 原理：
		 * 1. 拿到被代理对象的引用，然后获取它的接口
		 * 2. JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
		 * 3. 把被代理对象的引用也拿到
		 * 4. 重新动态生成一个class字节码
		 * 5. 然后编译
		 */
		
		Person instance = (Person)new Meipo().getInstance(new ZhangSan());
		instance.findLove();
		System.out.println(instance.getClass());
		
	}
}
