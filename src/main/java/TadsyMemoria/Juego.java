/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TadsyMemoria;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Juego {

    private String numeroJugador;//atributo para distinguir al los jugadores

    private int vidas;

    private int vidasIniciales;
    private int record = 0;
    private boolean fin = false;
    static Logger log = Logger.getLogger(Juego.class.getName());

    public Juego(int vidasIniciales, String nombre) {//constructor
        setVidas(vidasIniciales);
        setNombre(nombre);
        vidasIniciales(vidasIniciales);
    }

    public String setNombre(String nombre) {
        this.numeroJugador = nombre;
        return nombre;
    }

    public int setVidas(int vidas) {
        this.vidas = vidas;
        return vidas;
    }

    public int MostrarVidasRestantes() {
        log.info("Vidas restantes del jugador " + numeroJugador + ": " + vidas);
        return vidas;
    }

    //2
    public int vidasIniciales(int vidasIniciales) {
        this.vidasIniciales = vidasIniciales;
        return vidasIniciales;
    }

    public boolean QuitaVida() {

        if (vidas == record) {
            fin = true;
        } else {
            vidas = vidas - 1;
            log.info("-1 vida jugador " + numeroJugador);
        }
        return fin;
    }

    public void ReiniciarPartida() {
        log.info("Partida reiniciada");
        vidas=vidasIniciales;
      
    }

    public void ActualizaRecord() {

        if (vidas == record) {
            log.info("Record Alcazado");
        } else if (vidas > record) {
            log.info("Record Superado");
            log.info(record);
        } 

    }

}
