package com.ascentis.hcm.payroll.openapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ascentis.hcm.payroll.openapi"})
public class PayrollOpenApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollOpenApiServerApplication.class, args);
	}
}
