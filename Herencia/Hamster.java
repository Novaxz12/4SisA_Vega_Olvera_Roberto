package Herencia;

 public class Hamster extends Animal {
      private int num_vidas;
  
      public Hamster(){
  
      }
  
      public Hamster(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre,raza,tipo_alimento, num_vidas);
        this.num_vidas = num_vidas;
      }
  
      public void setnum_vidas(int num_vidas){
          this.num_vidas = num_vidas;
      }
  
      public int getnum_vidas(){
          return num_vidas;
      }
  
      public void mostrarCapibara(){
          System.out.println("El Nombre del Hamster es: "+getNombre()+"\n"
          + "La Raza del Hamster es: "+getRaza()+"\n"
          +"Se Alimenta de: "+getTipo_Alimento()+"\n"
          +"El Hamster tiene la edad:"+getEdad()+"\n");
      }

	public void mostrarHamster() {
	}
  }

     








