/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import co.edu.ucundinamarca.tallern.Main;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Dulces {

    static Logger log = Logger.getLogger(Dulces.class.getName());

    //---------------------------ArrayList
    public ArrayList<String> arreglo;

    //imprime el contenido del arreglo de forma iterativa
    public void imprimirIterando() {
        for (int i = 0; i <= arreglo.size(); i++) {
            log.info(arreglo.get(i));
        }
    }

    //este metodo añade 10 dulces de forma automatica, incluido un ChocoRamo
    public void añadirDiezDulces() {
        for (int i = 0; i <= 3; i++) {
            arreglo.add("Menta");
            arreglo.add("Chicle");
            arreglo.add("Galleta");
        }
        arreglo.add("ChocoRamo");

    }

}
