/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import TadsyMemoria.Juego;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Main2 {

    static Logger log = Logger.getLogger(Main2.class.getName());
  
    public static void main(String[] args) {

        log.info("------------------CLASE MAIN2----------------");
        
        Juego jugador1 = new Juego(5, "1");
        Juego jugador2 = new Juego(5, "2");
        
        
        jugador1.QuitaVida();
        jugador1.MostrarVidasRestantes();
        
        jugador1.ReiniciarPartida();
        jugador1.MostrarVidasRestantes();
        
        jugador1.ActualizaRecord();       
        jugador2.ActualizaRecord();
        
        
        
       

    }
}
