
package Ejercicios3;

import java.util.Scanner;



public class HashTable {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int numeroCarnet ;
        String nombre  ;
        int codigocarrera ;
        
           System.out.println("Ingrese numero carnet: ");
           numeroCarnet = sc.nextInt();
           sc.nextLine();
           System.out.println("Ingrese su nombre: ");
           nombre= sc.nextLine();
           System.out.println("Codigo de carrera: ");
           codigocarrera = sc.nextInt();
       
        estudiante estudiante = new estudiante(numeroCarnet, nombre, codigocarrera);
        estudiante.imprimir();
    }

    
}

  