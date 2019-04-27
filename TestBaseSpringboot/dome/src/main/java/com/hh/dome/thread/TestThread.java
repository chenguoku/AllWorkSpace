package com.hh.dome.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {

	static Thread thread1 = new Thread(new Runnable() {
		@Override
		public void run() {
			double random = Math.random();
			try {
				Thread.sleep((long)random*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			System.out.println("Thread1");
		}
	});
	static Thread thread2 = new Thread(new Runnable() {
		@Override
		public void run() {
			double random = Math.random();
			try {
				Thread.sleep((long)random*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			System.out.println("Thread2");
		}
	});
	static Thread thread3 = new Thread(new Runnable() {
		@Override
		public void run() {
			double random = Math.random();
			try {
				Thread.sleep((long)random*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			System.out.println("Thread3");
		}
	});

	/**
	 * 
	 * @Title: main  
	 * @Description: 如何控制线程执行的顺序
	 * @param @param args
	 * @param @throws InterruptedException    
	 * @return void    
	 * @throws
	 */
	public static void main(String[] args) throws InterruptedException {
/////////////////////第二种///////////////////////////////////////		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.shutdown();
/////////////////////第一种///////////////////////////////////////
//		thread1.start();
//		thread1.join();
//		thread2.start();
//		thread2.join();
//		thread3.start();
		
		
	}
}
