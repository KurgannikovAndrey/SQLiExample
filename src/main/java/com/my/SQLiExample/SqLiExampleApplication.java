package com.my.SQLiExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.my.SQLiExample.repository")
@ComponentScan("com.my.SQLiExample")
public class SqLiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqLiExampleApplication.class, args);
	}

}
