/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Principal {

    public static List<String> soldados = new ArrayList<>();
    public static int numero = 4;
    static Logger log = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {

        //nombre soldaddos (8 en total)
        soldados.add("Francisco");
        soldados.add("Jorge");
        soldados.add("Luis");
        soldados.add("Sergio");
        soldados.add("Ricardo");
        soldados.add("Salvador");
        soldados.add("Diego");
        soldados.add("Mario");

        log.info("---NOMBRE DE LOS SOLDADOS---");
        for (int i = 0; i < soldados.size(); i++) {
            log.info(soldados.get(i));
        }

        log.info("---El soldado que va a pedir ayuda es: "
                + soldados.get(rta(numero, soldados.size())));

    }

    public static int rta(int num, int size) {

        if (size == 1) {
            return 1;
        } else {
            return (rta(size - 1, num) + num - 1) % size + 1;
        }
    }

}
