/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Arbol {

    static Logger log = Logger.getLogger(Arbol.class.getName());

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

//agregar objetos al arbol
    public void insertar(int indice, Object dato) {
        Nodo n = new Nodo(indice);
        n.contenido = dato;
        if (raiz == null) {
            raiz = n;
        } else {
            Nodo aux = raiz;
            while (aux != null) {
                n.padre = aux;
                if (n.llave >= aux.llave) {
                    aux = aux.derecha;
                } else {
                    aux = aux.izquierda;
                }
            }
            if (n.llave < n.padre.llave) {
                n.padre.izquierda = n;
            } else {
                n.padre.derecha = n;
            }
        }
    }

//recorrer el arbol
    public void recorrer(Nodo n) {
        if (n != null) {
            recorrer(n.izquierda);
            log.info("Indice: " + n.llave + " contenido: " + n.contenido);
            recorrer(n.derecha);
        }
    }

    private class Nodo {

        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public Object contenido;

        public Nodo(int indice) {
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
            contenido = null;
        }
    }

}
