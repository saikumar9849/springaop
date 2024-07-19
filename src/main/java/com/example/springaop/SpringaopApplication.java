package com.example.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springaop.dao.AlienRepo;

@SpringBootApplication
public class SpringaopApplication {
	@Autowired
	AlienRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
		//System.out.println(repo.)
	}

}
