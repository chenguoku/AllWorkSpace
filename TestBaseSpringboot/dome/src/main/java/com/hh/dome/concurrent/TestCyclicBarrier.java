package com.hh.dome.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestCyclicBarrier {

	// 请求的数量
	private static final int threadCount = 550;

	// 需要同步的线程数
//	private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
	private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(5,()->{
		System.out.println("优先执行");
	}) ;
	

	public static void main(String[] args) throws Exception {
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		for (int i = 0; i < threadCount; i++) {
			final int threadNum = i;
			Thread.sleep(1000);
			threadPool.execute(() -> {
				try {
					test(threadNum);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}
		threadPool.shutdown();
	}
	
	public static void test(int threadNum) {
		System.out.println("threadnum"+threadNum+"is ready");
		try {
			cyclicBarrier.await();
		} catch (Exception e) {
			System.out.println("test e Exception");
		}
		System.out.println("threadnum"+threadNum+"完成");
	}
}
