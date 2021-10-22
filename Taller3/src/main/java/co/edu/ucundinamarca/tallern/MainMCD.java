/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import static Recursividad.Funciones.mcd;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class MainMCD {
    
    static Logger log = Logger.getLogger(MainMCD.class.getName());

    public static void main(String[] args) {

        //Maximo Comun Divisor
        log.info(mcd(96, 36));

    }

}
