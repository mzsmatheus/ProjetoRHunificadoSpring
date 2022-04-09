package com.example.projetoplanosaude.repository;


import com.example.projetoplanosaude.domain.PlanoSaude;

import org.springframework.data.repository.CrudRepository;

public interface PlanoSaudeRepository extends CrudRepository<PlanoSaude, Long> {
    
}
