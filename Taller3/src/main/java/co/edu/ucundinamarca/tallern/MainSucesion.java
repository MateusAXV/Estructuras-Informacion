/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import static Recursividad.Funciones.sucesion;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class MainSucesion {

    static Logger log = Logger.getLogger(MainSucesion.class.getName());

    public static void main(String[] args) {

        //Maximo Comun Divisor
        log.info(sucesion(10));

    }

    

}
