import java.io.*;
/**
 * Write a description of class TenistaGolpeador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenistaGolpeador extends TenistaGenerico 
{

    /**
     * Constructor for objects of class TenistaGolpeador
     */
    public TenistaGolpeador(String nombre,Zapatilla zapatilla,double saque, double resto,int ranking, String pais, int numeroPie)
    {
        super(nombre,zapatilla,saque, resto,ranking, pais, numeroPie);

    }

    /**
     * 
     */
    public void golpear(){
        setPuntosAcumulados(getPuntosAcumulados() + (getRaqueta().calcularVelocidad() * 0.1)); 
    }

    @Override
    /**
     * Muestra todos los datos del tenista(excepto puntos acumulados) y los de su zapatilla
     * 
     */
    public void mostrar (){
        System.out.println(this.toString());

    }
    
    @Override
    /**
     * Juego de un par de tenistas. Uno saca, otro intenta restar.
     * @param t2 Tenista que saca segundo(Tenista)
     */
    public void juego (Tenista t2){
        sacar();
        t2.restar(this);
        golpear();
        cambiarRaqueta();
        //#cambios necesarios AQUI
    }

    @Override
    /**
     * Devuelve en un string con la información del Tenista
     * @return str Informacion del Tenista(String)
     */
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("(Golpeador)");
        str.append(super.toString());

        return str.toString();
    }
    
 
}
