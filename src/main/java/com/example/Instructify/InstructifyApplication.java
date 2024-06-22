package com.example.Instructify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Instructify.Repository")
public class InstructifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstructifyApplication.class, args);
	}

}
