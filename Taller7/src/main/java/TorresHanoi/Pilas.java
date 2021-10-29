/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TorresHanoi;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Pilas {

    private Nodo cabeza = null;
    private int longitud = 0;

    public class Nodo {

        public int numero;
        public Nodo siguiente = null;

        public Nodo(int numero) {
            this.numero = numero;
        }
    }

    //insertar a la pila
    public void insertar(int numero) {
        Nodo nodo = new Nodo(numero);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    //obtener la cabeza de la pila
    public String obtenerCabeza() {
        String Dato = "";
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            return Dato = "" + puntero.numero;
        }
    }

    //determinar si la lista esta vacia
    public String estaVacia() {
        if (cabeza == null) {
            return "la pila esta vacia";
        } else {
            return "la pila no esta vacia";
        }
    }

    //quitar la cabeza de la pila
    public void quitar() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer = null;
            longitud--;
        }
    }

    //mostrar todos los elemtos de la pila
    public String listar() {
        String dato = "";
        Nodo aux = cabeza;
        int n = 0;
        while (aux != null) {
            dato += aux.numero + " ";
            aux = aux.siguiente;
            n++;
        }
        return (dato);
    }

    //vaciar toda la pila
    public void vaciar() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente = null;
            primer = null;
            longitud = 0;
        }
    }
}
