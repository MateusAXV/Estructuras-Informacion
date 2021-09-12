/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import co.edu.ucundinamarca.tallern.Main;
import java.util.HashMap;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Colegio {
    
    static Logger log = Logger.getLogger(Main.class.getName());
    HashMap<String, String> mapa = new HashMap<String, String>();
    
    public void agregarAlumno(String alumno, String nacionalidad) {
        mapa.put(alumno, nacionalidad);
    }
    
    public void mostrarTodosAlumno() {//imprime todos los alumnos
        log.info("Listado Alumnos");
        log.info(mapa.entrySet());
    }
    
    public void borrarAlumno(Object k) {//borra un alumno
        mapa.remove(k);
        log.info("alumno " + k + " borrado");
    }
    
    public void cuantosAlumnos() {//cuneta los alumnos
        log.info("Total alumnos: " + mapa.size());
        
    }
    
}
