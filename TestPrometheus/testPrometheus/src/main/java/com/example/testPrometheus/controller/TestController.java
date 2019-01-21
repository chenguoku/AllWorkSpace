package com.example.testPrometheus.controller;

import com.example.testPrometheus.config.PrometheusMetricsAspect;
import com.example.testPrometheus.service.TestService;
import io.prometheus.client.Counter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    private static Random random = new Random();
    private static final Counter requestTotal = Counter.build()
            .name("my_test")
            .labelNames("status")
            .help("A simple Counter to illustrate custom Counters in Spring Boot and Prometheus").register();
    private static final Counter requestTotal2 = Counter.build()
            .name("my_test_2")
            .labelNames("status")
            .help("A simple Counter to illustrate custom Counters in Spring Boot and Prometheus").register();

    @Autowired
    private TestService testService;

    @GetMapping("/test/{id}")
    public ResponseEntity<String> test(@PathVariable("id") String id) {
        logger.info("id : {}", id);
        requestTotal2.labels("test").inc();
        if (random.nextInt(2) > 0) {
            requestTotal.labels("success").inc();
        } else {
            requestTotal.labels("error").inc();
        }

        return ResponseEntity.ok(id);
    }


    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
//        PrometheusMetricsAspect.helloTotal.labels("hello").inc();

        List<String> list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");


        testService.testService(list,"test");
        return "Hello World";
    }

}
