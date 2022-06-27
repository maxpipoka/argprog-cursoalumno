package com.argprog.springcursosalummno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "temas")
@Getter @Setter
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTema;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="idCurso", nullable = false)
    private Curso curso;

    public Tema() {
    }

    public Tema(Long idTema, String nombre, String descripcion, Curso curso) {
        this.idTema = idTema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curso = curso;
    }

    
}
