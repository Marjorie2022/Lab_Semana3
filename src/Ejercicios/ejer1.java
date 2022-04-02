
package Ejercicios;

import java.util.Scanner;

public class ejer1 {
    


    
    public static void main(String[] args) {
        Casa casa = new Casa();
        Scanner sc = new Scanner(System.in);
        
        //PEDIMOS LOS DATOS
        System.out.println("==================================");
        System.out.println("INGRESE LA INFORMACION DE LA CASA ");
        System.out.println("Ingrese el numero de casa: ");
        casa.setNumerodeCasa(sc.nextLine());
        System.out.println("Ingrese numero de pasaje: ");
        casa.setNumeroPasaje(sc.nextInt());
        sc.nextLine();
        System.out.println("Nombre de la calle: ");
        casa.setNombredeCalle(sc.nextLine());
        {
        //LAMAMOS EL METODO
        casa.imprimirdatos();
        {
            {
        }
}
    }
