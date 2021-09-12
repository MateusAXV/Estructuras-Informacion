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
public class Semana {

    static Logger log = Logger.getLogger(Main.class.getName());

    List<String> Semana = new ArrayList<>();

    public void cargarDias(String dia) {//anade elementos a la lista         
        Semana.add(dia);
        log.info("dia " + dia + " cargado");
    }

    public void cuantosDias() {//muestra cuantos elementos tiene la lista 
        log.info("hay " + Semana.size() + " dias");
    }

    public void obtenerDia(int dia) {//obtener un elemto en la pocicion indicada
        log.info("el dia numero " + dia + " es " + Semana.get(dia - 1));
    }

    public void mostrarDias() {//metodo para imprimir todos los datos en la lista
        log.info("todos los dias:");
        for (int i = 0; i < Semana.size(); i++) {
            log.info(Semana.get(i));
        }

    }

}
