package com.argprog.springcursosalummno.service;

import java.util.List;
import com.argprog.springcursosalummno.model.Curso;

public interface ICursoService {
    
    public void saveCurso(Curso curso);

    public Curso findCurso(Long idCurso);

    public void deleteCurso(Long idCurso);

    public List<Curso> getCursos();
}
