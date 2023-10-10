import java.util.Scanner;

public class Gato {
    static char[][] gato = new char[3][3];
    static boolean bandera = true;

    public static void main(String[] args) {
        imprimeGato();
        char t = 'X';
        char posicion;

        Scanner scanner = new Scanner(System.in);

        while (bandera) {
            System.out.print("Es el turno de " + t + " introduzca posicion: ");
            posicion = scanner.next().charAt(0);
            posicion = Character.toUpperCase(posicion);
            introduce(t, posicion);

            evalua(t);
            cambiaTurno(t);
            imprimeGato();
        }

        scanner.close();
    }

    static void introduce(char t, char coordenada) {
        switch (coordenada) {
            case 'A':
                if (gato[0][0] != 'X' && gato[0][0] != 'O') {
                    gato[0][0] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'B':
                if (gato[0][1] != 'X' && gato[0][1] != 'O') {
                    gato[0][1] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'C':
                if (gato[0][2] != 'X' && gato[0][2] != 'O') {
                    gato[0][2] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'D':
                if (gato[1][0] != 'X' && gato[1][0] != 'O') {
                    gato[1][0] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'E':
                if (gato[1][1] != 'X' && gato[1][1] != 'O') {
                    gato[1][1] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'F':
                if (gato[1][2] != 'X' && gato[1][2] != 'O') {
                    gato[1][2] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'G':
                if (gato[2][0] != 'X' && gato[2][0] != 'O') {
                    gato[2][0] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'H':
                if (gato[2][1] != 'X' && gato[2][1] != 'O') {
                    gato[2][1] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            case 'I':
                if (gato[2][2] != 'X' && gato[2][2] != 'O') {
                    gato[2][2] = t;
                } else {
                    System.out.println("\n=Posicion ocupada=\n");
                }
                break;
            default:
                System.out.println("\nIntroduzca una posición válida.\n");
        }
    }

    static void cambiaTurno(char t) {
        if (t == 'X') {
            t = 'O';
        } else {
            t = 'X';
        }
    }

    static void imprimeGato() {
        System.out.println("\n     ######GATO#######\n");
        System.out.println("\t" + gato[0][0] + " | " + gato[0][1] + " | " + gato[0][2] + "        a | b | c");
        System.out.println("\t----------" + "      -----------");
        System.out.println("\t" + gato[1][0] + " | " + gato[1][1] + " | " + gato[1][2] + "        d | e | f");
        System.out.println("\t----------" + "      -----------");
        System.out.println("\t" + gato[2][0] + " | " + gato[2][1] + " | " + gato[2][2] + "        g | h | i");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    static void evalua(char t) {
        System.out.println(t);
        short px = 0;
        short po = 0;
        short evaluacion = 0;

        // Tu código de evaluación aquí...
    }
}
