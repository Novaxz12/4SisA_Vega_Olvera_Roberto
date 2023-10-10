//esta clase es la que se encarga de las operaciones de la calculadora y 
//tambien tendra opciones para convertir unidades crear cuadritoss magicos

import java.util.Scanner;

class Ejercicios{

    Scanner entrada = new Scanner(System.in);

    //variables globales
    char op;

    //menu
    public void menu(){
        System.out.println("Ejercicios que ahi les quedan de tarea ");
        System.out.println("a- Calculadora");
        System.out.println("b- Conversion de unidades");
        System.out.println("c- Crear cuadro magico ");
        System.out.println("d- Desplazamiento de un cuadrado ");
        System.out.println("Elija la opcion deseada");

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
            default :
            System.out.println("Gracias por jugar");

        }


    }

    public void Ejercicio1(){
        //se le llaman metodos vacios porque no poseen argumentos y no son metodos 
        //o funciones que necesiten una entrada o salida de algun tipo de dato

        //calculadora
        double num1 = 0.00, suma = 0.00, multi = 1.00, division = 1.00;
        char operacion;

        System.out.println("Selecciona la operacion que deseas realizar:");
        System.out.println("a.- Suma y Resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Divisioo");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a':
                //vamos a sumar o restar tantos numeros como desee el usuario
                //cuando coloque 0 la operacion termina
                System.out.println("Para detener la suma o resta, ingrese el 0");
                do{
                    
                    System.out.println("Escriba el numero que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    //suma = suma + num1;
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + suma);
                break;
            case 'b':
            System.out.println("Para detener la multiplicacion, ingrese el 0");
                
                do{    
                    System.out.println("Escriba el numero que desee multiplicar: ");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        multi *= num1;
                        //multi = multi * num1;
                    }              
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + multi);
                break;
            case 'c':
                System.out.println("Para obtener la divicion, ingrese 0");
            //ahi hagan la division de tarea :3
            //dame un num1 / num2
                do{
                    System.out.println("Escriba el numero que desee dividir");
                    num1 = entrada.nextDouble();
                    if(num1 != 0){
                        division *= num1;
                    }
                }while (num1 != 0 );

                break;
            default:
                System.out.println("opcion no valida, ayos UwU/");
                break;
        }

    }
    public void Ejercicio2(){
        //vamos a crear un programa que se encargue de convertir 
        //kg a libras
        //m/s  a km/s
        //m a yardas y millas
        double metros = 0.00, kg = 0.00, velocidad = 3.60 , pulgada = 0.0254, gramos = 1000.00, libra = 0.453592, ms = 0.00, cm = 0.00, yarda = 1.09, millas = 0.00062;
        double conversion1, conversion2;

        System.out.println("Selecciona la cantidad que deseass convertir acorde a las siguientes unidades");
        System.out.println("a- Metros cm y pulgadas");
        System.out.println("b- kilogramos a libras y gramos ");
        System.out.println("c- m/s a km/s");
        System.out.println("d- Metros a yardas y millas ");

        op = entrada.next().charAt(0);
        switch(op){
            case 'a':
             System.out.println("Ingresa los metros que deseas transformar ");
             metros = entrada.nextDouble();
             conversion1 = metros * cm;
             conversion2 = metros * pulgada;
             System.out.println("La cantidad de metros es: " + metros + "de m a cm son: "
             + conversion1 + "de m a pulgadas son: " + conversion2);
            
             
             break;
             case 'b':
              System.out.println("Ingresa los kilogramos que deseas transformar ");

             kg = entrada.nextDouble();
             conversion1 = kg * gramos ;
             conversion2 = kg * libra;
             System.out.println("La cantidad de kg es: " + kg + "de kg a gramos son: "
             + conversion1 + "de kg a libras son: " + conversion2);
             break;
            case 'c':
             System.out.println("Ingresa los m/s que deseas a transformar");
             
             ms = entrada.nextDouble();
             conversion1 = ms * velocidad;
             System.out.println("La cantidad de m/s es: " + ms + "de m/s a km/s es: " + conversion1);   
             break;
            case 'd':
                System.out.println("Ingresa los metros que deseas convertir a yardas y millas: ");

                metros = entrada.nextDouble();

                conversion1 = metros * yarda;
                conversion2 = metros * millas;
                System.out.println("La cantidad de metros es: " + metros + "de m a yardas son: "
             + conversion1 + "de m a millas son: " + conversion2);

             break;
            default:
             System.out.println("Opcion no valida ");
             break;
           
        }
    }
    public void Ejercicio3(){
        
    }
    public void Ejercicio4(){
        
    }
}