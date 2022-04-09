package com.cadastro.pessoa.service;

import java.util.List;

import com.cadastro.pessoa.domain.Pessoa;

/**
 * created by pc on Mar, 2020
 */
public interface IPessoaService {


    Pessoa createPessoa(Pessoa pessoa);

    List<Pessoa> getAllPessoa();

    Pessoa getPessoaById(Long id);

    boolean deletePessoaById(Long id);
}
