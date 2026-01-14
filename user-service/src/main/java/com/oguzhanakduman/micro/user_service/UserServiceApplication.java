package com.oguzhanakduman.micro.user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.oguzhanakduman.micro"})
@ComponentScan(basePackages = {"com.oguzhanakduman.micro"})
@EnableJpaRepositories(basePackages = {"com.oguzhanakduman.micro"})
@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
