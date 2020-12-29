package com.projeto.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.projeto.model")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = {"com.projeto.repository"})
@EnableTransactionManagement
public class GeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeekApplication.class, args);
	}

}
