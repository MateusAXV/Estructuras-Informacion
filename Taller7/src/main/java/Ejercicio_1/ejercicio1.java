/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class ejercicio1 {

    static Logger log = Logger.getLogger(ejercicio1.class.getName());

    public static void main(String[] args) {

        Cola biblioteca = new Cola();
        log.info("Turno: " + biblioteca.turno());
        biblioteca.ingresar("111", "cliente1", "libro1");
        biblioteca.ingresar("112", "cliente2", "libro2");
        log.info("Turno: " + biblioteca.turno());
        biblioteca.atender();
        biblioteca.atendidos();

    }
}
