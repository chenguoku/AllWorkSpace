package com.hh.dome.extension;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(2)
public class TestCommandLineRunnerTwo implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务启动加载数据2...");
    }
}
