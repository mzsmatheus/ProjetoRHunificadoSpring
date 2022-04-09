package proj.rh.listatreinamento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class ListatreinamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListatreinamentoApplication.class, args);
	}
	@RequestMapping("/")
	public String home(){
		
return "Lista de treinamento de funcionários!";
	}

}
