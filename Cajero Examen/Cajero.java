/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cajero;

import java.util.Scanner;

/**
 *
 * @author HPSPECTRE-ROBERTO
 */
////////////LO hice yo solo VEGA OLVERA ROBERTO///////
////////////LO hice yo solo VEGA OLVERA ROBERTO///////
////////////LO hice yo solo VEGA OLVERA ROBERTO///////
public class Cajero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldo = 2000, retiro =0, deposito =0, opcion =0;
        int aux1;
        String aux2;
        
        
        do{System.out.println("BIENVENIDO AL BANCO DELFINO");
        System.out.println("""
                           Elige una opcion
                           1.-Consultar saldo
                           2.-Retirar efectivo
                           3.-Depositar efectivo
                           4.-Salir""");
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1: System.out.println("Tu saldo es: "+saldo+ " pesos Mexicanitos");break;
            
            case 2: System.out.println("Ingrese la cantidad a retirar");
            retiro = entrada.nextInt();
            aux1 = retiro ;
            aux2 = Integer.toString(aux1);
            
            if((aux2.charAt(aux2.length()-1) == '0') &&(aux2.charAt(aux2.length()-2 )== '0' || aux2.charAt(aux2.length()-2 )== '5' )){
            if(retiro > saldo){
            System.out.println("Saldo insuficiente");
            }else{
            saldo = saldo - retiro;
            System.out.println("Tu saldo restante es: "+saldo+" pesos Mexicanitos");      
            }
            }else{
             System.out.println("No se puede esa cantidad, ingrese una nueva por fa");
            }
           
            
            
            break;
            
            case 3: System.out.println("Cuanto desea depositar ");
            deposito = entrada.nextInt();
            saldo = saldo + deposito;
            System.out.println("Tu saldo es: "+saldo+" pesos Mexicanitos");break;
            
            case 4: 
            System.out.println("Hasta luego, gracias por usar el BANCO DELFINO, Y NO REGRESE");
       
        }
        
    
    }while(opcion != 4);
    }
}
