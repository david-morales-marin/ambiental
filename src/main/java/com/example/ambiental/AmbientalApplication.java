package com.example.ambiental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("com.example.ambiental")
@EntityScan("com.example.ambiental")
public class AmbientalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbientalApplication.class, args);
	}

}
