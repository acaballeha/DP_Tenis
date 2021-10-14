/**
 * Clase que lanza la simulación del campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 1.0
 */

public class TennisDemo {

    public static void main(String[] args) {
        
        //Creación del campeonato
        Campeonato c = new Campeonato ("Campeonato de Extremadura");
        InitTennisData d= new InitTennisData(c);
        //Llamada al método que inicia la simulación del campeonato
        c.competicion();
        
    }
}