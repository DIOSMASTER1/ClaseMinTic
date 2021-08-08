/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2.PromedioCurso;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ejercicio3POO {
    
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        Ejercicio3 objetoTripMT = new Ejercicio3(0);
        float sumNota=0;
        int con=0, continuar=1;
        
        //objetoTrip.  
        
        while(continuar==1){
            System.out.println("\n\nDigite la nota del Tripulante: ");
            objetoTripMT.asignarNota(leer.nextInt());
            //objetoTrip.
            con++;
            sumNota = sumNota + objetoTripMT.obtenerNota();
            
            System.out.println("Desea continuar? 1. Si, 0. No: ");
            continuar = leer.nextInt();
        }
        
        System.out.println("El promedio de Edades de los Tripulantes es: "+(sumNota/con));
    }
}
