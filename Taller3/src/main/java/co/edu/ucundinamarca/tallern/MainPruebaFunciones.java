package co.edu.ucundinamarca.tallern;

import static Recursividad.Funciones.*;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class MainPruebaFunciones {

    static Logger log = Logger.getLogger(MainPruebaFunciones.class.getName());

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int factorial, base, exponente;

        //FACTORIAL
        log.info("Ingrese un numero para calcular su factorial: ");
        factorial = teclado.nextInt();
        log.info("Factorial Iterativo: " + factorial(factorial));
        log.info("Factorial Recursivo: " + factorialRec(factorial));

        //POTENCIA
        log.info("Ingrese un numero, este sera la base: ");
        base = teclado.nextInt();
        log.info("Ingrese un numero, este sera el exponente del numero anterior: ");
        exponente = teclado.nextInt();
        log.info("Potencia Recursiva: " + potencia(base, exponente));

        //
    }

}
