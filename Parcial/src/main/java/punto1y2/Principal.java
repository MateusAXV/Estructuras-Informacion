package punto1y2;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Principal {

    static Logger log = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
//        log.debug("Hello World : this is a debug message");
//        log.info("Hello World : this is an info message");

        listaCircular lista = new listaCircular();
        int opcion = 0, elemento, cont;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar Nodo a la lista circular\n"
                        + "2. Mostrar lista circular y el numero mayor\n"
                        + "3. Contar\n"
                        + "4. Salir\n"
                        + "Que deseas hacer ?\n",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregando...",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.insertar(elemento);
                        break;

                    case 2:
                        if (!lista.estaVacia()) {
                            lista.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        }
                        break;

                    case 3:
                        if (lista.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            cont = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el elemento a contar", "contando...",
                                    JOptionPane.INFORMATION_MESSAGE));
                            JOptionPane.showMessageDialog(null,
                                    "El Elemento " + cont + " esta: "
                                    + lista.contarDato(cont) + " veces");

                        }
                        break;
                    case 4:
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

        } while (opcion != 4);

    }

}
