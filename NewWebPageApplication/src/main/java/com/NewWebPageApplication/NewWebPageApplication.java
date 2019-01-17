package com.NewWebPageApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"com.NewWebPageApplication"})
public class NewWebPageApplication extends SpringBootServletInitializer{
	@Override
	  protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
	      return builder.sources(NewWebPageApplication.class);
	  }
	public static void main(String[] args) {
		SpringApplication.run(NewWebPageApplication.class, args);
	}

}

