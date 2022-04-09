package com.cadastro.pessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//import com.cadastro.pessoa.domain.Pessoa;
import com.cadastro.pessoa.domain.ValeTrans;
import com.cadastro.pessoa.service.IValeTransService;

/**
 * created by niraj on Jul, 2018
 */
@CrossOrigin(origins="http://localhost:4200") 
@RestController
@RequestMapping("/api")
public class ValeTransController {

    PessoaController p = new PessoaController();
    
    @Autowired
    private IValeTransService ValeTransService;
    
    @PostMapping("/ValeTrans")
    public ResponseEntity<ValeTrans> saveValeTrans(@RequestBody ValeTrans ValeTrans) {
        return new ResponseEntity<>(ValeTransService.createValeTrans(ValeTrans), HttpStatus.OK);
    }
    
    @PutMapping("/ValeTrans")
    public ResponseEntity<ValeTrans> updateValeTrans(@RequestBody ValeTrans ValeTrans) {
        return new ResponseEntity<>(ValeTransService.createValeTrans(ValeTrans), HttpStatus.OK);
    }

    @GetMapping("/ValeTrans")
    public ResponseEntity<List<ValeTrans>> getAllValeTrans() {
        return new ResponseEntity<>(ValeTransService.getAllValeTrans(), HttpStatus.OK);
    }

    @GetMapping("/ValeTrans/{id}")
    public ResponseEntity<ValeTrans> getValeTransById(@PathVariable Long id) {
        return new ResponseEntity<>(ValeTransService.getValeTransById(id), HttpStatus.OK);
    }

    @DeleteMapping("/ValeTrans/{id}")
    public boolean deleteValeTrans(@PathVariable Long id) {
        return ValeTransService.deleteValeTransById(id);
    }

   // @GetMapping("/ValeTransTotal")
   // public float getValeTransTotal(){
    //    float valortotal = 0;
    //   ResponseEntity<List<Pessoa>> pessoa = p.getAllPessoa();
    //   for (int i =0; i< pessoa.length(); i++) {
     //      ValeTrans v = getValeTransById(p.id);
    //       float valor = v.quantidade * v.valor;
    //         valortotal = valortotal + valor;
    //   }
    //    return valortotal;

   // }
}
