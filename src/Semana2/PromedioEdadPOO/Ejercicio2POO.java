/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2.PromedioEdadPOO;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ejercicio2POO {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        Ejercicio2 objetoTrip = new Ejercicio2();
        int SumEdad=0, con=0, continuar=1;
        
        //objetoTrip.
        
        while(continuar==1){
            System.out.println("\n\nDigite la Edad del Tripulante: ");
            objetoTrip.asignarEdad(leer.nextInt());
            //objetoTrip.
            con++;
            SumEdad = SumEdad + objetoTrip.obtenerEdad();
            
            System.out.println("Desea continuar? 1. Si, 0. No: ");
            continuar = leer.nextInt();
        }
        
        System.out.println("El promedio de Edades de los Tripulantes es: "+(SumEdad/con));
       
    }
}
