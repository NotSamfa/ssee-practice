package com.samuel_falla.SSEPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SsePracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsePracticeApplication.class, args);
	}

}
