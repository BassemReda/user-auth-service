package com.bassem.moviecatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MovieCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);
	}
}

/*
	add users
	fetch user by email
	add password hashing
	handle user not found
	handle incorrect password
	add swagger documentation
* */