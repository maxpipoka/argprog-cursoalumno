package com.argprog.springcursosalummno.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.argprog.springcursosalummno.model.Curso;
import com.argprog.springcursosalummno.model.Tema;
import com.argprog.springcursosalummno.repository.TemaRepository;

@Service
public class TemaService {
    
    private TemaRepository temaRepository;

    public List<Tema> getTemas(){
        return temaRepository.findAll();
    }
    
    public void saveTema(Tema tema){
        temaRepository.save(tema);
    }

    public Tema findTema( Long idTema){
        Tema findedTema = temaRepository.findById(idTema).orElse(null);
        return findedTema;
    }

    public void deleteTema(Long idTema){
        temaRepository.deleteById(idTema);
    }

    public List<Tema> findTemasByCurso(Curso curso){
        return temaRepository.findTemasByCurso(curso);
    }
}
