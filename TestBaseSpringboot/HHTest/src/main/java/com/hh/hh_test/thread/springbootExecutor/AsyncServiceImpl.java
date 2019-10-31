package com.hh.hh_test.thread.springbootExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName AsyncServiceImpl.java
 * @Description 异步调用的接口实现类
 * @createTime 2019年10月30日
 */
@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync(ExecutorFunctional target) {
        try {
            target.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}