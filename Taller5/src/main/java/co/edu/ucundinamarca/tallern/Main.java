package co.edu.ucundinamarca.tallern;

import javax.swing.JOptionPane;
import lista.listaCircular;
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

        listaCircular lista = new listaCircular();
        int opcion = 0, elemento;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar Nodo a la lista circular\n"
                        + "2. Eliminar Nodo de la lista circular\n"
                        + "3. Mostrar lista circular\n"
                        + "4, Salir\n"
                        + "Que deseas hacer ?\n",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.insertar(elemento);
                        break;
                    case 2:
                        break;
                    case 3:
                        if (!lista.estaVacia()) {
                            lista.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu");
                        break;
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }

        } while (opcion != 4);

    }

}
