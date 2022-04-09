package br.edu.up.pessoa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String dtNasc;
    private String cpf;
    private String dtContratacao;
	private double salario;
	private double vlrFerias;
    
	private double vlrTotal;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String dtNasc, String cpf, String dtContratacao, double salario, double vlrFerias, double vlrTotal) {
        this.nome = nome;
        this.email = email;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
		this.dtContratacao = dtContratacao;
		this.salario = salario;
		this.vlrFerias = vlrFerias;
		this.vlrTotal = vlrTotal;
    }

    public Pessoa(Long id, String nome, String email, String dtNasc, String cpf, String dtContratacao, double salario, double vlrFerias, double vlrTotal) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
		this.dtContratacao = dtContratacao;
		this.salario = salario;
		this.vlrFerias = vlrFerias;
		this.vlrTotal = vlrTotal;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDtContratacao() {
		return dtContratacao;
	}

	public void setDtContratacao(String dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getVlrFerias() {
		return vlrFerias;
	}

	public void setVlrFerias(double vlrFerias) {
		this.vlrFerias = vlrFerias;
	}
	
	public double getvlrTotal() {
		return vlrTotal;
	}

	public void setvlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}    
    
    
}
