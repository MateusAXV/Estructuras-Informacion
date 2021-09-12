/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import co.edu.ucundinamarca.tallern.Main;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class SeleccionColombia {

    static Logger log = Logger.getLogger(Main.class.getName());

    List<String> conjunto = new ArrayList<>();

    public void agregarJugadores(String jugador) {//anade elementos a la lista         
        conjunto.add(jugador);
        log.info(jugador + " agregado como jugador");
    }

    public void contieneJugador(String jugador) {//verificar si el objeto existe en la lista
        if (conjunto.contains(jugador)) {
            log.info(jugador + "--Jugador Existe--");
        } else {
            log.info(jugador + "--Jugador No Existe--");
        }
    }

    public void mostrarJugadores() {//metodo para imprimir todos los datos en la lista
        log.info("todos los Jugadores:");
        for (int i = 0; i < conjunto.size(); i++) {
            log.info(conjunto.get(i));
        }

    }
}
