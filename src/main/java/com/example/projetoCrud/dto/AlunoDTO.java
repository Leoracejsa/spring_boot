package com.example.projetoCrud.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.projetoCrud.repositories.CursoRepository;

public class AlunoDTO implements Serializable {
	
	@Autowired
	private CursoRepository repo;
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull
	@Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres")
	private String nome;

	
	@NotNull		
	private int matricula;
	
	private Date anoNascimento;
	
	
	private Integer curso;

	public AlunoDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public Date getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(Date anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public Integer getCurso() {
		return curso;
	}


	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	
	

}
