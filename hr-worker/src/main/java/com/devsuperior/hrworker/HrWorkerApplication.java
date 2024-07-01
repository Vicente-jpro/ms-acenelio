package com.devsuperior.hrworker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class HrWorkerApplication implements CommandLineRunner{

	@Value("${profile.name}")
	private String profileName;
	
	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Current profile: "+profileName);
	}

}
