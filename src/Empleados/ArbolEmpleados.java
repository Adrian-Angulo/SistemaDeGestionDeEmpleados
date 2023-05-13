/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class ArbolEmpleados {
    NodoEmpleado raiz;
    
    // Constructor que inicializa la raíz como nula
    public ArbolEmpleados(){
        raiz = null;
    }
    
    // Método que agrega un nuevo empleado al árbol
    public void agregarEmpleado(String nombre, String apellido, double salario, int edad, int id){
        NodoEmpleado nuevoEmpleado = new NodoEmpleado(nombre, apellido,salario,edad,id);
        if (raiz == null) {
            // Si el árbol está vacío, el nuevo empleado se convierte en la raíz
            raiz = nuevoEmpleado;
        } else {
            // Si el árbol no está vacío, se busca la posición adecuada para el nuevo empleado
            NodoEmpleado actual = raiz;
            NodoEmpleado padre;
            while (true) {
                //la variable actual se utilizara como auxiliar
                padre = actual;
                if (salario<actual.salario) {
                    actual = actual.hijoIzquierdo;//reasignar el nodo actual a Hijo izquierdo
                    if (actual == null) { //comprobar si el hijo esta vacio
                        // Si se llega al final de la rama izquierda, el nuevo empleado se agrega como hijo izquierdo del padre
                        padre.hijoIzquierdo = nuevoEmpleado; //se agrega el hijo al padre
                        return;
                    }
                    
                    //en caso que no este vacio se repite el procedimiento
                } else {
                    actual = actual.hijoDerecho; //reasignar actual como hijo derecho
                    if (actual == null) { // si esta basio
                        // Si se llega al final de la rama derecha, el nuevo empleado se agrega como hijo derecho del padre
                        padre.hijoDerecho = nuevoEmpleado; 
                        return;
                    }
                    
                }
            }
        }        
    }
    
    // Busca un empleado en el árbol por su nombre
    public void buscarEmpleado(String nombre) {
        NodoEmpleado actual = raiz;
        while (actual != null && !actual.nombre.equals(nombre)) {
            if (nombre.compareTo(actual.nombre) < 0) {
                actual = actual.hijoIzquierdo;
            } else {
                actual = actual.hijoDerecho;
            }
        }
        if (actual == null) {
            // Si no se encuentra el empleado, se muestra un mensaje de error
            System.out.println("No se encontró el empleado " + nombre + " en la base de datos.");
        } else {
            // Si se encuentra el empleado, se muestra su salario
            System.out.println("El salario de " + nombre + " es " + actual.salario);
        }
    }

    // Muestra los empleados en el árbol en orden ascendente por nombre
    public void consultarEmpleados() {
        System.out.println("Empleados en la base de datos:");
        inorden(raiz);
    }
    
    // Recorre el árbol en inorden (izquierda - raíz - derecha)
    private void inorden(NodoEmpleado nodo) {
        if (nodo != null) {
            inorden(nodo.hijoIzquierdo);
            
            System.out.println("Id  Nombre  Apellido  Salario  Edad  ");
            System.out.println(nodo.id+" "+nodo.nombre +" "+nodo.apellido+" "+nodo.salario+" "+nodo.edad);
            System.out.println(nodo.nombre + " - Salario: " + nodo.salario);
            inorden(nodo.hijoDerecho);
        }
    }
}
