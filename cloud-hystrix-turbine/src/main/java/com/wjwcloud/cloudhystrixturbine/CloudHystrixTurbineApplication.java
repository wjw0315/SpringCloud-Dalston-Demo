package com.wjwcloud.cloudhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class CloudHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudHystrixTurbineApplication.class, args);
	}
}
