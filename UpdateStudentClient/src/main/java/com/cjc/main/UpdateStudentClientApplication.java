package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UpdateStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdateStudentClientApplication.class, args);
	}

}
