/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Cola {

    static Logger log = Logger.getLogger(Cola.class.getName());

    Nodo primero, ultimo;
    private int turno = 0, atendidos = 0;//contadores    

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public void ingresar(String ID, String cliente, String libro) {
        Nodo nuevo = new Nodo();
        nuevo.setID(ID);
        nuevo.setCliente(cliente);
        nuevo.setLibro(libro);
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
        turno++;
    }

    public void atender() {
        Nodo actual = new Nodo();
        actual = primero;
        do {
            log.info("\nID:" + actual.getID()
                    + "\nCliente: " + actual.getCliente()
                    + "\nLibro: " + actual.getLibro()
                    + "\nEstado: sin atender"
                    + "\n------------------------------------------");
            actual = actual.siguiente;
        } while (actual != primero);
    }

    public void atendidos() {
        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();
        actual = primero;
        anterior = ultimo;
        if (actual == primero) {
            log.info("\nID:" + actual.getID()
                    + "\nCliente: " + actual.getCliente()
                    + "\nLibro: " + actual.getLibro()
                    + "\nEstado: atendido"
                    + "\n------------------------------------------");
            primero = primero.siguiente;
            ultimo.siguiente = primero;
            primero.anterior = ultimo;
        }
        atendidos++;
        anterior = actual;
        actual = actual.siguiente;

    }

    public int turno() {
        return turno;
    }

    public int NoAtendidos() {
        return atendidos;
    }
}
