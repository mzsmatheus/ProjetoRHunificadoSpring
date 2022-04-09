package com.example.projetoplanosaude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PlanosaudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanosaudeApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "http://localhost:8080/";

	}
}
