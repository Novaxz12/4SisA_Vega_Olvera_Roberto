package HerenciaCalculo;

import java.util.Scanner;

public class Principal {
 
    public static void main(String[] args) {
 
        boolean enEjecucion= true;
 
 
        do{
 
        System.out.println("1.Rectangulo");
        System.out.println("2.Circulo");
        System.out.println("3.Triangulo");
        System.out.println("Seleccione una opcion");
        Scanner sc = new Scanner (System.in);
        int opcion= sc.nextInt();
 
        switch(opcion){
            case 1:{
                Rectangulo rectangulo = new Rectangulo(0,0,0,0);
                System.out.println("Para un rectangulo de alto "+ rectangulo.getAlto()+ " y de ancho "+ rectangulo.getAncho()+
                " el area del rectangulo es "+ rectangulo.getArea()+ " y su perimetro es "+
                rectangulo.getPerimetro()
                );
                break;
            }
            case 2:{
                Circulo circulo = new Circulo (0);
                System.out.println("El radio del circulo es "+ ((Object) circulo).getRadio()+ " con lo cual su area es "
                        + circulo.getArea()+ " y su perimetro es "+ circulo.getPerimetro());
                break;
            }
            case 3:{
                Triangulo triangulo = new Triangulo (0,0,0,0,0);
                System.out.println("El area del triangulo es "+ triangulo.getArea()+ " y su perimetro es "+
                        triangulo.getPerimetro());
                break;
            }
            default:{
                System.out.println("No existe la opción disponible");
            }
 
        }
            System.out.println("¿Desea realizar otra operacion? Y/N ");
            String respuesta = leerTeclado();
            if(respuesta.equalsIgnoreCase("N")){
            enEjecucion=false;
            }
 
        }while(enEjecucion);
    }
   private static String leerTeclado (){
   String retorno= "";
   try (Scanner sc = new Scanner (System.in)) {
    retorno= sc.nextLine();
}
   return retorno;
  }
}
