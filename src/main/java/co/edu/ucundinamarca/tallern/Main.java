package co.edu.ucundinamarca.tallern;

//import MisTads.Circulo;
//import MisTads.Jugador;
//import MisTads.NumPar;
import TadsyMemoria.Juego;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());
    

    public static void main(String[] args) {
//        log.debug("***Hello World : this is a debug message***");
//        log.info("***Hello World : this is an info message***");
        log.info("------------------CLASE MAIN----------------");
               
        Juego jugador1 = new Juego(5,"1");
        jugador1.MostrarVidasRestantes();
//        jugador1.vidas--;
        jugador1.MostrarVidasRestantes();
        
        Juego jugador2 = new Juego(5,"2");
        jugador2.MostrarVidasRestantes();
        jugador1.MostrarVidasRestantes();
    }

//    public static void tadCirculo() {
//
//        Circulo circulo1 = new Circulo();
//        circulo1.setRadio(5);
//        System.out.println("area del circulo: " + circulo1.getArea());
//
//    }
//
//    public static void tadJugador() {
//
//        Jugador j1 = new Jugador();
//        j1.setNombre("Lucho");
//        j1.setNivel(98);
//        System.out.println(j1.getNombre() + j1.getNivel());
//
//    }
//
//    public static void tadNumpar() {
//
//        NumPar n1 = new NumPar();
//        n1.setNumero(5);
//
//    }
}
