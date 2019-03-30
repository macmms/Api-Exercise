package com.fiix.apiexercise;

import java.io.FileReader;
import java.util.Map;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import com.opencsv.CSVReaderHeaderAware;

@SpringBootApplication
public class ApiExerciseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ApiExerciseApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("I am learning Fiix's API!");

		// Initialize your FiixCmmsClient here

		// Open the CSV file
		try (CSVReaderHeaderAware reader = new CSVReaderHeaderAware(
				new FileReader(new ClassPathResource("user-site-group-mappings.csv").getFile()))) {

			// Read in all the values
			Map<String, String> mapping;
			while ((mapping = reader.readMap()) != null) {
				System.out.println("Got mapping " + mapping);

				// Do something here...

			}
		}

	}

}
