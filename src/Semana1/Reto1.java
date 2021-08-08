/*
Hacer un Algoritmo en Java (Utilizar esta clase) que almacene las calificaciones de los periodos Academicos de las asignaturas de 
un estudiante del colegio HighSchool.  Las asignaturas son:

1. Matemàticas
2. Ciencias
3. Ingles
4. Informática
5. Deportes

La escala de calificación es en porcentaje 0 a 100.

El programa permite realizar 4 opciones al usuario a través de un menú:

1. Cargar calificaciones Estudiante.
2. Imprimir Boletin (Todas las Asignaturas)
3. Imprimir Estado  Asignatura (Ver calificaciones de la Asignatura seleccionada)
4. Salir

 */
package Semana1;

import java.util.*;

/**
 *
 * @author braya
 */
public class Reto1 {

    public static Scanner leer = new Scanner(System.in);
    public static int[][] estudiante = new int[5][4];
    public static Map<Integer, String> asignatura = new TreeMap<Integer, String>();

    public static void main(String[] args) {
        // Declaración de variables
        int opcion, continuar = 1;

        // Desarrollo del Algoritmo (llamado a las funciones)
        asignatura.put(0, "Matematicas");
        asignatura.put(1, "Ciencias");
        asignatura.put(2, "Ingles");
        asignatura.put(3, "Informática");
        asignatura.put(4, "Deportes");

        while (continuar == 1) {
            opcion = Menu();
            switch (opcion) {
                case 1: {
                    Cargar();
                    break;
                }
                case 2: {
                    Imprimir();
                    break;
                }
                case 3: {
                    Estado();
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("Opción no válida!!");
                }
            }
            if (opcion == 4) {
                break;
            }
            System.out.println("Desea realizar otra opcion?: 1. Si, 0. No");
            continuar = leer.nextInt();
        }
    }
    // definición de la función Menu.

    public static int Menu() {
        System.out.println("*************************************");
        System.out.println("                Menu.");
        System.out.println("*************************************");
        System.out.println("1. Cargar calificaciones Estudiante.");
        System.out.println("2. Imprimir Boletin.");
        System.out.println("3. Imprimir Estado  Asignatura.");
        System.out.println("4. Salir.");
        System.out.println("Digite una opcion: ");
        int opcion = leer.nextInt();
        return opcion;
    }

    // definición de la función Cargar.
    public static void Cargar() {
        int i, j, periodo;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                periodo = j + 1;
                System.out.println("Digite la nota de " + asignatura.get(i) + " Periodo " + periodo + ": ");
                estudiante[i][j] = leer.nextInt();
            }
        }
    }

    // Definir Función Imprimir Boletin
    public static void Imprimir() {
        int i, j, periodo;
        for (i = 0; i < 5; i++) {
            System.out.println("\n" + asignatura.get(i));
            for (j = 0; j < 4; j++) {
                periodo = j + 1;
                System.out.println("Periodo " + periodo + ": " + estudiante[i][j]);
            }
        }
    }

    //Definicion de la funcion Estado de la asignatura
    public static void Estado() {
        int i, periodo, Ver;
        Ver = Consulta();
        switch (Ver) {
            case 1:
                System.out.println("\n" + asignatura.get(0));
                for (i = 0; i < 4; i++) {
                    periodo = i + 1;
                    System.out.println("Periodo " + periodo + ": " + estudiante[0][i]);
                }
                break;

            case 2:
                System.out.println("\n" + asignatura.get(1));
                for (i = 0; i < 4; i++) {
                    periodo = i + 1;
                    System.out.println("Periodo " + periodo + ": " + estudiante[1][i]);

                }
                break;

            case 3:
                System.out.println("\n" + asignatura.get(2));
                for (i = 0; i < 4; i++) {
                    periodo = i + 1;
                    System.out.println("Periodo " + periodo + ": " + estudiante[2][i]);

                }
                break;

            case 4:
                System.out.println("\n" + asignatura.get(3));
                for (i = 0; i < 4; i++) {
                    periodo = i + 1;
                    System.out.println("Periodo " + periodo + ": " + estudiante[3][i]);

                }
                break;

            case 5:
                System.out.println("\n" + asignatura.get(4));
                for (i = 0; i < 4; i++) {
                    periodo = i + 1;
                    System.out.println("Periodo " + periodo + ": " + estudiante[4][i]);

                }
                break;
        }
    }

    public static int Consulta() {
        System.out.println("1. Matematicas");
        System.out.println("2. Ciencias");
        System.out.println("3. Ingles");
        System.out.println("4. Informática");
        System.out.println("5. Deportes");
        System.out.println("Digite la opcion de la asignatura que desea visualizar: ");
        int Ver = leer.nextInt();
        return Ver;
    }
}
