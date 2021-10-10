/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Dulces {

    static Logger log = Logger.getLogger(Dulces.class.getName());

    //---------------------------ArrayList
    public static List<String> arreglo = new ArrayList<>();

    //este metodo añade 10 dulces de forma automatica, incluido un ChocoRamo
    public static void añadirDiezDulces() {
        arreglo.add("ChocoRamo");
        for (int i = 1; i <= 3; i++) {
            arreglo.add("Menta");
            arreglo.add("Chicle");
            arreglo.add("Galletas");
        }

    }

    //imprime el contenido del arreglo de forma iterativa
    public static void imprimirIterando() {
        
        for ( int i = 0; i < arreglo.size(); i++) {
            log.info(arreglo.get(i));
        }
        
        
    }

    //imprime el contenido del arreglo de forma no iterativa
    public static void imprimirSinIterador() {
        for (String dulces : arreglo) {
            log.info(dulces);
        }
    }

}
