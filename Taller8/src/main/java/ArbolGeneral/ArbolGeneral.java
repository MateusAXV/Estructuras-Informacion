/*
 * To change this license header, choose License Headers inorden Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template inorden the editor.
 */
package ArbolGeneral;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class ArbolGeneral {

    private static String preorden = "", postorden = "", inorden = "", niveles = "";
    
    Nodo raiz;

    public Nodo insetarRaiz(String dato) {
        raiz = new Nodo(dato);
        return raiz;
    }

    //insertar datos al arbol indicando el padre(recursivo)
    public void insertar(Nodo nodo, String dato, String padre) {
        Nodo nuevo = new Nodo(dato);
        if (nodo.getDato().equals(padre)) {
            nodo.aumentarHijo(nuevo);
        } else {
            for (int i = 0; i < nodo.nHijos; i++) {
                if (nodo.hijos[i].getDato().equals(padre)) {
                    nodo.hijos[i].aumentarHijo(nuevo);
                } else {
                    insertar(nodo.hijos[i], dato, padre);
                }
            }
        }
    }

    //RECORRIDO    
    public String Preorden(Nodo nodo) {// imprimir en preorden 
        if (nodo.nHijos == 0) {
            preorden = preorden + nodo.verNodo();
        } else if (nodo.nHijos > 0) {
            preorden = preorden + nodo.verNodo();
            Preorden(nodo.hijos[0]);
            for (int i = 1; i < nodo.nHijos; i++) {
                Preorden(nodo.hijos[i]);
            }
        }
        return preorden;
    }

    public String Postorden(Nodo nodo) {//imprimir en postorden
        if (nodo != null) {
            for (int i = 0; i < nodo.nHijos; i++) {
                Postorden(nodo.hijos[i]);
            }
            postorden = postorden + nodo.verNodo();
        }
        return postorden;
    }

    public String Inorden(Nodo nodo) {//imprimir en inorden
        if (nodo.nHijos == 0) {
            inorden = inorden + nodo.verNodo();
        } else if (nodo.nHijos > 0) {
            Inorden(nodo.hijos[0]);
            inorden = inorden + nodo.verNodo();
            for (int i = 1; i < nodo.nHijos; i++) {
                Inorden(nodo.hijos[i]);
            }
        }
        return inorden;
    }

}
