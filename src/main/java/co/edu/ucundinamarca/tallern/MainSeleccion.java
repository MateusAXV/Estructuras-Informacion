/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import Clases.SeleccionColombia;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class MainSeleccion {
    
    public static void main(String[] args) {
        
        SeleccionColombia jugadores =new SeleccionColombia();
        
        //jugadores agregados para probar el programa
        jugadores.agregarJugadores("hugo");
        jugadores.agregarJugadores("paco");
        jugadores.agregarJugadores("luis");
        
        //mostrar todos los jugadores
        jugadores.mostrarJugadores();
        
        //buscar y verificar si exixte un jugador
        jugadores.contieneJugador("lucho");//en este caso no existe
        jugadores.contieneJugador("paco");//en este caso si existe
        
        
        
    }
    
}
