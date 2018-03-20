package com.example.projetoCrud.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;




@Entity
public class Aluno implements Serializable {	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private int matricula;
	
	
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date anoNascimento;
	
	@ManyToOne
	@JoinColumn(name="ID_CURSO")
	private Curso curso;
	

	public Aluno() {
		super();
	}

	

	public Aluno(Integer id, String nome, int matricula, Date anoNascimento, Curso curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
		this.curso = curso;
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



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
	
	
	
	
	

}
