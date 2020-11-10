package com.hh.springbootbeetldemo;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringbootBeetlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBeetlDemoApplication.class, args);
    }
}
