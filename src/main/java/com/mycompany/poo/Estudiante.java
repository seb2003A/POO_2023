
package com.mycompany.poo;

import java.util.ArrayList;
import java.util.List;



   public  class Estudiante {
    private String nombre;
    private List<Curso> cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }
} 

