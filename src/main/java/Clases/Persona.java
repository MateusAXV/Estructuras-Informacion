/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class Persona {

    private String nombre;
    private int edad, altura, identificacion;

    public Persona(String nombre, int identificacion, int edad, int altura) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.altura = altura;
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {

            return false;
        }

        Persona that = (Persona) obj;

        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getAltura(), that.getAltura())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion());

    }

    public int hashCode() {
        int rta = 17;
        rta = 31 * rta + getEdad() + getIdentificacion();
        rta = 31 * rta + getAltura() + getIdentificacion();
        return rta;
    }

    //Setters && Getters
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

}
