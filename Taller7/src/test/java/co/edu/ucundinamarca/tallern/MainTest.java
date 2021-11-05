package co.edu.ucundinamarca.tallern;

import Ejercicios.Pilas;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class MainTest {

    @Test
    public void testEjercicio2() {
        Pilas lista = new Pilas();
        lista.insertar("A");
        lista.insertar("B");
        lista.insertar("C");
        lista.insertar("D");
        assertEquals("D C B A ", lista.listar());
    }

//    @Test
//    public void testSuma() {
//        String text = "Text";
//        assertEquals("Text", text);
//    }
//    @Test
//    public void testSuma2() {
//        assertTrue(1 + 1 == 2);
//    }
}
