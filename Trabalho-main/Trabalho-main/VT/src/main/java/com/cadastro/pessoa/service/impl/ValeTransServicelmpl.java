package com.cadastro.pessoa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.cadastro.pessoa.domain.ValeTrans;
import com.cadastro.pessoa.repository.ValeTransRepository;
import com.cadastro.pessoa.service.IValeTransService;

/**
 * created by pc on Mar, 2020
 */

@Service
public class ValeTransServicelmpl implements IValeTransService {

    @Autowired
    private ValeTransRepository ValeTransRepository;


    @Override
    public ValeTrans createValeTrans(ValeTrans ValeTrans) {
        return ValeTransRepository.save(ValeTrans);
    }

    @Override
    public List<ValeTrans> getAllValeTrans() {
        return (List<ValeTrans>) ValeTransRepository.findAll();
    }

    @Override
    public ValeTrans getValeTransById(Long id) {
        Optional<ValeTrans> dbPessoa = ValeTransRepository.findById(id);
        return dbPessoa.orElse(null);
    }

    @Override
    public boolean deleteValeTransById(Long id) {
        ValeTransRepository.deleteById(id);
        return getValeTransById(id) == null;
    }
}
