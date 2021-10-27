package Loteria;

import javax.swing.JOptionPane;
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

        lista numeros = new lista();
        int opcion = 0, elemento;
        boolean bandera = false;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un numero para jugar \n"
                        + "2. Mostrar los numeros ingresados para la loteria\n"
                        + "3, Salir\n"
                        + "Que deseas hacer ?\n",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento ", "Agregando...",
                                JOptionPane.INFORMATION_MESSAGE));
                        numeros.insertar(elemento);
                        break;
                    case 2:
                        if (!numeros.estaVacia()) {
                            numeros.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Saliendo...",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu");
                        break;
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }

        } while (opcion != 3);

    }

}
