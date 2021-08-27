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
public class Circulo {

    private double radio = 0, area = 0, pi = 3.141592654;

    public Circulo(double radio, double area) {
        setRadio(radio);
        setArea(area);
    }

    public void setRadio(double radio) {

        if (radio > 0) {
            this.radio = radio;
        } else {
            System.out.println("Valor Incorrecto");
        }

    }

    public void setArea(double area) {
        area = radio * radio * pi;
        this.area = area;

    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

}
