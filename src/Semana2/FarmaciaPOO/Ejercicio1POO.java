/*Hacer un Algoritmo en Java que permita facturar las compras realizadas por los clientes en una Farmacia.
El programa debe calcular el subtotal a pagar el IVA y el total por la compra realizada (Se debe indicar los códigos del producto, la cantidad y el precio unitario), adicional de los datos del cliente como identificación y Nombres

clases: Programa Principal, Facturación de Compras, Datos Cliente
Atributos: Cod producto, Cantidad, Precio Unitario, IVA, Nombre cliente, Identificación.
Metodos: Calcular subtotal, Imprimir factura, Subtotal/iva, total de compra
Relaciones:0

-------------------	------------------------------		------------------------
Cliente				Facturación			POO Programa principal
-------------------	------------------------------		------------------------
Codigo de producto	 Iva
Cantidad		------------------------------
Valor/U			 Calcular subtotal
Nombre			 Imprimir subtotal
Identificación		 Imprimir Total
-------------------
Pedir datos
-------------------
 */
package Semana2.FarmaciaPOO;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ejercicio1POO {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Ejercicio1 Farm = new Ejercicio1();       
        double ivap = 0.04, subtotal, total, IVA;

        System.out.println("Digite el codigo del producto: ");
        System.out.println("Digite la cantidad del producto: ");
        System.out.println("Digite el valor unitario del producto: ");
        System.out.println("Digite el nombre del cliente: ");
        System.out.println("Digite el numero de ID Cliente");
        
        Farm.codp = leer.nextInt();
        Farm.cantp = leer.nextInt();
        Farm.valorU = leer.nextInt();
        Farm.nombre = leer.next();
        Farm.idCliente = leer.nextInt();
        
        IVA = (Farm.cantp * Farm.valorU) * ivap;
        subtotal = Farm.cantp * Farm.valorU;
        total = subtotal+IVA;
        
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Total: "+total);
    }
}
