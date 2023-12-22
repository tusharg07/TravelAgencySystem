package com.Sprinfboot.Project.tas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class TravelAgencySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelAgencySystemApplication.class, args);
	}

}
