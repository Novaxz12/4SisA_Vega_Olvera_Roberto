package Herencia;

public class Peces extends Animal {
      private int num_vidas;
  
      public Peces(){
  
      }
  
      public Peces(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
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
          System.out.println("El Nombre del Pez es: "+getNombre()+"\n"
          + "La Raza del Pez es: "+getRaza()+"\n"
          +"Se Alimenta de: "+getTipo_Alimento()+"\n"
          +"El Pez tiene la edad:"+getEdad()+"\n");
      }

    public void mostrarPeces() {
    }

    public void mostrarTortuga() {
    }
  }

     









