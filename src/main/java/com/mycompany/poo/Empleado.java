
package com.mycompany.poo;

// Clase Empleado
 public class Empleado {
    private Departamento departamentoRef; 
    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}