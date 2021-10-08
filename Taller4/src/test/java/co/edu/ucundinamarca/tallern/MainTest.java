package co.edu.ucundinamarca.tallern;


import static co.edu.ucundinamarca.tallern.Main.listaDulces;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class MainTest {

    @Test
    public void testImprimirIterando() {        
        //este metodo añade 10 dulces de forma automatica, incluido un ChocoRamo
        listaDulces.añadirDiezDulces();
        assertEquals((int) 10, (int) listaDulces.arreglo.size());
    }

}
