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

    private int vidas;//numero de vidas(este atributo antes era publico)

    private int vidasIniciales;//numero de vidas iniciales(necesario para hacer el reinicio)
    private int record = 0;//valor para establecer el record de vidas en los jugadores
    private boolean fin = false;//variable para indicar el fin del juego
    
    static Logger log = Logger.getLogger(Juego.class.getName());//necesario para los mensajes e consola

    public Juego(int vidasIniciales, String nombre) {//constructor de la clase
        setVidas(vidasIniciales);
        setNombre(nombre);
        vidasIniciales(vidasIniciales);
    }

    public String setNombre(String nombre) {//metodo para los nombres o numero de los jugadores
        this.numeroJugador = nombre;
        return nombre;
    }

    public int setVidas(int vidas) {//metodo para el numero de vidas, necesario para los procesos 
        this.vidas = vidas;
        return vidas;
    }

    public int MostrarVidasRestantes() {// metodo para mostrar las vidas de los jugadores con su respectivo nombre
        log.info("Vidas restantes del jugador " + numeroJugador + ": " + vidas);
        return vidas;
    }

    //2
    public int vidasIniciales(int vidasIniciales) {//metodo para guargar las vidas iniciales, necesario para el reinicio
        this.vidasIniciales = vidasIniciales;
        return vidasIniciales;
    }

    public boolean QuitaVida() {// metodo para restar una vida al jugador

        if (vidas == record) {
            fin = true;
        } else {
            vidas = vidas - 1;
            log.info("-1 vida jugador " + numeroJugador);
        }
        return fin;
    }

    public void ReiniciarPartida() {//metodo para reeestablecer la vida del jugador a su valor inicial
        log.info("Partida reiniciada");
        vidas=vidasIniciales;
      
    }

    public void ActualizaRecord() {//metodo que compara y define el estado del record

        if (vidas == record) {
            log.info("Record Alcazado");
        } else if (vidas > record) {
            log.info("Record Superado");
            log.info(record);
        } 

    }

}
