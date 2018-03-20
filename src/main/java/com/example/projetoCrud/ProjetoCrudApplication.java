package com.example.projetoCrud;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projetoCrud.domain.Aluno;
import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.repositories.AlunoRepository;
import com.example.projetoCrud.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoCrudApplication implements CommandLineRunner {
	@Autowired
	CursoRepository repo;
	
	@Autowired
	AlunoRepository repoAluno;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCrudApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		Curso curso1 = new Curso(null, 53, "Sistema de Informação");
		Curso curso2 = new Curso(null, 50, "Serviço Social");
		Curso curso3 = new Curso(null, 55, "Enfermagem");
		repo.save(Arrays.asList(curso1,curso2));
		
		Aluno aluno = new Aluno(null, "Leonardo Silva", 530343, null, curso1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		aluno.setAnoNascimento(sdf.parse("26/06/1997"));
		repoAluno.save(aluno);
		
		Aluno aluno1 = new Aluno(null, "Marcelo ", 546343, null, curso2);
		SimpleDateFormat sdfs = new SimpleDateFormat("dd/MM/yyyy");
		aluno1.setAnoNascimento(sdfs.parse("26/04/1999"));
		repoAluno.save(aluno1);
		
		Aluno aluno2 = new Aluno(null, "Thiago ", 5624785, null, curso2);
		SimpleDateFormat sdfss = new SimpleDateFormat("dd/MM/yyyy");
		aluno2.setAnoNascimento(sdfs.parse("12/07/1982"));
		repoAluno.save(aluno2);

	}
}
