
package TipoAnimales;

class Caballo extends Animales {
    
    private String raza;
   
  public Caballo(String nombre, String tipo_alimentacion, int edad, String raza){
    super(nombre, tipo_alimentacion, edad);
    this.raza= raza;
}
  public String getRaza(){
      return raza;
             
  }
public void setRaza(String raza){
    this.raza = raza;
            
}
}