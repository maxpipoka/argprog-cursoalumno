package com.argprog.springcursosalummno.service;

import java.util.List;

import com.argprog.springcursosalummno.model.Curso;
import com.argprog.springcursosalummno.model.Tema;

public interface ITemaService {
    
    public List<Tema> getTemas();
    
    public void saveTema(Tema tema);

    public Tema findTema(Long idTema);

    public void deleteTema(Long idTema);

    public List<Tema> findTemasByCurso(Curso curso);

}
