package com.micserv.microservice1_userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Microservice1UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1UserserviceApplication.class, args);
	}

}
