/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1y2;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class listaCircular {

    Nodo ultimo;
    int longitud = 0;
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
        JOptionPane.showMessageDialog(null, "Numero Mayor: " + numMayor() + "\n" + cadena);
    }

    //metodo para contrar los nodos
    public int contar() {
        return longitud;
    }

    //numero mayor
    public int numMayor() {
        Nodo aux = ultimo.siguiente;
        int max = 0;
        do {

            if (aux.dato > ultimo.dato) {
                max = aux.dato;
                aux = aux.siguiente;
            } else if (aux.dato < ultimo.dato) {
                max = ultimo.dato;
                aux = aux.siguiente;
            } else {
                aux = aux.siguiente;
            }

        } while (aux != ultimo.siguiente);

        aux = ultimo.siguiente;
        return max;
    }

    //contar datos
    public int contarDato(int dato) {
        Nodo aux = ultimo.siguiente;
        int contador = 0;
        do {
            if (aux.dato == dato) {
                contador++;
                aux = aux.siguiente;
            } else {
                aux = aux.siguiente;
            }

        } while (aux != ultimo.siguiente);

        return contador;
    }

}
