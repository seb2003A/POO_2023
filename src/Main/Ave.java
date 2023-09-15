
package TipoAnimales;
class Ave extends Animales {
    
    private String especie;
   
   public Ave (String nombre, String tipo_alimentacion, int edad, String raza){
    super(nombre, tipo_alimentacion, edad);
    this.especie= raza;
}
  public String getEspecie(){
      return especie;
             
  }
public void setespecie (){
    this.especie = especie;
            
}
}