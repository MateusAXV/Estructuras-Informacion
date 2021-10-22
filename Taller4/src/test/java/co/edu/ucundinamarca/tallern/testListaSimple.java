/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import clases.ListaSimple;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class testListaSimple {

    @Test
    public void testEstaVacia() {
        ListaSimple prueba1 = new ListaSimple();
        //como no se han agregado datos, la lista esta vacia
        assertEquals(true, prueba1.estaVacia());

    }

    @Test
    public void testAgregar() {
        ListaSimple prueba2 = new ListaSimple();
        prueba2.agregar("x");
        //aqui ya se agrego un elemento "x", la lista ya no esta vacia
        assertEquals(false, prueba2.estaVacia());

    }
}
