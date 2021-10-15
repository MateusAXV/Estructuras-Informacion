/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class listaCircular {
    
    Nodo ultimo;
    static Logger log = Logger.getLogger(listaCircular.class.getName());
    
    public listaCircular() {
        ultimo = null;
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return ultimo == null;
    }

    //Metodo para insertar Nodos
    public listaCircular insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    //metodo para mostrar la lista
    public void mostrarLista() {
        Nodo aux = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + aux.dato + "]->";
        } while (aux != ultimo.siguiente);
        log.info(cadena);        
    }
    
    //19.54
    
}
