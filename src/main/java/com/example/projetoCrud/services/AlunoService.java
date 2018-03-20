package com.example.projetoCrud.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoCrud.domain.Aluno;
import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.dto.AlunoDTO;
import com.example.projetoCrud.repositories.AlunoRepository;
import com.example.projetoCrud.repositories.CursoRepository;

@Service
public class AlunoService {
	
		
		@Autowired
		AlunoRepository repo;
		
		@Autowired
		CursoRepository cursoRepo;



		public Aluno find(Integer id) {

			
			Aluno obj = repo.findOne(id);			
			return obj;
			
			
		}

		public Aluno insert(Aluno obj) {
			obj.setId(null);			
			obj = repo.save(obj);			
			return obj;
		}

		public Aluno update(Aluno obj) {
			Aluno aluno = find(obj.getId());			
			return repo.save(aluno);
		}

		public void delete(Integer id) {
			find(id);
			repo.delete(id);
			
		}	
			
		

		public List<Aluno> findAll() {
			return repo.findAll();
		}
		
		public Aluno fromDto(AlunoDTO dto) {
			Aluno al = new Aluno(dto.getId(), dto.getNome(), dto.getMatricula(), dto.getAnoNascimento(), null);
			Curso curso = cursoRepo.findOne(dto.getCurso());
			al.setCurso(curso);
			return al;
		}

		
	}

