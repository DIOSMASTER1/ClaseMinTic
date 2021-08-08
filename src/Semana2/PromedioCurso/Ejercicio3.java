/*
Hacer un Algoritmo en JAVA aplicando POO (Constructores y visibilidad) 
que permita calcular la calificación promedio de todos los tripulantes 
de un curso de Misión TIC 2022.  (El curso puede tener N tripulantes).
 */
package Semana2.PromedioCurso;

/**
 *
 * @author braya
 */
public class Ejercicio3 {
    
    private float notaCurso;

    public Ejercicio3(float notaCurso) {
        this.notaCurso = notaCurso;
    }
    
    public void asignarNota(float n)
    {
        this.notaCurso = n;
    }
    
    public float obtenerNota()
    {
        return this.notaCurso;
    }
    
}
