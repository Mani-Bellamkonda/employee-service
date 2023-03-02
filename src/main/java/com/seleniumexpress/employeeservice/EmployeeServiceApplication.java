package com.seleniumexpress.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class},scanBasePackages = "com.seleniumexpress.employeeservice")
//@ComponentScan(basePackages = {"com.seleniumexpress.employeeservice"})
//@EntityScan(basePackages = {"com.seleniumexpress.employeeservice.entity"} )
//@EnableJpaRepositories(basePackages = "com.seleniumexpress.employeeservice.repo", entityManagerFactoryRef = "sessionFactory")
//@EnableJpaRepositories(basePackages = {"com.seleniumexpress.employeeservice.repo"})
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

@Configuration
@ComponentScan({"com.seleniumexpress.employeeservice"})
@EntityScan(basePackages = "com.seleniumexpress.employeeservice")
@EnableJpaRepositories(basePackages = "com.seleniumexpress.employeeservice")
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
