/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class NodoCola {

    /**
     * en las colas, el primer elemento en llegar, es el primero en salir:
     */
    int elemento;
    NodoCola siguiente;

    public NodoCola(int x) {
        elemento = x;
        siguiente = null;
    }

    //declaracion de la calse
    static class ColaLista {

        protected NodoCola frente;
        protected NodoCola fin;

        public ColaLista() {
            frente = fin = null;
        }

        //insertar elementos a la cola
        public void insertar(int elemento) {
            NodoCola a;
            a = new NodoCola(elemento);
            if (colaVacia()) {
                frente = a;
            } else {
                fin.siguiente = a;
            }
            fin = a;
        }

        //quitar elemnto de la cola
        public int quitar() {
            int aux;
            if (!colaVacia()) {
                aux = frente.elemento;
                frente = frente.siguiente;
            } else {
                return -1;
            }
            return aux;
        }

        //quitar todos los elementos
        public void borrarCola() {
            while (frente != null) {
                frente = frente.siguiente;
            }
        }

        //idica si la cola esta vacia
        public boolean colaVacia() {
            if (frente == null) {
                return true;
            } else {
                return false;
            }
        }
    }

}
