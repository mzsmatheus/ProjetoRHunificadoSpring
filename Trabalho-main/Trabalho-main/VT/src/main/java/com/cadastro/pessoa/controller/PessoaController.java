package com.cadastro.pessoa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.cadastro.pessoa.domain.Pessoa;
import com.cadastro.pessoa.service.IPessoaService;

/**
 * created by niraj on Jul, 2018
 */
@CrossOrigin(origins="http://localhost:4200") 
@RestController
@RequestMapping("/api")
public class PessoaController {
    
    @Autowired
    private IPessoaService pessoaService;
    
    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoaService.createPessoa(pessoa), HttpStatus.OK);
    }
    
    @PutMapping("/pessoa")
    public ResponseEntity<Pessoa> updatePessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoaService.createPessoa(pessoa), HttpStatus.OK);
    }

    @GetMapping("/pessoa")
    public ResponseEntity<List<Pessoa>> getAllPessoa() {
        return new ResponseEntity<>(pessoaService.getAllPessoa(), HttpStatus.OK);
    }

    @GetMapping("/pessoa/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id) {
        return new ResponseEntity<>(pessoaService.getPessoaById(id), HttpStatus.OK);
    }

    @DeleteMapping("/pessoa/{id}")
    public boolean deletePessoa(@PathVariable Long id) {
        return pessoaService.deletePessoaById(id);
    }
}
