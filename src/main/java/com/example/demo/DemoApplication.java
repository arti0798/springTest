package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(scanBasePackages = "com.chatserver")
@SpringBootApplication(scanBasePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Heloo*****");

	}
}
	