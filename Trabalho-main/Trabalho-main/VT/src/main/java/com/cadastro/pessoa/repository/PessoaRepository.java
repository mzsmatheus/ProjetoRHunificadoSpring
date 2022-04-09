package com.cadastro.pessoa.repository;

import com.cadastro.pessoa.domain.Pessoa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * created by niraj on Jul, 2018
 */
@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
