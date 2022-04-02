
package Ejercicios;

import java.util.Scanner;


public class ejer2 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IVA cal = new IVA();
        System.out.println("INGRESE LOS DATOS");
        System.out.println("Ingrese El precio del producto: $");
        cal.setPrecioArticulo(sc.nextDouble());
        System.out.println("Ingrese porcentaje IVA: %");
        cal.setPorcentaje(sc.nextDouble());
        
        
        
        System.out.println("----------INFO-----------");
        System.out.println("Precio de articulo: $"+ cal.getPrecioArticulo());
        System.out.println("Porcentaje descontado de iva: $" + cal.Calculariva());
        System.out.println("Precio con iva: $"+ cal.precioconiva());
        System.out.println("Precio sin IVA: $"+cal.perciosiniva());
    }
}

