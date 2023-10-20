/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;


public class Motor {
private Coche cocheRef; 
int cilindraje; 
    public void encender() {
        System.out.println("Motor encendido");
    }

    public void apagar() {
        System.out.println("Motor apagado");
    }
    public Motor (int cilin)
    {
        cilindraje = cilin;
    }
}