package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.client"})
public class SpringRestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestConsumerApplication.class, args);
	}
}
