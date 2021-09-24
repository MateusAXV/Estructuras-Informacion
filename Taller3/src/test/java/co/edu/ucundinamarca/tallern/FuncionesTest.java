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

    //funcion que prueba un numero elevado a una potencia
    @Test
    public void potenciaRecursiva() {
        //se evaluara la potenica de 5^2, que es 25
        assertEquals(25, potencia(5, 2));
    }

    //funcion que prueba la sucesion recusiva
    @Test
    public void sucesionRec() {
        assertEquals(2.0737240167276587, sucesion(10));
    }

}
