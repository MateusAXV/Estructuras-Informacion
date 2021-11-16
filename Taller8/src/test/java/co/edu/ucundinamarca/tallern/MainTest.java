package co.edu.ucundinamarca.tallern;

import ArbolGeneral.ArbolGeneral;
import ArbolGeneral.Nodo;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 *
 * @author hortizr
 */
public class MainTest {

    //creamos nuestro arbol
    public static ArbolGeneral arbol = new ArbolGeneral();
    //creamos nuestro nodo raiz
    public static Nodo nodo = arbol.insetarRaiz("a");

    //en este test se prueban todos los recorridos solicitados en el taller
    @Test
    public void testRecorridos() {
        insertarNodos();
        assertEquals("a,b,c,e,f,g,d,", arbol.Preorden(nodo));
        assertEquals("b,e,g,f,c,d,a,", arbol.Postorden(nodo));
        assertEquals("b,a,e,c,g,f,d,", arbol.Inorden(nodo));
        assertEquals("a,b,c,d,e,f,g,", arbol.Niveles(nodo));
    }

   
    //funcion que llena el arbol segun el ejercicio planteado
    public static void insertarNodos() {

        //insertamos los nodos 
        //estos son los hijos del nodo "a"
        arbol.insertar(nodo, "b", "a");
        arbol.insertar(nodo, "c", "a");
        arbol.insertar(nodo, "d", "a");

        //estos son los hijos del nodo "c"
        arbol.insertar(nodo, "e", "c");
        arbol.insertar(nodo, "f", "c");

        //estos son los hijos del nodo "f"
        arbol.insertar(nodo, "g", "f");
    }

}
