package com.hh.dome.async;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.stereotype.Component;

import com.google.common.collect.MoreCollectors;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

/**
 * Guava中的Future
 * 
 * @author admin
 *
 */
@Component
public class GuavaFuture {
	public static void main(String[] args) {

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);

//		使用guava提供的MoreExecutors工具类包装原始的线程池
		ListeningExecutorService listeningDecorator = MoreExecutors.listeningDecorator(newFixedThreadPool);
//		向线程池中提交一个任务后，将会返回一个可监听的Future，该Future由Guava框架提供
		ListenableFuture<String> submit = listeningDecorator.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("任务一开始");
				Thread.sleep(3000);
				System.out.println("任务一结束");
				return "hello";
			}
		});
//		添加回调，回调由executor中的线程触发，但也可以指定一个新的线程
		Futures.addCallback(submit, new FutureCallback<String>() {

			@Override
			public void onSuccess(@Nullable String result) {
				System.out.println("成功");
			}

			@Override
			public void onFailure(Throwable t) {
				System.out.println("失败");
			}
		},newFixedThreadPool);
		
		System.out.println("主线程");

	}
}
