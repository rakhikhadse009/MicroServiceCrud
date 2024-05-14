package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DeleteStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteStudentClientApplication.class, args);
	}

}
