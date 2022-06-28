package com.argprog.springcursosalummno.controller;

import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.springcursosalummno.model.Curso;
import com.argprog.springcursosalummno.service.ICursoService;

@RestController
public class CursoController {
    
    private ICursoService cursoService;

    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }

    @PostMapping("/cursos/guardar")
    public void saveCurso(@RequestBody Curso curso){
        cursoService.saveCurso(curso);
    }

    @GetMapping("/cursos/contiene/{buscar}")
    public List<Curso> findCursosNombreContains(@PathVariable String buscar){
        return cursoService.findCursosByNombreContains(buscar);
    }

    @PutMapping("/cursos/editar/{idCurso}")
    public void editCurso(Long idCurso,
                            @RequestParam("nombre") String nuevoNombre,
                            @RequestParam("tipoCurso") String nuevoTipo,
                            @RequestParam("fechaFinalizacioin") Date nuevaFecha){
        Curso cursoEditar = cursoService.findCurso(idCurso);

        cursoEditar.setNombre(nuevoNombre);
        cursoEditar.setTipoCurso(nuevoTipo);
        cursoEditar.setFechaFinalizacion(nuevaFecha);

        cursoService.saveCurso(cursoEditar);


    }


}
