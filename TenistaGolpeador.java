
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
         super.setPuntosAcumulados(super.getPuntosAcumulados() + (super.getRaqueta().calcularVelocidad() * 0.1)); 
     }


}
