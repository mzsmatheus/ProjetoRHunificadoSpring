package proj.rh.listatreinamento.repository;
import org.springframework.data.repository.CrudRepository;
import proj.rh.listatreinamento.domain.Lista;



public interface ListaRepository extends CrudRepository<Lista, Long> {
    
}
