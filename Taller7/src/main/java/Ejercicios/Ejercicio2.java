/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import static junit.framework.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Ejercicio2 {

    static Logger log = Logger.getLogger(Ejercicio2.class.getName());

    public static void main(String[] args) {
        Pilas lista = new Pilas();
        lista.insertar("A");
        lista.insertar("B");
        lista.insertar("C");
        lista.insertar("D");

        log.info(lista.listar());
    }
}
