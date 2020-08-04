package com.hh.dome.extension.registrar;

import com.hh.dome.DomeApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Classname: Registrar
 * @Description: Registrar动态加载测试类
 * @Author: chenguoku
 * @Date 2020-8-4
 * @Version V1.0
 */
@SpringBootApplication
@EnableHHRegistrar
public class RegistrarTestMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RegistrarTestMain.class, args);
        Object hello = run.getBean("hello");
        System.out.println(hello);
    }
}
