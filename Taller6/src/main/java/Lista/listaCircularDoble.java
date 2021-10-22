/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class listaCircularDoble {

    static Logger log = Logger.getLogger(listaCircularDoble.class.getName());
    nodo primero;
    nodo ultimo;

    public listaCircularDoble() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(int elemento) {
        nodo nuevo = new nodo();
        nuevo.datos = elemento;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }

    public void mostrar() {
        nodo actual = new nodo();
        actual = primero;
        do {
            log.info(actual.datos);
            actual = actual.siguiente;
        } while (actual != primero);
    }

}
