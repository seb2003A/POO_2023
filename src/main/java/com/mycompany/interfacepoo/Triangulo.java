
package com.mycompany.interfacepoo;

public class Triangulo implements Forma {
     int base;
     int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }  
    
   
     @Override
     public double  CalcularAreaTriangulo(){
         return (base*altura)/2;
     } 

    @Override
    public double calcularArea() {
       return 0;
    }

    @Override
    public double calcularPerimetro() {
      return 0;
    }
}
