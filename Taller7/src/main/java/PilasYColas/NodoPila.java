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
public class NodoPila {

    /**
     * en las pilas, el primer elemento en llegar, es el ultimo en salir:
     */
    int elemento;
    NodoPila siguiente;

    NodoPila(int x) {
        elemento = x;
        siguiente = null;
    }

    static class PilaLista {

        private NodoPila cima;

        public PilaLista() {
            cima = null;
        }

        //operaciones 
        //verificar si la pila esta vacia
        public boolean pilaVacia() {
            if (cima == null) {
                return true;
            } else {
                return false;
            }
        }

        //insertar elementos a la pila
        public void insertar(int elemento) {
            NodoPila nuevo;
            nuevo = new NodoPila(elemento);
            nuevo.siguiente = cima;
            cima = nuevo;
        }

        //quitar elementos a la pila
        public int quitar() {
            if (pilaVacia()) {
                return -1;
                //este valor me indica que la pila esat vacia(puede variar)
            }
            int aux = cima.elemento;
            cima = cima.siguiente;
            return aux;
        }

        //limpia toda la pila
        public void limpiarPila() {
            NodoPila t;
            while (!pilaVacia()) {
                t = cima;
                cima = cima.siguiente;
                t.siguiente = null;
            }
        }
    }

}
