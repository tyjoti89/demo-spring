package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		try {
			File f = File.createTempFile("test", ".txt");
			System.out.println("File created: " + f.getAbsolutePath());
			if (f.delete()) {
				System.out.println("Successfully deleted file");
			} else {
				System.out.println("Failed to delete file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
