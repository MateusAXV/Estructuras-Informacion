/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGeneral;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        //creamos nuestro arbol
        ArbolGeneral arbol = new ArbolGeneral();
        //creamos nuestro nodo raiz
        Nodo nodo = arbol.insetarRaiz("a");
        arbol.insertar(nodo, "a", "a");

        //insertamos los nodos 
        //estos son los hijos del nodo "a"
        arbol.insertar(nodo, "b", "a");
        arbol.insertar(nodo, "c", "a");
        arbol.insertar(nodo, "d", "a");

        //estos son los hijos del nodo "c"
        arbol.insertar(nodo, "e", "c");
        arbol.insertar(nodo, "f", "c");

        //estos son los hijos del nodo "f"
        arbol.insertar(nodo, "g", "f");

        //imprimirmos el arbol desde la raiz preorden
        log.info(arbol.printPreorden(nodo));
       

    }
}
