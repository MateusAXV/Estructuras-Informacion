/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public interface Dqueue {

    void insertFirst(Object obj);

    void insertLast(Object obj);

    Object removeFirst();

    Object removeLast();

    int size();
}
