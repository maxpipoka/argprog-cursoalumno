package com.argprog.springcursosalummno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argprog.springcursosalummno.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
    
}
