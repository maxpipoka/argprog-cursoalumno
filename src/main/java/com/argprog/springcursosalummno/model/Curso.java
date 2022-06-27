package com.argprog.springcursosalummno.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "cursos")
@Getter @Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCurso;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String tipoCurso;

    @Column(nullable = false)
    private Date fechaFinalizacion;
    
    @Column(nullable = false)
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    public Curso(long idCurso, String nombre, String tipoCurso, Date fechaFinalizacion, List<Tema> listaDeTemas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.tipoCurso = tipoCurso;
        this.fechaFinalizacion = fechaFinalizacion;
        this.listaDeTemas = listaDeTemas;
    }

    
}
