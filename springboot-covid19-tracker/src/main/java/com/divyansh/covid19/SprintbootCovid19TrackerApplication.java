package com.divyansh.covid19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SprintbootCovid19TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintbootCovid19TrackerApplication.class, args);
	}

}
