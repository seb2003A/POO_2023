
package com.mycompany.poo;

import java.util.ArrayList;


 public class Coche {
    public int cilindraje;
    private Motor motor;  // Composición: un coche tiene un motor
   ArrayList<Motor> motores;
   
   public void funcionmotor ( int cilindraje)
   {
         Motor objMotor = new motor(cilindraje)
               motores.add(objmotor);
   }

    public Coche(int cilindraje, Motor motor, ArrayList<Motor> motores) {
        this.cilindraje = cilindraje;
        this.motor = motor;
        this.motores = motores;
    }
   
    

    public void arrancar() {
        motor.encender();
        System.out.println("Coche arrancado");
    }

    public void apagar() {
        motor.apagar();
        System.out.println("Coche apagado");
    }
}