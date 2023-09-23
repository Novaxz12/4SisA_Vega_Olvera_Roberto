//debe de tner una clase
//public class / class es lo mismo

//variable int num por defecto publico int num
//Libreria
import java.io.*;


class Entradadetexto{

    //debe de existir un metodo principal
    /*
     * @param args
     * @throws IOException
     */
    public static void mian (String[]args) throws IOException{

        //debemos de crear  estructura basica
        //declaracion
        String nombre ;
        //mensaje para el usuario
        System.out.print("Por favor ingresa tu nombre");
        //ln es para salto de linea

        //asignar que operacion o comportamiento le voy a otorgar ala variable
        //nombre = System.console().read();
        nombre = System.console().readLine();
     
        //System, es la clase del sistema
        //console() es el metodo que puede obtener los datos de la consola
        //readLine () es el metodo que puede dar lectura a los datos introducidos en la consola

        System.out.println("Hola " + nombre + " Bienvenido a tronar wiii ");


    }


} 