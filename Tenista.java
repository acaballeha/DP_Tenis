
/**
 * Write a description of class Tenista here.
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (a version number or a date)
 */
public class Tenista
{
    private String nombre;
    private Zapatilla zapatilla;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntosAcumulados;

    /**
     * Constructor for objects of class Tenista
     */

    public Tenista(String nombre,Zapatilla zapatilla,double saque, double resto,int ranking, String pais)
    {
        this.nombre= nombre;
        this.zapatilla=zapatilla;
        this.saque=saque ;
        this.resto=resto;
        this.ranking=ranking;
        this.pais=pais;
        puntosAcumulados=0.0;

    }

    /*
     * Modifica el nombre del tenista
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /*
     * Modifica la zapatilla del tenista
     */
    public void setZapatilla(Zapatilla zapatilla){
        this.zapatilla=zapatilla;
    }

    /*
     * Modifica el pais del tenista
     */
    public void setPais(String pais){
        this.pais=pais;
    }

    /*
     * Devuelve el pais del tenista
     */
    public String getPais(){
        return pais;
    } 

    /*
     * Devuelve el nombre del tenista
     */
    public String getNombre(){
        return nombre;
    }

    /*
     * Devuelve el resto del tenista
     */
    public double getResto (){
        return resto;
    }

    /*
     * Devuelve el resto del tenista
     */
    public double getSaque (){
        return saque;
    }

    /*
     * Devuelve los puntos acumulados del tenista
     */
    public double getPuntosAcumulados (){
        return puntosAcumulados;
    }

    /*
     * Devuelve el ranking del tenista
     */
    public int getRanking (){
        return ranking;
    }

    /*
     * Devuelve el valor del saque total del tenista, teniendo en cuenta sus zapatillas
     */
    public double calcularSaque(){
        return zapatilla.calcularValorSaque() * saque;
    }

    /*
     * Devuelve el valor del resto total del tenista, teniendo en cuenta sus zapatillas
     */
    public double calcularResto (){
        return zapatilla.calcularValorResto() * resto;
    }

    /*
     * Acumula los puntos de saque del tenista
     */
    public void sacar(){
        puntosAcumulados=puntosAcumulados + calcularSaque();
    }

    /*
     * Si el valor de resto es mayor que el valor de saque de su contrario(t1), acumula los puntos de resto del tenista
     */
    public void restar(Tenista t1){
        if (calcularResto() > t1.calcularSaque()){
            puntosAcumulados = puntosAcumulados + calcularResto();
        }
    }

    /*
     * Muestra los datos del tenista y de sus zapatillas
     */
    public void mostrar (){
        System.out.println("Tenista [Nombre="+ nombre+ ", Saque=" + saque 
            + ", Resto="+resto + ", Ranking="+ ranking + ", Pais="+ pais+ "]");
        zapatilla.mostrar();
    }

    /*
     * Devuelve el valor de los puntos acumulados del tenista a 0
     */
    public void resetearPuntos(){
        puntosAcumulados=0;
    }

   

}
