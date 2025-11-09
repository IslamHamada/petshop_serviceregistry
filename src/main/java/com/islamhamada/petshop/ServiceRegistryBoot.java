package com.islamhamada.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryBoot {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryBoot.class, args);
	}

}
