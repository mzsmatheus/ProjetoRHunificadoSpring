package proj.rh.listatreinamento.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import proj.rh.listatreinamento.domain.Pessoa; 

@Configuration
public class InicioCargaPessoas {

    private static final Logger log = LoggerFactory.getLogger(InicioCargaPessoas.class);
    

    @Bean CommandLineRunner
    IniciarDb(PessoaRepository repository){
        return args -> {

             log.info("Teste..." + repository.save(new Pessoa("Pedro","Costa","Estoque")));
             log.info("Teste..." + repository.save(new Pessoa("Ana","Silva","Compras")));
             log.info("Teste..." + repository.save(new Pessoa("Carlos","Paiva","Produção")));

        };
    }
}

  //      DbLista(ListaRepository repository){
  //          return args -> {
  //              log.info("Teste..." + repository.save(new Lista("Lista de treinamento prod")));

