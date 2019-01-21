package com.hh.dome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomeApplication.class, args);
	}

}

