package com.hh.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;

import com.hh.single.Singleton;
import com.hh.single.SingletonBean;

public class TestMain {

	public static void main(String[] args) {

		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			threadPool.execute(() -> {
				SingletonBean instance = SingletonBean.getInstance();
				System.out.println(instance);
			});
		}
		threadPool.shutdown();
	}
	
	@Test
	public void test() {
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			threadPool.execute(() -> {
				Singleton instance = Singleton.getInstance();
				System.out.println(instance);
			});
		}
		threadPool.shutdown();
	}

}
