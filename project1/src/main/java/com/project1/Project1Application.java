package com.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;

@SpringBootApplication
@EnableSwagger2
public class Project1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Project1Application.class, args);
	}
}
