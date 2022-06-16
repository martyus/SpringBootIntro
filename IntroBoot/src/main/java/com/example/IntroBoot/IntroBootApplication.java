package com.example.IntroBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroBootApplication implements CommandLineRunner {

	@Autowired
	Engine engine;

	public static void main(String[] args) {
		SpringApplication.run(IntroBootApplication.class, args);
	}

	public void run(String... arg0){
		System.out.println("Hello world from Spring Boot!!!!");
		System.out.println(engine);

	}

}
