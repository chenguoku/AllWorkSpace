package com.hh.hh_test.thread.springbootExecutor;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName AsyncService.java
 * @Description 异步调用的接口
 * @createTime 2019年10月30日
 */
public interface AsyncService {

    void executeAsync(ExecutorFunctional target);

}