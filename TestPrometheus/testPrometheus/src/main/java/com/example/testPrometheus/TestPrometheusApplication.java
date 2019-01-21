package com.example.testPrometheus;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class TestPrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPrometheusApplication.class, args);
	}

}

