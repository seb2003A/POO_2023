
package com.mycompany.interfacepoo;

public class Interfacepoo {


    public static void main(String[] args) {
        // Crear instancias de las formas
        Cuadrado miCuadrado = new Cuadrado(5);
        Circulo miCirculo = new Circulo(3);
        Triangulo miTriangulo = new Triangulo (5, 3);
         

        // Calcular y mostrar áreas y perímetros
        System.out.println("Área del cuadrado: " + miCuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.calcularPerimetro());

        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
        
        
        System.out.println("El area del triangulo es: " + miTriangulo.CalcularAreaTriangulo());
       
        
    }
}
