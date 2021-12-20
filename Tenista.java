import java.util.ArrayList;
/**
 * Write a description of interface Tenista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Tenista
{

    public void setNumeroPie (int numeroPie);

    public int getNumeroPie ();

    public void setNombre(String nombre);
    
    public void setZapatilla(Zapatilla zapatilla);
   
    public void setSaque(double saque);

    public void setResto(double resto);
    
    public void setRanking(int ranking);

    public void setPuntosAcumulados(double puntosAcumulados);

    public void setPais(String pais);

    public String getPais(); 
    
    public String getNombre();

    public double getResto ();
    
    public double getSaque ();

    public Zapatilla getZapatilla();
   
    public double getPuntosAcumulados ();

    public int getRanking ();

    public double calcularSaque();

    public void mostrar ();

    public void resetearPuntos();
    
    public void restar(Tenista t1);

    public void juego (Tenista t2);

    //######################################EC2######################

    public Zapatilla elegirZapatillas(ArrayList <Zapatilla> zapatillas);  

    public double calcularResto ();

    public boolean getAsignacionZapatillas();

    public void setAsignacionZapatillas(boolean a);
    
    public void setRaqueta(Raqueta r);

    public Raqueta getRaqueta();
    //#####################EC3######################

    public void realizarInscripcion();

    public void elegirZapatillas();
    
    public void cambiarRaqueta();

    public abstract void golpear();
    

}
