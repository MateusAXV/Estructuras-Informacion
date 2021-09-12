/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import Clases.Colegio;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class MainColegio {

    public static void main(String[] args) {

        Colegio alumnos = new Colegio();
       
        alumnos.agregarAlumno("ana", " Colombia");
        alumnos.agregarAlumno("lucho", "Alemania");
        alumnos.mostrarTodosAlumno();//imprime todos los alumnos
        alumnos.cuantosAlumnos();//cuenta los alumnos
        
        alumnos.borrarAlumno("ana");//borra al alumno entre parentesis
        
        alumnos.cuantosAlumnos();//cuenta los alumnos
        alumnos.mostrarTodosAlumno();//imprime todos los alumnos
        
        
        
    }
}
