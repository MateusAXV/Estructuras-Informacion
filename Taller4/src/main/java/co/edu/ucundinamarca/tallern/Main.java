package co.edu.ucundinamarca.tallern;

import clases.Dulces;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());
    public static Dulces listaDulces = new Dulces();

    public static void main(String[] args) {

        listaDulces.añadirDiezDulces();
        log.info(listaDulces.arreglo.size());
    }

}
