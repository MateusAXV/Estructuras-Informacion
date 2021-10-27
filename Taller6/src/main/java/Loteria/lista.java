/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loteria;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class lista {

    Nodo ultimo;
    int longitud = 0;
    static Logger log = Logger.getLogger(lista.class.getName());

    public lista() {
        ultimo = null;
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return ultimo == null;
    }

    //Metodo para insertar Nodos
    public lista insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        longitud++;
        return this;
    }

    //metodo para mostrar la lista
    public void mostrarLista() {
        Nodo aux = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + aux.dato + "]->";
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, "Longitud Lista: " + contar() + "\n" + cadena);
    }

    //metodo para contrar los nodos
    public int contar() {
        return longitud;
    }
}
