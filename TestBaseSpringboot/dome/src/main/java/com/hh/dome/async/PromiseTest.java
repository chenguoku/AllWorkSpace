package com.hh.dome.async;

import java.util.concurrent.Callable;

import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.FutureListener;

public class PromiseTest {
	public static void main(String[] args) {
		// 线程池
		DefaultEventExecutorGroup defaultEventExecutorGroup = new DefaultEventExecutorGroup(1);

		// 向线程池中提交任务，并返回Future，该Future是netty自己实现的future
		// 位于io.netty.util.concurrent包下，此处运行时的类型为PromiseTask
		Future<String> submit = defaultEventExecutorGroup.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("任务一开始");
				Thread.sleep(3000);
				System.out.println("任务一结束");
				return "hello";
			}
		});

//		增加监听
		submit.addListener(new FutureListener<String>() {

			@Override
			public void operationComplete(Future<String> future) throws Exception {
				System.out.println("ok");
			}

		});

		System.out.println("主线程");

	}
}
