package proj.rh.listatreinamento.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import proj.rh.listatreinamento.domain.Lista; 

@Configuration
public class InicioCargaListas {

    private static final Logger log = LoggerFactory.getLogger(InicioCargaListas.class);
    

    @Bean CommandLineRunner
    IniciarDbLista(ListaRepository repository){
        return args -> {

            log.info("Teste..." + repository.save(new Lista("Lista de treinamento da prod")));

        };
    }
}
