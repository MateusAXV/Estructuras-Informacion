/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGeneral;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Nodo {
//NODO PARA UN ARBOL GENERAL 
    String info;
    int nHijos;
    Nodo hijos[];
    Nodo hijosT[];

    public Nodo(String dato) {
        info = dato;
        this.nHijos = 0;
    }

    //aumenta en 1 los hijos con l arreglo temporal 
    public void copiarHijos() {
        hijosT = new Nodo[nHijos + 1];
        for (int i = 0; i < this.nHijos; i++) {
            hijosT[i] = hijos[i];
        }
    }

    public void aumentarHijo(Nodo nodo) {
        copiarHijos();
        hijosT[this.nHijos] = nodo;
        hijos = hijosT;
        this.nHijos++;
    }

    public String getDato() {
        return info;
    }

    public void setDato(String dato) {
        info = dato;
    }

    public String verNodo() {
        return info + ",";
    }

}
