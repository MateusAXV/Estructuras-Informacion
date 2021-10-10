/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Ximena_Vanegas_M
 */
public interface Listable {

    public static List<String> lista = new ArrayList<>();

    public static void agregar(Object parametro) {
        lista.add((String) parametro);
    }

    public static boolean contiene(Object parametro) {
        return lista.contains(parametro);
    }

}
