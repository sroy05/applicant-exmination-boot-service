package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = { "com.exam","com.exam.model","com.exam.service"})
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@EntityScan({"com.exam.model"})
@EnableJpaRepositories(basePackages={"com.exam.repository"})
 public class ExaminationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminationServiceApplication.class, args);
	}

}
