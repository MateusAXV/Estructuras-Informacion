/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class ListaSimple implements Listable {

    private Nodo cabeza = null;
    private int longitud = 0;

    public Object contiene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class Nodo {

        public Object elemento;//valor almacenado en el nodo
        public Nodo siguiente;//referencia al siguiente elemento         

        Nodo(Object valor) {
            this(valor, null);
        }

        Nodo(Object valor, Nodo n) {
            elemento = valor;
            siguiente = n;
        }

        public Object obtenerElemento() {
            return elemento;
        }

        public Nodo obtenerSgte() {
            return siguiente;
        }
    }

    //---------------METODOS
    //agrega elementos a la lista
    public void agregar(Object parametro) {
        Nodo nodo = new Nodo(parametro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    //metodo para busacr un elemento
    public boolean contiene(int parametro) {
        if (cabeza == null) {
            return false;
        } else {

            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < parametro && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != parametro) {
                return false;
            } else {
                return true;
            }

        }

    }

    public int Iterador() {
        return longitud;
    }

    //metodo que elimina un elemento
    public void eliminar(int parametro) {
        if (cabeza != null) {
            if (parametro == 0) {
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud--;
            } else if (parametro < longitud) {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (parametro - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }
        }
    }

    //meindica si la lista esta vacia
    public boolean estaVacia() {
        if (longitud == 0) {//esta vacia
            return true;
        } else {//no esta vacia
            return false;
        }

    }

    //retorna el primer elemneto de la lista
    public Object primerElemento() {

        if (estaVacia() != true) {
            return cabeza;
        } else {
            return null;
        }

    }

    //sustituye un elemnto de la lista
    public void sustituir(int pAntiguo, int pNuevo) {
        if (contiene(pAntiguo) == true) {
            eliminar(pAntiguo);
            agregar(pNuevo);
        }

    }

    //borra todos los elementos de la lista
    public void vaciar() {
        for (int i = 0; i < longitud; i++) {
            if (cabeza != null) {
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;

            }
        }
        longitud = 0;
    }

}
