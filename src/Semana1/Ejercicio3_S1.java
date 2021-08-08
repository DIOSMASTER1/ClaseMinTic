/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ejercicio3_S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int longitud = 2, i, j, fil = 2, col = 2;
        float[] promedios = new float[longitud];
        float[][] vecValores = new float[fil][col];
        float acumValores = 0;

        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Digite un valor para el vecValores[" + i + "][" + j + "]: ");
                vecValores[i][j] = leer.nextInt();
            }
        }

        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                acumValores = acumValores + vecValores[i][j];
            }
            promedios[i] = (acumValores / j);
            acumValores = 0;
        }

        for (i = 0; i < longitud; i++) {
            System.out.println("promedios[" + i + "]: " + promedios[i]);
        }
    }
    
}
