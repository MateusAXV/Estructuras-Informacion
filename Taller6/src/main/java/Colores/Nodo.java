/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Nodo {

    String dato;
    Nodo siguiente;

    public Nodo(String d) {
        dato = d;
        siguiente = this;
    }
}
