package com.hh.dome.async;

 import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class AfterJava1_8 {
	public static void main(String[] args) {
//		两个线程池
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
//		jdk 1.8之前的实现方式
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				System.out.println("任务一开始");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("任务一结束");
				return "hello";
			}
		},newFixedThreadPool);
		
//		采用lambada
		supplyAsync.thenAccept(e -> System.out.println(e+" ok"));
		System.out.println("主程序");
		
	}
}
