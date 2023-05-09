/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 * version 1.0
 * @author ADRIAN CASTILLO
 */
public class Mian {
    public static void main(String[] args) {
        int opc =0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
                arbolito.insertarNodo(5);
                arbolito.insertarNodo(2);
                arbolito.insertarNodo(3);
                arbolito.insertarNodo(1);
                arbolito.insertarNodo(6);
                arbolito.insertarNodo(7);
                arbolito.insertarNodo(0);
                arbolito.inOrden(arbolito.raiz);

    }
}
