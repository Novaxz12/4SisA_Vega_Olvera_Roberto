package Herencia;

 public class Tortuga extends Animal {
      private int num_vidas;
  
      public Tortuga(){
  
      }
  
      public Tortuga(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
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
          System.out.println("El Nombre del Tortuga es: "+getNombre()+"\n"
          + "La Raza del Tortuga es: "+getRaza()+"\n"
          +"Se Alimenta de: "+getTipo_Alimento()+"\n"
          +"El Tortuga tiene la edad:"+getEdad()+"\n");
      }
  }

     








