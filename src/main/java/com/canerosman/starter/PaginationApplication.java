package com.canerosman.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.canerosman")
@ComponentScan(basePackages = "com.canerosman")
@EnableJpaRepositories(basePackages = "com.canerosman")
public class PaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

}
