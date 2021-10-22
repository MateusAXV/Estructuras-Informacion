/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public interface Listable {

    //agrega un elemento a la lista
    public void agregar(Object parametro);

    //indica si el parametro u objeto existe
    public boolean contiene(int parametro);

    //imprime el contenido del arreglo con un iterador
    public int Iterador();

    //elimina el objeto indicado, si es que existe
    public void eliminar(int parametro);

    //retorna un valor booleano si la lista esta vacia o no
    public boolean estaVacia();

    //retorna el primer elemneto de la lista
    public Object primerElemento();

    //este metodo sustituye un elmento 
    public void sustituir(int pAntiguo, int pNuevo);

    //este metodo limpia toda la lista
    public void vaciar();

}
