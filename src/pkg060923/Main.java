package pkg060923;

import excercise.Person;

public class Main {

    public static void main(String[] args) {
        
        int limitObjet = 3;
        Person[] arrayPerson = new Person [limitObjet];

         arrayPerson[0] = new Person("jei", "123344", "colombia");
         arrayPerson[1] = new Person("kanan", "1233344", "colombia" );
 arrayPerson[2] = new Person("kanan", "1233344", "colombia" );
    
 
 for (Person person: arrayPerson){
        System.out.println("N: " + person.getName());
        System.out.println("D:"+ person.getDocument());
        System.out.println("C:" + person.getCity());
        
    }

     }

}
//generar un ciclo para guardar estos datos en los limite que el programa defina ingresando todo por teclado