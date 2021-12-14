
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

        str.append("(Golpeador)");
        str.append(super.toString());

        return str.toString();
    }
}
