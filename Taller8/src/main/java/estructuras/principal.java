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
public class principal {

    static Logger log = Logger.getLogger(principal.class.getName());

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(1, "pera");
        arbol.insertar(3, "manzana");
        arbol.insertar(8, "limon");
        
        arbol.recorrer(arbol.raiz);
    }
}
