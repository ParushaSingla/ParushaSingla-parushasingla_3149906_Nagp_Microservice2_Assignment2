package com.nagarro.aggregatorService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AggregatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregatorServiceApplication.class, args);
	}
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

}
