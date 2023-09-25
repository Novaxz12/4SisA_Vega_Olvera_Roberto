/*
Vamos a crear un programa en el cual debemos tener un menu de seleccion
para elegir alguna de las siguientes 14 opciones:
1. Bono o descuento por edad
2. Convertir numeros decimales a binarios
3. Convertir temperaturas
4. Numero de positivos y negativos
5. Tiendita
6. Area y perimetro
7. Tabla
8. Factorial
9. Dibujos
10. Figura Hueca
11. Patron
12. Diamante
13. Calculadora
14. Salir
*/

//declarar cuales son las librerias que se van a ocupar
//se debe estructurar el tipo de dato acorde a su entrada
// si es entero obtenerlo como entero, si es char obtenerlo como caracter,
import java.util.Scanner;

class EstructuraControl{

    //metodo principal
    public static void main(String[] args){
        //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
        //para hacer una instancia, es necesario 1. Identificar el tipo objeto
        // 2. Nombrar al objeto
        // 3. Crear al objeto
        Scanner entrada = new Scanner(System.in);
        //crear una instancia del objeto de la entrada por defect de la computadora 
        //vamos a identificar con Scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que se va a poder identificar si es int, double, flot, etc.


        //es declarar a las variables que se van a utilizar en el programa
        //las variables son de dos tipos globales y locales
        //si la declaro dentro de un metodo es local

        int opcion, numbinario, total, cantidadproducto, num1, lado, lado1, lado2, lado3, base, altura, edad, rst=0, ent=200;
        float precio, resultado = 0, compra=0, area, perimetro, radio;
        double pi=3.1416, radiocir, perimetrocir, areacir, gradoC, gradoF, gradoK;
        String nombreproducto;
        String binario = "";
        char letra;

        do{
            //aqui va todo el programa
            System.out.println("Bienvenido al programa :3 ");
            System.out.println("Elija alguna de las siguientes opciones: ");
            System.out.println("1. Descuento por edad ");
            System.out.println("2. Convertir numero decimal a binario "); //profe*
            System.out.println("3. Convertir temperaturas ");
            System.out.println("4. Numeros positivos y negativos ");//mi* 
            System.out.println("5. Tiendita "); //profe*
            System.out.println("6. Area y perimetro ");
            System.out.println("7. Tabla "); //profe
            System.out.println("8. Factorial ");
            System.out.println("9. Dibujo "); //profe
            System.out.println("10. Figura Hueca ");
            System.out.println("11. Patrones de codigo ");
            System.out.println("12. Diamante ");
            System.out.println("13. Calculadora ");
            System.out.println("14. Salir ");

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    //Descuento por edad 
                    System.out.println("Bienvenidos al museo de historia");
                    System.out.println("Compra de entradas a $200, descuento de acuerdo a edades");
                    System.out.println("Que edad tienes");
                    edad = entrada.nextInt();

                    if(edad >= 18){
                        System.out.println("Eres un mayor de edad y tu descuento es del 25%");
                        rst = (int) (ent*0.25);
                        ent = ent-rst;
                        System.out.println("La entrada con descuento es de:" + ent);
                    }

                    if(edad <= 17 && edad >= 6){
                        System.out.println("Eres un menor de edad y tu descuento es del 50%");
                        rst = (int) (ent*0.50);
                        ent = ent-rst;
                        System.out.println("La entrada con descuento es de:" + ent);
                    }

                    if(edad < 6){
                        System.out.println("Eres un niño, el descuento es del 75%");
                        rst = (int) (ent*0.75);
                        ent = ent-rst;
                        System.out.println("La entrada con descuento es de:" + ent);
                    }
                    if(edad == 0){
                        System.out.println("Error");
                    }

                    break;
                case 2:
                    //decimal a binario
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    //primero tengo que saber que sea positivo
                    if(numbinario > 0){
                        //se cuantas veces el numero se va a dividir entre 2
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                        }else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                    }    

                    }else if(numbinario == 0 ){
                        binario = "0" + binario;

                    }else if(numbinario < 0){
                        binario = "No se puede convertir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;

                case 3:
                    //Convertir temperaturas
                    System.out.println("Elija cual opcion desea convertir");
                    System.out.println("1. Celsius a Fahrenheit");
                    System.out.println("2. Fahrenheit a Kelvin");
                    System.out.println("3. Kelvin a Celsius");

                    opcion = entrada.nextInt();
                    switch (opcion){
                        case 1:
                        System.out.println("Introduzca los grados Celsius");
                        gradoC = entrada.nextDouble();

                        gradoF = 9/5 * gradoC + 32;
                        
                        System.out.println("El resultado es: " + gradoF);
                            break;

                        case 2:
                        System.out.println("Introduzca los grados Fahrenheit");
                        gradoF = entrada.nextDouble();

                        gradoK = gradoF - 32/1.8 + 273.15;

                        System.out.println("El resultado es: " + gradoK);
                            break;
                        case 3:
                        System.out.println("Introduzca los grados Kelvin");
                        gradoK = entrada.nextDouble();

                        gradoC = gradoK - 273.15;

                        System.out.println("El resultado es: " + gradoC);
                            break;
                    }
                    break;
                    
                case 4:
                    //numeros positivos y negativos
                    for(int i = 1; i <= 5; i++){
                    System.out.println("Introduzca un numero: ");
                    num1 = entrada.nextInt();

                    if(num1 > 0){
                        System.out.println("El numero ingresado es positivo");
                    }

                    else if(num1 < 0){
                        System.out.println("El numero ingresado es negativo");
                    }

                    else if(num1 == 0){
                        System.out.println("El numero es neutro: 0");
                    }
                }
                    break;
                    
                case 5:
                    //tiendita
                    System.out.println("Bienvenido a la tiendita");
                    System.out.println("Por favor, introduzca el numero de productos que desea comprar: ");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Introduzca el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Introduzca el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Introduzca la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        //operacion
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado; //compra += resultado
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    //Area y perimetro
                    System.out.println("¿De que figura desea calcular el area y perimetro?");
                    System.out.println("Por favor, seleccione la figura que desea calcular");
                    System.out.println("1. Area y perimetro de un circulo ");
                    System.out.println("2. Area y perimetro de un cuadrado ");
                    System.out.println("3. Area y perimetro de un triangulo ");
                     opcion = entrada.nextInt();
                     switch (opcion){
                        case 1:
                        System.out.println("Introduzca el radio del circulo");
                        radiocir = entrada.nextInt();

                        perimetrocir = 2 * pi * radiocir;
                        areacir = pi*radiocir*radiocir; 

                        System.out.println("El perimetro del circulo es: " + perimetrocir);
                        System.out.println("El area del circulo es: " + areacir);

                            break;

                        case 2:
                        System.out.println("Introduzca el lado del cuadrado en cm");
                        lado = entrada.nextInt();

                        area = lado * lado;
                        perimetro = lado + lado + lado + lado;

                        System.out.println("El area el cuadrado es: cm2" + area);
                        System.out.println("El perimetro del cuadrado es: cm" + perimetro);

                            break;

                        case 3:
                        System.out.println("Introduzca los lados del triangulo en cm");
                        System.out.println("1er lado");                        
                        lado1 = entrada.nextInt();
                        System.out.println("2do lado");
                        lado2 = entrada.nextInt();
                        System.out.println("3er lado");
                        lado3 = entrada.nextInt();
                        System.out.println("Introduzca el valor de la base");
                        base = entrada.nextInt();
                        System.out.println("Introduzca el valor de la altura");
                        altura = entrada.nextInt();

                        perimetro = lado1 + lado2 + lado3;
                        area = base * altura/2;

                        System.out.println("El perimetro del triangulo es: cm" + perimetro);
                        System.out.println("El area del triangulo es: cm2" + area);

                            break;
                     }
                    break;
                case 7:
                class ModeloDatos extends AbstractTableModel {
                    Object datos[][] = {
                      {"uno","dos","tres","cuatro"},
                      {"cinco","seis","siete","ocho"},
                      {"nueve","diez","once","doce"},
                     };
                      class TablaListener implements TableModelListener {
                      public void tableChanged( TableModelEvent evt ) {
                       for( int i=0; i < datos.length; i++ ) {
                           for( int j=0; j < datos[0].length; j++ )
                              System.out.print( datos[i][j] + " " );
                              System.out.println();
                        }
                       }
                      }
                     ModeloDatos() {
                     addTableModelListener( new TablaListener() );
                     }
                     public int getColumnCount() { 
                     return( datos[0].length ); 
                     }
                     public int getRowCount() { 
                     return( datos.length );
                     }
                     public Object getValueAt( int fila,int col ) { 
                     return( datos[fila][col] ); 
                     }
                     public void setValueAt( Object valor,int fila,int col ) {
                     datos[fila][col] = valor;
                     fireTableDataChanged();
                     }
                     public boolean isCellEditable( int fila,int col ) { 
                     return( true ); 
                     }
                     }       
                     public class java1416 extends JPanel {
                     public java1416() {
                     setLayout( new BorderLayout() );
                     JTable tabla = new JTable( new ModeloDatos() );
                     JScrollPane panel = new JScrollPane( tabla );
                     add( panel,BorderLayout.CENTER );
                     }
                     public static void main(String args[]) {
                     JFrame frame = new JFrame( "Tutorial de Java, Swing" );
                     frame.addWindowListener( new WindowAdapter() {
                     public void windowClosing( WindowEvent evt ) {
                     System.exit( 0 );
                     }
                     } );
                     frame.getContentPane().add( new java1416(),BorderLayout.CENTER );
                     frame.setSize( 200,200 );
                     frame.setVisible( true );
                     }
            }
                    break;
                case 9:
                System.out.print("Introduce un numero entero >= 0: ");
                 n = entrada.nextInt();
                 if(n > 0){
                   for (int i = 1; i <= n; i++) {
                   factorial = factorial * i;
                   System.out.printf("%d! = %.0f %n", n, factorial);
                  }
                  }else(n <= 0) {
                     System.out.println("Ingresa un Numero Mayor a 0");
        }
                    break;
                case 10:
                import java.util.Scanner;

public class CuadradoAsteriscos {
    public static void main(String[] args) {
        
       
Scanner entrada = new Scanner(System.in);
        
        // Solicitar al usuario ingresar el lado del cuadrado
        System.out.print(
        System.out.print

        System.out

       
"Ingrese el lado del cuadrado (entre 1 y 20): ");
        int lado = entrada.nextInt();
        
        // Verificar que el lado esté en el rango válido
        if (lado < 1 || lado > 20) {
            System.out.println(
          

           
"El lado debe estar en el rango de 1 a 20.");
        } 
       
else {
            // Imprimir el cuadrado de asteriscos
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print(
                   

                   
"* ");
                }
                System.out.println(); 
                }
              

                }
               

               
// Salto de línea al final de cada fila
            }
        }
        
        entrada.close();
    }
}
                    break;
                case 11:
               System.out.println("Ingrese el Ancho del Rectangulo");
                      int ancho = entrada.nextInt();
                      System.out.println("Ingrese la Altura del Rectangulo");
                      int altura = entrada.nextInt();
                      for(int fila = 1; fila <= altura; fila++){
                        for(int columna = 1; columna <= ancho; columna++){
                           if(fila == 1 || fila == alto || columna == 1 || columna == ancho){
                              System.out.println("°");
                           }else{
                              System.out.println(" ");
                           }
                        System.out.println("°");
                        }
                        System.out.println("");
                }
                    break;
                case 12:
                
                    break;
                case 13:
                import java.util.Scanner;
public class Calculadora {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Ingrese el primer número: ");
 double num1 = scanner.nextDouble();
 
 System.out.print("Ingrese el segundo número: ");
 double num2 = scanner.nextDouble();
 
 System.out.println("Seleccione la operación:");
 System.out.println("1. Suma");
 System.out.println("2. Resta");
 System.out.println("3. Multiplicación");
 System.out.println("4. División");
 int opcion = scanner.nextInt();
 
 double resultado = 0;
 switch (opcion) {
 case 1:
 resultado = num1 + num2;
 break;
 case 2:
 resultado = num1 - num2;
 break;
 case 3:
 resultado = num1 * num2;
 break;
 case 4:
 if (num2 != 0) {
 resultado = num1 / num2;
 } else {
 System.out.println("No se puede dividir por cero.");
 return;
 }
 break;
 default:
 System.out.println("Opción no válida.");
 return;
 }
 
 System.out.println("El resultado es: " + resultado);
 }

}
                //calculadora
                System.out.println("opcion de calculadora");
                    break;
                case 14:
                //salir
                    System.out.println("opcion de salida");
                    break;
                default:
                    System.out.println("Por favor; elije una opcion valida");
                    break;
            }        


            //aqui adentro de preguntar
            System.out.println("Deseas repetir el programa?, escribe s para si");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }
}
