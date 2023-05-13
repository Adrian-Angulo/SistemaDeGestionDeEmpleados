/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class NodoEmpleado {
    String nombre, apellido;
    double salario;
    int edad, id;
    NodoEmpleado hijoIzquierdo;
    NodoEmpleado hijoDerecho;
  
    public NodoEmpleado(String nombre, String apellido, double salario, int edad, int id) {
    this.nombre = nombre;
    this.salario = salario;
    this.apellido=apellido;
    this.edad=edad;
    this.id=id;
    this.hijoIzquierdo = null;
    this.hijoDerecho = null;
    }
}
    
