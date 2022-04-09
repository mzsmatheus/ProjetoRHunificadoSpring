package com.cadastro.pessoa.domain;
import java.util.Date;

import javax.persistence.*;

/**
 * created by niraj on Jul, 2018
 */
@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    private Long id;
    private String nome;
    private Date admissao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id.toString() + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

