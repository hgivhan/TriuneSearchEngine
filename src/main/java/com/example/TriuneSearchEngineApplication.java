package com.example;

import com.example.Models.Herb;
import com.example.Services.HerbService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@SpringBootApplication
public class TriuneSearchEngineApplication {
	public static void main(String[] args) {
		SpringApplication.run(TriuneSearchEngineApplication.class, args);
	}

	@Bean
	CommandLineRunner clr(HerbService herbService){
		return args -> { //read and load JSON
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Herb>> typeRef = new TypeReference<List<Herb>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/herb.json");
			try{
				List<Herb> herbs = mapper.readValue(inputStream, typeRef);
				herbService.save(herbs);
				System.out.println("Herbs saved!");
			}
			catch(IOException e){
				System.out.println("unable to save herbs" + e.getMessage());
			}

		};
//	tutorial I might start over with:	https://www.youtube.com/watch?v=rGdKmF2UzSc

	}
}
