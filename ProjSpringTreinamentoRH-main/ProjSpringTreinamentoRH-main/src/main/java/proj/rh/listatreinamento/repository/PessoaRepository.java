package proj.rh.listatreinamento.repository;
import org.springframework.data.repository.CrudRepository;
import proj.rh.listatreinamento.domain.Pessoa;



public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    
}


