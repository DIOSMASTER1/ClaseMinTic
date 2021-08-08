/*
 Hacer un Algoritmo en JAVA que solicite dos números enteros y determine cual es el mayor, cual es el menor o si ambos números son iguales.
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ejercicio2_S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite un valor Entero: ");
        n1 = Integer.parseInt(leer.nextLine());
        System.out.println("Digite otro valor Entero: ");
        n2 = leer.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);
        } else {
            System.out.println(n1 + " es igual a " + n2);
        }
    }
}
