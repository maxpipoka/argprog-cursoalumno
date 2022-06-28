package com.argprog.springcursosalummno.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaFinalizacion;
    


    public Curso() {
    }

    public Curso(long idCurso, String nombre, String tipoCurso, Date fechaFinalizacion) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.tipoCurso = tipoCurso;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
