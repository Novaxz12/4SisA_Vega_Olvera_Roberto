package TareaArray;
import java.util.*;

public class TareasArray {
    int opcion, negativos = 0, positivos = 0, aprobados = 0, reprobados = 0;
    double negPro = 0.0, posPro = 0.0, promedio = 0.0;
    char reinicio;
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Tareas tareas = new Tareas();
        tareas.menu();
    }

    public void menu() {
        do {
            System.out.println("Elija una opcion deseada");
            System.out.println("1.- Tarea 1: suma de numeros enteros positivos y negativos y sacarles el promedio");
            System.out.println("2.- Tarea 2: mostrar el promedio de las posiciones pares del Array");
            System.out.println("3.- Tarea 3: Calificaciones");
            System.out.println("4.- salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Tarea1();
                    break;
                case 2:
                    Tarea2();
                    break;
                case 3:
                    Tarea3();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println("Deseas repetir el programa, digita S");
            reinicio = entrada.next().charAt(0);
        } while (reinicio == 'S' || reinicio == 's');
    }

    public void Tarea1() {
        int numeros[];
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número para calcular el promedio");
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                posPro += numeros[i];
                positivos++;
            } else if (numeros[i] < 0) {
                negPro += numeros[i];
                negativos++;
            }
        }
        System.out.println("La suma de los números positivos es: " + posPro + " y su promedio es: " + posPro / positivos);
        System.out.println("La suma de los números negativos es: " + negPro + " y su promedio es: " + negPro / negativos);
    }

    public void Tarea2() {
        int numeros[];
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número en el Array");
            numeros[i] = entrada.nextInt();
        }
        int num = 0;
        double ProNum = 0.0;
        for (int i = 0; i < numeros.length; i += 2) {
            num++;
            ProNum += numeros[i];
        }
        System.out.println("La suma de los números en las posiciones pares es: " + ProNum + " y el promedio es: " + ProNum / num);
    }

    public void Tarea3() {
        double[] calificacion = new double[10];
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("Ingrese la calificación " + i);
            calificacion[i] = entrada.nextDouble();
        }
        promedio = 0.0;
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("La calificación " + i + " es: " + calificacion[i]);
            promedio += calificacion[i];
        }
        promedio /= calificacion.length;

        System.out.println("El promedio de las calificaciones es: " + promedio);

        Arrays.sort(calificacion);
        double minimo = calificacion[0];
        double maximo = calificacion[calificacion.length - 1];
        System.out.println("El valor más alto es: " + maximo);
        System.out.println("El valor más bajo es: " + minimo);
        System.out.println("Las calificaciones que superan el promedio son: ");
        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] > promedio) {
                System.out.println(calificacion[i]);
            }
        }

        for (int i = 0; i < calificacion.length; i++) {
            if (calificacion[i] <= 5) {
                reprobados++;
            } else {
                aprobados++;
            }
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }
}