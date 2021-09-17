package co.edu.ucundinamarca.tallern;

import Recursividad.Factorial;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
//        log.debug("Hello World : this is a debug message");
//        log.info("Hello World : this is an info message");

        Factorial num1 = new Factorial();

        log.info("el factorial es " + num1.factorial(4));

    }

}
