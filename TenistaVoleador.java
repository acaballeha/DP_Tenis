
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
         super.setPuntosAcumulados(super.getPuntosAcumulados() + (super.getRaqueta().calcularPotencia() * 0.15)); 
     }
     
     @Override
     public void cambiarRaqueta(){
         Campeonato c = Campeonato.getInstance();
         c.asignarRaquetaVelocidad(this);
     }

}
