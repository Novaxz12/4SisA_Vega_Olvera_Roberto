//esta clase es la que se encarga de las operaciones de la calculadora y 
//tambien tendra opciones para convertir unidades crear cuadritos magicos

import java.util.Scanner;

class Ejercicio{
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    //variable globales
    char op;

    //menu
    public void menu(){
        System.out.println("Ejercicios que ahi les quedan de tarea"); 
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadro magico");
        System.out.println("d.- Dezplazamiento de un cuadrito");
        System.out.println("Elija una opcion deseada");

        op = entrada.next().charAt(0);

        switch(op){

        case 'a' :
            //implementamos los metodos
            Ejercicio1();
            break;
        case 'b' :
            Ejercicio2();
            break;
        case 'c' :
            Ejercicio3();
            break;
        case 'd' :
            Ejercicio4();
            break;

        default:
            System.out.println("Gracias por jugar :3");

        }
    }
    public void Ejercicio1(){

    }

    public void Ejercicio2(){

     }

    public void Ejercicio3(){

     }

    public void Ejercicio4(){


    }

  }
