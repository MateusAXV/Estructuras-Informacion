/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TorresHanoi;

import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Hanoi {

    static Logger log = Logger.getLogger(Hanoi.class.getName());

    //objetos tipo Pilas
    public static Pilas fila1 = new Pilas();
    public static Pilas fila2 = new Pilas();
    public static Pilas fila3 = new Pilas();

    //variables
    public static int topDisco;//disco mas peq(cabeza pila)
    public static int numDiscos = 3;//cantidad de discos

    public static void main(String[] args) {
        for (int i = 1; i <= numDiscos; i++) {
            fila1.insertar(i);
        }
        log.info("\nOrigen\t\t" + fila1.listar() + "\nAuxiliar\t\t"
                + fila2.listar() + "\nDestino\t\t" + fila3.listar() + "\n");
        Pasos(Integer.parseInt(fila1.obtenerCabeza()), 1, 2, 3);
    }

    //metodo que solucina las torres de hanoi
    public static void Pasos(int num, int origen, int aux, int destino) {
        if (num == 1) {
            if (origen == 1) {
                topDisco = Integer.parseInt(fila1.obtenerCabeza());
                fila1.quitar();
            }
            if (origen == 2) {
                topDisco = Integer.parseInt(fila2.obtenerCabeza());
                fila2.quitar();
            }
            if (origen == 3) {
                topDisco = Integer.parseInt(fila3.obtenerCabeza());
                fila3.quitar();
            }

            if (destino == 1) {
                fila1.insertar(topDisco);
            }
            if (destino == 2) {
                fila2.insertar(topDisco);
            }
            if (destino == 3) {
                fila3.insertar(topDisco);
            }
            log.info("\nOrigen: " + fila1.listar()
                    + "\nAuxiliar: " + fila2.listar()
                    + "\nDestino: " + fila3.listar());
        } else {
            Pasos(num - 1, origen, destino, aux);
            log.info("----Mover disco de: " + origen + " a " + destino + "----");
            if (origen == 1) {
                topDisco = Integer.parseInt(fila1.obtenerCabeza());
                fila1.quitar();
            }
            if (origen == 2) {
                topDisco = Integer.parseInt(fila2.obtenerCabeza());
                fila2.quitar();
            }
            if (origen == 3) {
                topDisco = Integer.parseInt(fila3.obtenerCabeza());
                fila3.quitar();
            }

            if (destino == 1) {
                fila1.insertar(topDisco);
            }
            if (destino == 2) {
                fila2.insertar(topDisco);
            }
            if (destino == 3) {
                fila3.insertar(topDisco);
            }
            log.info("\nOrigen: " + fila1.listar()
                    + "\nAuxiliar: " + fila2.listar()
                    + "\nDestino: " + fila3.listar());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            Pasos(num - 1, aux, origen, destino);
            
        }
    }

}
