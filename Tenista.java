
/**
 * Write a description of class Tenista here.
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (1.0)
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
     * @param:{nombre del tenista}
     * @return:{}
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /* 
     * @param:{Zapatilla del tenista}
     * @return:{}
     */
    public void setZapatilla(Zapatilla zapatilla){
        this.zapatilla=zapatilla;
    }

    /*
     * @param:{Velocidad de saque del tenista}
     * @return:{}
     */
    public void setSaque(double saque){
        this.saque=saque;
    }

    /*
     * @param:{Velocidad de resto del tenista}
     * @return:{}
     */
    public void setResto(double resto){
        this.resto=resto;
    }

    /*
     * @param:{Ranking mundial del tenista}
     * @return:{}
     */
    public void setRanking(int ranking){
        this.ranking=ranking;
    }

    /*
     * @param:{Puntos acumulados del tenista}
     * @return:{}
     */
    public void setPuntosAcumulados(double puntoAcumulados){
        this.puntosAcumulados=puntosAcumulados;
    }

    /*
     * @param:{Pais del tenista}
     * @return:{}
     */
    public void setPais(String pais){
        this.pais=pais;
    }

    /*
     * @param:{}
     * @return:{Pais del tenista}
     */
    public String getPais(){
        return pais;
    } 

    /*
     * @param:{}
     * @return:{Nombre del tenista}
     */
    public String getNombre(){
        return nombre;
    }

    /*
     * @param:{}
     * @return:{Velocidad de resto del tenista}
     */
    public double getResto (){
        return resto;
    }

    /*
     * @param:{}
     * @return:{Velocidad de saque del tenista}
     */
    public double getSaque (){
        return saque;
    }

    /*
     * @param:{}
     * @return:{Zapatilla del tenista}
     */
    public Zapatilla getZapatilla(){
        return zapatilla;
    }

    /*
     * @param:{}
     * @return:{Puntos acumulados del tenista}
     */
    public double getPuntosAcumulados (){
        return puntosAcumulados;
    }

    /*
     * @param:{}
     * @return:{Ranking mundial del tenista}
     */
    public int getRanking (){
        return ranking;
    }

    /*
     * @param:{}
     * @return:{Valor de saque de las zapatillas del tenista * velocidad de saque del tenista}
     */
    public double calcularSaque(){
        return zapatilla.calcularValorSaque() * saque;
    }

    /*
     * @param:{}
     * @return:{Valor de resto de las zapatillas del tenista * velocidad de resto del tenista}
     */
    public double calcularResto (){
        return zapatilla.calcularValorResto() * resto;
    }

    /*
     * @param:{}
     * @return:{PuntosAcumulados+=Puntos de saque del tenista}
     */
    public void sacar(){
        puntosAcumulados=puntosAcumulados + calcularSaque();
    }

    /*
     * @param:{}
     * @return:{Si los puntos de resto del tenista > puntos de saque de t1->puntosAcumulados+=puntos de resto del tenista}
     */
    public void restar(Tenista t1){
        if (calcularResto() > t1.calcularSaque()){
            puntosAcumulados = puntosAcumulados + calcularResto();
        }
    }

    /*
     * @param:{}
     * @return:{Muestra por pantalla los datos del tenista y de su zapatilla}
     */
    public void mostrar (){
        System.out.println("Tenista [Nombre="+ nombre+ ", Saque=" + saque 
            + ", Resto="+resto + ", Ranking="+ ranking + ", Pais="+ pais+ "]");
        zapatilla.mostrar();
    }

    /*
     * @param:{}
     * @return:{puntosAcumulados=0}
     */
    public void resetearPuntos(){
        puntosAcumulados=0;
    }

}
