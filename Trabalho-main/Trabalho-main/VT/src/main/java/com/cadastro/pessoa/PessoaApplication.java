package com.cadastro.pessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PessoaApplication {
		public static void main(String[] args) {
		SpringApplication.run(PessoaApplication.class, args);
	}

	@GetMapping 
	public String home() {
		return "Sevice Online";
	}

}
