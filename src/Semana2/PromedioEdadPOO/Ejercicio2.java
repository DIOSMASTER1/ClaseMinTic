/*
Hacer un Algoritmo en JAVA que permita calcular la edad promedio de n Tripulantes. Aplicar el paradigma POO en especial el concepto de 
contructores.

Clases: Ejercicio2, promedio(clase principal)
Atributos: edad, promedio, n
Métodos: Calcular

*********************
Ejercicio2
*********************
edad

---------------------
constructor
asignarEdad
obtenerEdad
*********************


*********************
Promedio
*********************
promedio
n
--------------------
main
*********************
 */
package Semana2.PromedioEdadPOO;

/**
 *
 * @author braya
 */
public class Ejercicio2 {

   
    protected int edad;
    
    public Ejercicio2(int edad) {
        this.edad = edad;
        //this.
    }
    
    public Ejercicio2()
    {
    
    }
    
    public void asignarEdad(int edad)
    {
        this.edad=edad;
    }
    
    public int obtenerEdad()
    {
        return this.edad;
    }
    
}
