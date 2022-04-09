package br.edu.up.pessoa.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.pessoa.domain.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
	
	public static Pessoa calculo(Pessoa p) {
		double valorReceber = p.getSalario() / 3;
		p.setVlrFerias(valorReceber);		
		return p;	
	}
}


