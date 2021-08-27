/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisTads;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class NumPar {

    private double numero = 0, residuo = numero % 2;

    public NumPar() {
        setNumero(numero);
        setResiduo(residuo);
    }

    public void setNumero(double numero) {
        if (residuo == 0) {
            System.out.println("este numero es par");
            this.numero=numero;
        } else {
            System.out.println("este numero es impar");
        }

    }

    private void setResiduo(double residuo) {
        this.residuo = residuo;
    }

    public double getNumero() {
        return numero;
    }

    public double getResiduo() {
        return residuo;
    }

}
