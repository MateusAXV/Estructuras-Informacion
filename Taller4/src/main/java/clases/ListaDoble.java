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
public class ListaDoble implements Listable {

    private Nodo cabeza = null;
    private int longitud = 0;

    public class Nodo {

        public Object inicio;//valor almacenado en el nodo
        public Nodo fin;//referencia al fin          

        Nodo(Object valor) {
            this(valor, null);
        }

        Nodo(Object valor, Nodo n) {
            inicio = valor;
            fin = n;
        }

        public Object obtenerInicio() {
            return inicio;
        }

        public Nodo obtenerFin() {
            return fin;
        }
    }

    //---------------METODOS
    //agrega elementos a la lista
    public void agregar(Object parametro) {
        Nodo nodo = new Nodo(parametro);
        nodo.fin = cabeza;
        cabeza = nodo;
        longitud++;
    }

    //metodo para busacr un inicio
    public boolean contiene(int parametro) {
        if (cabeza == null) {
            return false;
        } else {

            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < parametro && puntero.fin != null) {
                puntero = puntero.fin;
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

    //metodo que elimina un inicio
    public void eliminar(int parametro) {
        if (cabeza != null) {
            if (parametro == 0) {
                Nodo primer = cabeza;
                cabeza = cabeza.fin;
                primer.fin = null;
                longitud--;
            } else if (parametro < longitud) {
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (parametro - 1)) {
                    puntero = puntero.fin;
                    contador++;
                }
                Nodo temp = puntero.fin;
                puntero.fin = temp.fin;
                temp.fin = null;
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
                cabeza = cabeza.fin;
                primer.fin = null;

            }
        }
        longitud = 0;
    }

}
