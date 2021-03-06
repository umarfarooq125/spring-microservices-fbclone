package com.socialmedia.couldgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouldGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouldGatewayApplication.class, args);
	}

}
