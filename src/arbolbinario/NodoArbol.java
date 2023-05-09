/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class NodoArbol {
    int dato; 
    NodoArbol hijoIz, hijoDe;
    
    public NodoArbol(int d){
        this.dato=d;
        this.hijoDe=null;
        this.hijoIz=null;
        
    }
    
}