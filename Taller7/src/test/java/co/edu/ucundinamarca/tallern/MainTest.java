package co.edu.ucundinamarca.tallern;

import Ejercicio_2.Pilas;
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
        lista.Push("A");
        lista.Push("B");
        lista.Push("C");
        lista.Push("D");
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
