/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGeneral;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public class ArbolGeneral {

    private static String pre = "", pos = "", in = "", niv = "";
    ;
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

    //estos metodos muestra los hijos de un nodo(recursivo)
    public String printPreorden(Nodo nodo) {
        for (int i = 0; i < nodo.nHijos; i++) {
            pre = pre + nodo.hijos[i].verNodo();
            printPreorden(nodo.hijos[i]);
        }
        return pre;
    }

}
