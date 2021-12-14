
/**
 * Write a description of class TenistaVoleador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenistaVoleador extends TenistaGenerico
{

    /**
     * Constructor for objects of class TenistaGolpeador
     */
    public TenistaVoleador(String nombre,Zapatilla zapatilla,double saque, double resto,int ranking, String pais, int numeroPie)
    {
        super(nombre,zapatilla,saque, resto,ranking, pais, numeroPie);

    }

    /**
     * 
     */
    public void golpear(){
        setPuntosAcumulados(getPuntosAcumulados() + (getRaqueta().calcularPotencia() * 0.15)); 
    }

    @Override
    public void cambiarRaqueta(){
        Campeonato c = Campeonato.getInstance();
        c.asignarRaquetaVelocidad(this);
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
     * Muestra todos los datos del tenista(excepto puntos acumulados) y los de su zapatilla
     * 
     */
    public void mostrar (){
        System.out.println(this.toString());

    } 

    @Override
    /**
     * Devuelve en un string con la información del Tenista
     * @return str Informacion del Tenista(String)
     */
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("(Voleador)");
        str.append(super.toString());

        return str.toString();
    }

}
