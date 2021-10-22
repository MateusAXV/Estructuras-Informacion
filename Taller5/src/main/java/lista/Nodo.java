/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Nodo {

    int dato;
    Nodo siguiente;

    public Nodo(int d) {
        dato = d;
        siguiente = this;
    }
}
