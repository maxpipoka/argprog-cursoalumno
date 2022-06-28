package com.argprog.springcursosalummno.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.argprog.springcursosalummno.model.Curso;
import com.argprog.springcursosalummno.repository.CursoRepository;

@Service
public class CursoService implements ICursoService{
    
    private CursoRepository cursoRepository;
    
    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long idCurso) {
        cursoRepository.deleteById(idCurso);
    }

    @Override
    public Curso findCurso(Long idCurso) {
        Curso findedCurso = cursoRepository.findById(idCurso).orElse(null);
        return findedCurso;
    }

    public List<Curso> findCursosByNombreContains(String buscar){
        return cursoRepository.findCursosByNombreContains(buscar);
    }
}
