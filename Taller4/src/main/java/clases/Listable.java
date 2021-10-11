/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public interface Listable {

//OBJETOS
    static Logger log = Logger.getLogger(Listable.class.getName());
    List<String> lista = new ArrayList<>();
    //objeto de tipo iterator para recorrer el arreglo e imprimirlo 
    Iterator< String> it = lista.iterator();

    //agrega un elemento a la lista
    public static void agregar(Object parametro) {
        lista.add((String) parametro);
    }

    //indica si el parametro u objeto existe
    public static boolean contiene(Object parametro) {
        return lista.contains(parametro);
    }

    //imprime el contenido del arreglo con un iterador
    public static void Iterador() {
        while (it.hasNext()) {
            log.info(it.next());
        }
    }

    //elimina el objeto indicado, si es que existe
    public static void eliminar(Object parametro) {
        lista.remove(parametro);
    }

    //retorna un valor booleano si la lista esta vacia o no
    public static boolean estaVacia() {
        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //este metodo sustituye un elmento 
    public static void sustituir(Object pAntiguo, Object pNuevo) {
        for (int i = 0; i < lista.size(); i++) {

            if (pAntiguo == lista.get(i)) {
                int Temporal = i;//guardamos la posicion del dato solicitado
                boolean bandera = true;
                lista.set(Temporal, (String) pNuevo);

            }

        }
    }

    //este metodo limpia toda la lista
    public static void vaciar() {
        lista.clear();
    }

}
