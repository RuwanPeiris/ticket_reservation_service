package edu.sliit.ds.assignment2.train_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan("edu.sliit.ds.assignment2.train_rest_api")
@SpringBootApplication
public class TrainRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainRestApiApplication.class, args);
	}
}
