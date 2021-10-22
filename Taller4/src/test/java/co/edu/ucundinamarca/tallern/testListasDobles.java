/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import clases.ListaDoble;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class testListasDobles {

    @Test
    public void testEliminar() {
        ListaDoble prueba3 = new ListaDoble();
        //aqui se agregaron elementos
        prueba3.agregar(1);
        prueba3.agregar(2);
        prueba3.agregar(3);
        //aqui se borro un elemento
        prueba3.eliminar(2);
        //como se elimino ese elemento, la lista ya no lo contiene
        assertEquals(false, prueba3.contiene(2));

    }

    @Test
    public void testContiene() {
        ListaDoble prueba4 = new ListaDoble();
        //aqui se agregaron elementos
        prueba4.agregar(1);
        prueba4.agregar(2);
        prueba4.agregar(3);
        prueba4.agregar(4);
        assertEquals(true, prueba4.contiene(3));

    }

}
