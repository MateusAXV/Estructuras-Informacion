/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

import PilasYColas.NodoCola.ColaLista;
import PilasYColas.NodoPila.PilaLista;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Principal {

    static Logger log = Logger.getLogger(Principal.class.getName());

    public static void pila() {
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        log.info(pila.quitar());
    }

    public static void cola() {
        ColaLista cola = new ColaLista();
        cola.insertar(0);
        log.info(cola.quitar());
    }

    public static void main(String[] args) {
        pila();
        cola();
    }

}
