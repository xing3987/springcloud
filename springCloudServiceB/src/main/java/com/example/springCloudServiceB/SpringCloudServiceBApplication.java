package com.example.springCloudServiceB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceBApplication.class, args);
	}
}
