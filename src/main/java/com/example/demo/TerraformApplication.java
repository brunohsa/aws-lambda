package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TerraformApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerraformApplication.class, args);
		System.out.println("Iniciando o Handler do terraform");
	}

}