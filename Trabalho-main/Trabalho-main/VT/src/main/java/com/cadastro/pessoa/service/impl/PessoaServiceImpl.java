package com.cadastro.pessoa.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.cadastro.pessoa.domain.Pessoa;
import com.cadastro.pessoa.repository.PessoaRepository;
import com.cadastro.pessoa.service.IPessoaService;

/**
 * created by pc on Mar, 2020
 */

@Service
public class PessoaServiceImpl implements IPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> getAllPessoa() {
        return (List<Pessoa>) pessoaRepository.findAll();
    }

    @Override
    public Pessoa getPessoaById(Long id) {
        Optional<Pessoa> dbPessoa = pessoaRepository.findById(id);
        return dbPessoa.orElse(null);
    }

    @Override
    public boolean deletePessoaById(Long id) {
        pessoaRepository.deleteById(id);
        return getPessoaById(id) == null;
    }
}
