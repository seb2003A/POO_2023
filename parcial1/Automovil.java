
package parcial1;


public class Automovil extends Vehiculo {
  
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int año, String propietario, int numeroPuertas, String placa) {
        super(marca, modelo, año, propietario, placa);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
     public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
        int añosEnCirculacion = 2023 - getAño();
        System.out.println("Años en circulación: " + añosEnCirculacion);
         System.out.println("placa: " + placa);
         String placa = getPlaca();
    }
}  

