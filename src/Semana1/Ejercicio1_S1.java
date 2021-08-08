/*
Hacer un algoritmo en JAVA que imprima al usuario un Menú con 2 opciones:
1. Factorial de un Número (Usar un bucle do while)
2. Sumatoria de 2i-1 desde 1 hasta N (Usar un bucle for)

Usar la sentencia switch para determinar que opción eligió el usuario.
 */
package Semana1;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ejercicio1_S1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int N, opcion = 0, resultado = 0, i=1, fac = 1;

        System.out.println("Digite un valor Entero: ");
        N = Integer.parseInt(leer.nextLine());

        System.out.println("Que operación desea realizar: \n 1. Calcular Factorial, 2. Calcular Sumatoria(2i-1, 1->N)");
        System.out.println("Digite una Opción: ");
        opcion = Integer.parseInt(leer.nextLine());

        switch (opcion) {
            case 1: {
                if (N >= 0) {
                    do {
                        fac = fac * i;
                        i++;
                    } while (i <= N);

                    System.out.println("El factorial de " + N + " es igual a: " + fac);
                } else {
                    System.out.println("No existe Factorial para Números Negativos");
                }
                break;
            }
            case 2: {
                for(i=1; i<=N; i++)
                {
                    resultado = resultado + ((2*i)-1);
                }
                System.out.println("La Sumatoria de " + N + " es igual a: " + resultado);
                break;
            }
            default: {
                System.out.println("Opción no válida!!");

            }
        }
    }

}