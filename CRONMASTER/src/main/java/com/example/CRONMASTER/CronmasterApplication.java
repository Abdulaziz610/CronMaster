package com.example.CRONMASTER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronmasterApplication.class, args);
	}

}
