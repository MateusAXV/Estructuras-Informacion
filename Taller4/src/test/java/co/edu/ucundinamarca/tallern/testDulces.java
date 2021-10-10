package co.edu.ucundinamarca.tallern;

import static clases.Dulces.*;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class testDulces {

    @Test
    public void testImprimirIterando() {
//este metodo añade 10 dulces de forma automatica, incluido un ChocoRamo
        añadirDiezDulces();
        assertEquals(10, arreglo.size());
        arreglo.clear();
    }

    @Test
    public void testImprimirSinIterador() {
//este metodo añade 10 dulces de forma automatica, incluido un ChocoRamo
        añadirDiezDulces();
        assertEquals(true, arreglo.contains("ChocoRamo"));
        arreglo.clear();
    }

}
