package com.tdd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tdd"})
public class TDDExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TDDExampleApplication.class, args);
	}
}
