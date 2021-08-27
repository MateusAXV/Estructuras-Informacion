/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisTads;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Jugador {

    private String nombre;
    private int nivel;

    public Jugador() {
        setNombre(nombre);
        setNivel(nivel);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {

            this.nivel = nivel;

        } else {
            System.out.println("Valor Incorrecto");

        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

}
