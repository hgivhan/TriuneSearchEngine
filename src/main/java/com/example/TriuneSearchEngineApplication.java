package com.example;

import com.example.Models.Herb;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@EntityScan("com.example")
public class TriuneSearchEngineApplication {

	@Autowired
	ResourceLoader resourceLoader;

	public static void main(String[] args) {
		SpringApplication.run(TriuneSearchEngineApplication.class, args);
	}

//	public Resource loadEmployeesWithResourceLoader() {
//		return resourceLoader.getResource(
//				"classpath:main/herb.json");
//	}
}

//	@Override
//	public void run(String... args) throws Exception {
//		//create ObjectMapper instance
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		//read json file and convert to customer object
//		Herb herb = objectMapper.readValue(new File("resources/herb.json"), Herb.class);
//
//		//print customer details
//		System.out.println(herb);
//	}


