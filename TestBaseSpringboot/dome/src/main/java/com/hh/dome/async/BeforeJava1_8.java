package com.hh.dome.async;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.stereotype.Component;

/**
 * @description java中的异步操作
 * @author 陈国库
 *
 */
@Component
public class BeforeJava1_8 {

	public void testOne() throws Exception {
		ExecutorService exector = Executors.newFixedThreadPool(1);
		// Future代表了线程执行完以后的结果，可以通过future获得执行的结果
		// 但是jdk1.8之前的Future有点鸡肋，并不能实现真正的异步，需要阻塞的获取结果，或者不断的轮询
		// 通常我们希望当线程执行完一些耗时的任务后，能够自动的通知我们结果，很遗憾这在原生jdk1.8之前
		// 是不支持的，但是我们可以通过第三方的库实现真正的异步回调
		
		Future<String> submit = exector.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("任务一开始");
				Thread.sleep(3000);
				System.out.println("任务一结束");
				return "hello";
			}
		});
//		阻塞了，不是异步
//		System.out.println(submit.get());
		//非阻塞了，是异步
		System.out.println(submit.isDone());
		System.out.println("main");
		Thread.sleep(5000);
		
	}
	
}
