package com.argprog.springcursosalummno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.argprog.springcursosalummno.model.Curso;
import com.argprog.springcursosalummno.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
    
    public List<Tema> findTemasByCurso(Curso curso);
}
