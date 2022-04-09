package com.cadastro.pessoa.repository;

import com.cadastro.pessoa.domain.ValeTrans;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValeTransRepository extends CrudRepository<ValeTrans, Long> {

}