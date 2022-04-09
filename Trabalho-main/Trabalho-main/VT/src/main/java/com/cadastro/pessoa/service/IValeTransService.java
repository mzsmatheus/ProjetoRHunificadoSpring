package com.cadastro.pessoa.service;

import java.util.List;


import com.cadastro.pessoa.domain.ValeTrans;

/**
 * created by pc on Mar, 2020
 */
public interface IValeTransService {


    ValeTrans createValeTrans(ValeTrans ValeTrans);

    List<ValeTrans> getAllValeTrans();

    ValeTrans getValeTransById(Long id);

    boolean deleteValeTransById(Long id);
}