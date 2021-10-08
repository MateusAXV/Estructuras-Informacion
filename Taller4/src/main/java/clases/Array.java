package clases;

import java.util.ArrayList;//importamos para utilizar el Arraylist

public class Array {

    private ArrayList<Dulces> arreglo;

    public Array() {
        arreglo = new ArrayList<Dulces>();
    }

    //adicionar un objeto a nuestro array list
    public void adicionar(Dulces p) {
        arreglo.add(p);
    }

    //con este metodo obtenemos la posicion 
    public Dulces obtenerPoscion(int posicion) {
        return arreglo.get(posicion);
    }

    //y con este el tama�o en numero del arraylist
    public int tamaño() {
        return arreglo.size();
    }

    public int buscar(String a) {
        return arreglo.indexOf(a);
    }

    public void borrar(int a) {
        arreglo.remove(a);
    }

}
