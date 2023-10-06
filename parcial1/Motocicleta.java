
package parcial1;

public class Motocicleta extends Vehiculo{
   
    private double cilindrada;

    public Motocicleta(String marca, String modelo, int año, String propietario, String placa, double cilindrada) {
        super(marca, modelo, año, propietario, placa);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        int añosEnCirculacion = 2023 - getAño();
        System.out.println("Años en circulacion: " + añosEnCirculacion);
        System.out.println("placa: " + placa);
         String placa = getPlaca();
    }
    
}

