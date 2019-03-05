package com.hh.dome.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch {

	//请求的数量 
	private static final int threadCount = 500;
	
	public static void main(String[] args) throws InterruptedException {
		//创建一个线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(300);
		final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
		for (int i = 0; i < threadCount; i++) {
			final int threadNum = i;
			threadPool.execute(() -> {
				try {
					test(threadNum);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					countDownLatch.countDown();
				}
			});
		}
		countDownLatch.await();
		threadPool.shutdown();
		System.out.println("完成");
		
	}
	  public static void test(int threadnum) throws InterruptedException {
	    Thread.sleep(1000);// 模拟请求的耗时操作
	    System.out.println("threadnum:" + threadnum);
	    Thread.sleep(1000);// 模拟请求的耗时操作
	  }
}
