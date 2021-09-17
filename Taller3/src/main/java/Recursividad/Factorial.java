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
public class Factorial {

    private int rta = 0;

    public int factorial(int numero) {
        for (int i = numero; i > 0; i--) {
            rta = numero * (numero - 1);
            numero--;
        }
        return rta;
    }

}
