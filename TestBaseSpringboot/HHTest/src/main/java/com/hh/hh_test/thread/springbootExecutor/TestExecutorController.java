package com.hh.hh_test.thread.springbootExecutor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName TestExecutorController.java
 * @Description 测试线程池的Controller
 * @createTime 2019年10月30日
 */
@RestController
@RequestMapping("executor")
@Slf4j
public class TestExecutorController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("func")
    public void testFunctionalExecutor() {

        // CountDownLatch latch = new CountDownLatch(3);

        for (int i = 0; i < 10; i++) {
            asyncService.executeAsync(() -> {
                int random = (int) (2 + Math.random() * 8);
                log.info("线程睡{}秒", random);
                Thread.sleep(random * 1000);
                // latch.countDown();
                log.info("子线程睡{}秒,执行完毕", random);
            });
        }
        // latch.await();

        log.info("主线程执行完毕");

    }

}