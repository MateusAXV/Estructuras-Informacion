/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Funciones {

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

}
