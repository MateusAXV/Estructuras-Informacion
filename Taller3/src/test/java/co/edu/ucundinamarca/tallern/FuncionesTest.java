package co.edu.ucundinamarca.tallern;

import static Recursividad.Funciones.*;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class FuncionesTest {

    //funcion que prueba el factorial iterativo
    @Test
    public void factorialIterativo() {
        //se evaluara el factorial de 5, que es 120
        assertEquals(120, factorial(5));
    }

    //funcion que prueba el factorial recursivo
    @Test
    public void factorialRecursivo() {
        //se evaluara el factorial de 5, que es 120
        assertEquals(120, factorialRec(5));
    }

}
