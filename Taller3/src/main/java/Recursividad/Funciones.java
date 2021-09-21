/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import co.edu.ucundinamarca.tallern.MainPruebaFunciones;
import org.apache.log4j.Logger;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Funciones {

    static Logger log = Logger.getLogger(Funciones.class.getName());
    public static int contador = 0, contadorDos = 0;

    public static int factorial(int numero) {//factorial de un numero con ciclo
        int rta = 1;
        for (int i = 1; i <= numero; i++) {
            rta *= i;
        }
        return rta;
    }

    public static int factorialRec(int numero) {//factorial de un numero con recursividad
        if (numero <= 1) {
            return 1;
        }
        return numero * factorialRec(numero - 1);
    }

    public static int potencia(int base, int exponente) {//potencia de un numero con recursividad
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return potencia(base, exponente + 1) / base;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static int mcd(int a, int b) { //Maximo comun Divisor
        log.info("------Inicio MCD (" + a + "," + b + ")----------");
        if (b == 0) {
            return a;
        }
        log.info("------Fin MCD (" + a + "," + b + ")----------");
        return mcd(b, a % b);
    }

    public static double sucesion(int n) { //Sucecion de recursividad en cascada

        contador++;

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        }

        return (0.91 * sucesion(n - 1)) + (0.1 * sucesion(n - 2));

    }

    public static double sucesionRecursiva(int n) {
        contadorDos++;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        }

        return (0.91 * sucesionRecursiva(n - 1)) + (0.1 * sucesionRecursiva(n - 2));

    }
}
