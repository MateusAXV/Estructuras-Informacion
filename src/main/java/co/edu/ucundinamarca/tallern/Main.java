package co.edu.ucundinamarca.tallern;

import Clases.Animal;
import Clases.Persona;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
//        log.debug("***Hello World : this is a debug message***");
//        log.info("***Hello World : this is an info message***");

        log.info("------------------CLASE MAIN----------------");

        Persona persona1 = new Persona("lucho", 1, 1, 1);
        Persona persona2 = new Persona("ana", 2, 2, 2);

        if (persona1.equals(persona2)) {
            log.info("--Peronas  Iguales--");
        } else {
            log.info("--Personas Diferentes--");
        }
        
        Animal animal1 = new Animal("lucho", "4", "perro", 10,1);
        Animal animal2 = new Animal("lucho", "4", "perro", 10,1);

        if (animal1.equals(animal2)) {
            log.info("--Animales  Iguales--");
        } else {
            log.info("--Animales Diferentes--");
        }

    }

}
