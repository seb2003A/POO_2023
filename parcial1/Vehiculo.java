
package parcial1;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String propietario;
    public String placa;
    
    public Vehiculo(String marca, String modelo, int año, String propietario, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.propietario = propietario;
        this.placa = placa ;
    }

  public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + año);
        System.out.println("Propietario: " + propietario);
        System.out.println("placa:"+ placa);
    }
     
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }
    
}




