package com.example.projetoCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetoCrud.domain.Curso;



@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
	
	
}