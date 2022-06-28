package com.argprog.springcursosalummno.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.springcursosalummno.model.Curso;
import com.argprog.springcursosalummno.model.Tema;
import com.argprog.springcursosalummno.service.ITemaService;

@RestController
public class TemaController {

    private ITemaService temaService;
    
    @GetMapping("/temas/traer")
    public List<Tema> getTemas(){
        return temaService.getTemas();
    }

    @PostMapping("/temas/guardar")
    public void saveTema(@RequestBody Tema tema){
        temaService.saveTema(tema);
    }

    @GetMapping("/temas/traer/{curso}")
    public List<Tema> findTemasByCurso(@PathVariable Curso curso){
        return temaService.findTemasByCurso(curso);
    }

    @PutMapping("/temas/editar/{idTema}")
    public void editTema(@PathVariable Long idTema,
                        @RequestParam("nombre") String nuevoNombre,
                        @RequestParam("descripcion") String nuevaDescripcion){
    Tema temaEditar = temaService.findTema(idTema);
    
    temaEditar.setNombre(nuevoNombre);
    temaEditar.setDescripcion(nuevaDescripcion);

    temaService.saveTema(temaEditar);
                        }

}
