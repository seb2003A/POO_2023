
class Gato extends Animales {
    
    private String raza;
   
   public Gato(String nombre, String tipo_alimentacion, int edad, String raza){
    super(nombre, tipo_alimentacion, edad);
    this.raza= raza;
}
  public String getRaza(){
      return raza;
             
  }
public void setRaza(String raza){
    this.raza = raza;
            
}
public void sonidoAnimal(){
    System.out.println("gua");
}
}