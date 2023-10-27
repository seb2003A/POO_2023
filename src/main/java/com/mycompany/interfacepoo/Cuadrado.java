
package com.mycompany.interfacepoo;

   class Cuadrado implements Forma {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double CalcularAreaTriangulo() {
    return 0;
    }

 
  
}

