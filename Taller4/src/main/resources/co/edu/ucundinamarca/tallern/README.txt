1. un iterador es un objeto que nos permite recorrer una lista y presentar
   por pantalla todos sus elementos de la siguiente manera:

        Iterator< String> it = arreglo.iterator();
        while (it.hasNext()) {
            log.info(it.next());
          }

2. se puede recorrer una coleccion de una forma distinta gracias a un bucle 
   foreach, muy similar al for tradicional, con la diferencia que no hace falta
   una variable i, como por ejemplo:

        for (String nombre: lista) {
            System.out.println(nombre);
        }
