package com.hh.dome.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 测试 Semaphore （信号量）
 * 
 * @author admin
 *
 */
public class TestSemaphore {

	// 请求的数量
	private static final int threadCount = 500;

	public static void main(String[] args) {
		// 创建一个具有固定线程数量的线程池对象，
		ExecutorService threadPool = Executors.newFixedThreadPool(300);
		// 一次只允许执行的线程数
		final Semaphore semaphore = new Semaphore(20);		//默认是非公平模式
//		final Semaphore semaphore = new Semaphore(1,true); //有序的 公平模式

		for (int i = 0; i < threadCount; i++) {
			final int threadNum = i;
			threadPool.execute(() -> {
				try {
					semaphore.acquire();//获取一个许可
					test(threadNum);
					semaphore.release();//释放一个许可
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}
		threadPool.shutdown();
		System.out.println("Finish");
	}

	public static void test(int threadnum) throws InterruptedException {
		Thread.sleep(500);// 模拟请求的耗时操作
		System.out.println("threadnum:" + threadnum);
		Thread.sleep(1000);// 模拟请求的耗时操作
	}

}
