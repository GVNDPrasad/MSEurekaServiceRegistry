package com.servicereg.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistryApplication {
    
	private static final Logger log = LoggerFactory.getLogger(EurekaServiceRegistryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryApplication.class, args);
		log.info("Started Eureka Server");
		System.out.println("EurekaServiceRegiStarted Eureka ServerstryApplication :: main() ::: Started Eureka Server");
		System.out.println("Eureka Dashboard URL: http://localhost:8761/");
	}

}
