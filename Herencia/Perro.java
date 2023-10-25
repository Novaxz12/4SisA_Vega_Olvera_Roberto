package Herencia;


public class Perro extends Animal {
      private int num_vidas;

      public Perro(){
  
      }

      public Perro(String nombre,String raza, String tipo_alimento, int edad, int num_vidas){
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
    System.out.println("El Nombre del Perro es: "+getNombre()+"\n"
    + "La Raza del Perro es: "+getRaza()+"\n"
    +"Se Alimenta de: "+getTipo_Alimento()+"\n"
    +"El Perro tiene la edad:"+getEdad()+"\n");
}

public void mostrarPerro() {
}

}
