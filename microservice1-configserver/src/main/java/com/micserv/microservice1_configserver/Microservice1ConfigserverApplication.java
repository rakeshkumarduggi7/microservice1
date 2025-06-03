package com.micserv.microservice1_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Microservice1ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1ConfigserverApplication.class, args);
	}

}
