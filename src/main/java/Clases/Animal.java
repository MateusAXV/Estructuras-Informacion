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
public class Animal {
    
    private String nombre,patas,especie;
    private int edad, identificacion;

    public Animal(String nombre, String patas, String especie, int edad, int identificacion) {
        this.nombre = nombre;
        this.patas = patas;
        this.especie = especie;
        this.edad = edad;
        this.identificacion = identificacion;
    }

     public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {

            return false;
        }

        Animal that = (Animal) obj;

        return  Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getPatas(), that.getPatas())
                && Objects.equals(this.getEspecie(), that.getEspecie())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion());

    }

    public int hashCode() {
        int rta = 17;
        rta = 31 * rta + getEdad() + getIdentificacion();        
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
     * @return the patas
     */
    public String getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(String patas) {
        this.patas = patas;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
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
     * @return the identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identidficacion the identificacion to set
     */
    public void setIdentificacion(int identidficacion) {
        this.identificacion = identidficacion;
    }
    
    
    
}
