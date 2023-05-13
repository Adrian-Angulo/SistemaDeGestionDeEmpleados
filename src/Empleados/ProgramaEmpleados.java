/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.util.Scanner;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class ProgramaEmpleados {
  public static void main(String[] args) {
    
    ArbolEmpleados arbolEmpleados = new ArbolEmpleados();
    Scanner sc = new Scanner(System.in);
    boolean continuar = true;
    while (continuar) {
        try {
            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Consultar todos los empleados");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion que desea realizar: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // consumir el salto de línea
        switch (opcion) {
          case 1:
                  
            System.out.println("---------Agregar empleado--------------");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            System.out.print("edad: ");
            int edad = sc.nextInt();
            System.out.print("id: ");
            int id = sc.nextInt();
            
            arbolEmpleados.agregarEmpleado(nombre, apellido, salario, edad, id);
            break;
          case 2:

            System.out.println("----------Buscar empleado----------");
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            arbolEmpleados.buscarEmpleado(nombre);
            System.out.println("---------------------------------");
            break;
          case 3:

            System.out.println("--------Consultar todos los empleados---------");
            arbolEmpleados.consultarEmpleados();
            System.out.println("---------------------------------");
            break;
          case 4:
            System.out.println("\n---------------------------");
            continuar = false;
            break;
          default:
            System.out.println("\n---------------------------");
            System.out.println("\nOpción inválida");
        }
            
        } catch (Exception e) {
            System.out.println("Error, solo datos numericos");
            
        }
        
    }
    System.out.println("\n¡Hasta pronto!");
  }
}