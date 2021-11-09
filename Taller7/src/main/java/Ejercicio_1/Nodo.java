/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Nodo {

    Nodo siguiente, anterior;
    private String ID, cliente, libro;

    //Getter & Setter
    public String getID() {
        return ID;
    }

    public void setID(String ide) {
        this.ID = ide;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

}
