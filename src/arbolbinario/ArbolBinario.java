/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author ADRIAN CASTILLO
 */
public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz = null;
    }
    public void insertarNodo(int d){
        NodoArbol nuevo = new NodoArbol(d);
        
        if(raiz==null){
            raiz=nuevo;
            
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre; 
            while(true){
                padre = aux;
                if(d<aux.dato){
                    aux = aux.hijoIz;
                    if(aux==null){
                        padre.hijoIz = nuevo;
                        return;
                    }
                }else{
                   aux = aux.hijoDe;
                   if(aux==null){
                       padre.hijoDe = nuevo;
                       return;
                   } 
                }
            }
        }
        
    }
    
    public boolean estaVacio(){
        return raiz==null;
    }
    //metodo para recorrer el arbol inorden
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.hijoIz);
            System.out.print(r.dato+" ");
            inOrden(r.hijoDe);
            
        }
    }
}
