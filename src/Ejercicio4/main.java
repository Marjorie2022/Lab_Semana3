
package Ejercicio4;

import java.util.Scanner;

public class main {
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado emp = new Empleado();
        
        //PEDIR DATOS
        System.out.println("Igrese No Nit: ");
        emp.setNotNit(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese Sus dos nombre: ");
        emp.setNombre(leer.nextLine());
        System.out.println("Ingrese sus dos apellidos: ");
        emp.setApellido(leer.nextLine());
        System.out.println("Ingrese Su salario devengado: ");
        emp.setSalarioDevengado(leer.nextDouble());
        leer.nextLine();
        System.out.println("Ingrese su bandera de activo o inactivo: ");
        emp.setBanderaEmpleado(leer.nextLine());
        
        
        //LLAMAR LOS METODOS 
        emp.imprimirNombreContribuyente();
        emp.imprimirAtributos();
    }
}


