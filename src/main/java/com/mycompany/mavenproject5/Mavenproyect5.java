package com.mycompany.Mavenproject5;
import static spark.Spark.*;

public class Mavenproyect5 {
    public static void main(String[] args) {
        System.out.println("Helllo World!");
        get("/hello", (req, res) -> {
            Mavenproyect5.saludar();
            return null;
        });
         get("/sumar/:a/:b", (req, res) -> {
             int parametroA = Integer.parseInt(req.params("a:"));
              int parametroB = Integer.parseInt(req.params("b:"));

           return sumar(parametroA, parametroB);
            
        });
    }
    public static String saludar() {
        System.out.println("jeiabr");
        return "jeiabr" ;
    }
       public static  int sumar(int a, int b) {
      return a + b;
    }
                       
}