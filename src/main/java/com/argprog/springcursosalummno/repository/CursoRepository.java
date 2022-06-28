package com.argprog.springcursosalummno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argprog.springcursosalummno.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
    public List<Curso> findCursosByNombreContains(String buscar);
}
