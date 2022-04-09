package com.example.projetoplanosaude.repository;

import com.example.projetoplanosaude.domain.PlanoSaude;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargaInicial {

    private static final Logger log = LoggerFactory.getLogger(CargaInicial.class);

    @Bean CommandLineRunner
    iniciarDb(PlanoSaudeRepository repository){
        return args -> {
            PlanoSaude planosaude = new PlanoSaude();
            planosaude.setnomePlano("Unimed");
            planosaude.setValorIndividual(10);
            planosaude.setValorFamiliar(20);
            log.info("Carregando..." + repository.save(planosaude));

            PlanoSaude planosaude2 = new PlanoSaude();
            planosaude2.setnomePlano("Amil");
            planosaude2.setValorIndividual(35);
            planosaude2.setValorFamiliar(25);
            log.info("Carregando..." + repository.save(planosaude2));
        };
    }
    
}

