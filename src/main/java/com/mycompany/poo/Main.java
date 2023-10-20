
package com.mycompany.poo;

public class Main {

      public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("María");

        // Crear departamento
        Departamento departamento = new Departamento("Recursos Humanos");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Mostrar información
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Empleados:");
        for (Empleado empleado : departamento.getEmpleados()) {
            System.out.println("- " + empleado.getNombre());
        }
      // Crear cursos
        Curso curso1 = new Curso("Matemáticas");
        Curso curso2 = new Curso("Historia");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("María");

        // Asociar estudiantes con cursos
        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso2);
        estudiante2.agregarCurso(curso1);

        // Mostrar información
        System.out.println("Estudiante: " + estudiante1.getNombre());
        System.out.println("Cursos:");
        for (Curso curso : estudiante1.getCursos()) {
            System.out.println("- " + curso.getNombre());
        }

        System.out.println("\nEstudiante: " + estudiante2.getNombre());
        System.out.println("Cursos:");
        for (Curso curso : estudiante2.getCursos()) {
            System.out.println("- " + curso.getNombre());
        }
          // Crear un coche
        Coche miCoche = new Coche();

        // Arrancar y apagar el coche
        miCoche.arrancar();
        miCoche.apagar();
    }
    }

