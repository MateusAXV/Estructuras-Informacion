/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import Clases.Semana;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class MainDias {

    public static void main(String[] args) {

        Semana semana = new Semana();
              
        //aqui se cargaron los dias de forma manual para verificar que el metodo funciona
        semana.cargarDias("lunes");
        semana.cargarDias("martes");
        semana.cargarDias("miercoles");
        semana.cargarDias("jueves");
        semana.cargarDias("viernes");
        semana.cargarDias("sabado");
        semana.cargarDias("domingo");
        
        //aqui semuestra el numero de dias
        semana.cuantosDias();
        
        //aqui se obriene un dia en especifico
        semana.obtenerDia(3);
        
        //aqui se mostraran todos los dias
        semana.mostrarDias();
        
        
        
        

    }

}
