package com.jdi.test.movieratingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MovieRatingServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = null;
		try {
			context = SpringApplication.run(MovieRatingServiceApplication.class, args);
		}catch (Exception ex){
		
		}
		//context.close();
		//SpringApplication.exit(context);
	}

}
