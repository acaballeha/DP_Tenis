import java.util.HashSet;
/**
 * Clase que define un tenista.
 * Define sus posibilidades de acumular puntos con los atributos saque, resto y sus zapatillas.
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
    private double numeroPie;
    private Raqueta raqueta;
    

    /**
     * Constructor for objects of class Tenista
     * Los puntos acumulados del tenista comienzan en 0.0
     * 
     * @param nombre Nombre del tenista(String)
     * @param zapatilla Zapatilla que usará el tenista(Zapatilla)
     * @param saque Velocidad de saque del tenista(double)
     * @param resto Velocidad de resto del tenista(double)
     * @param ranking Posicion en el Ranking Mundial del tenista(int)
     * @param pais Pais al que pertenece el tenista(String)
     */

    public Tenista(String nombre,Zapatilla zapatilla,double saque, double resto,int ranking, String pais, double numeroPie, Raqueta raqueta)
    {
        this.nombre= nombre;
        this.zapatilla=zapatilla;
        this.saque=saque ;
        this.resto=resto;
        this.ranking=ranking;
        this.pais=pais;
        puntosAcumulados=0.0;
        this.numeroPie=numeroPie;
        this.raqueta = raqueta;

    }
    public void setNumeroPie (int numeroPie){
        this.numeroPie=numeroPie;
    }
    
    public double getNumeroPie (){
        return numeroPie;
    }

    /**
     * 
     * @param nombre Nombre del tenista(String)
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    /**
     * @param zapatilla Zapatilla que usará el tenista(Zapatilla)
     */
    public void setZapatilla(Zapatilla zapatilla){
        this.zapatilla=zapatilla;
    }

    /**
     * @param saque Velocidad de saque del tenista(double)
     */
    public void setSaque(double saque){
        this.saque=saque;
    }

    /**
     * @param resto Velocidad de resto del tenista(double)
     */
    public void setResto(double resto){
        this.resto=resto;
    }

    /**
     * @param ranking Posicion en el Ranking Mundial del tenista(int)
     */
    public void setRanking(int ranking){
        this.ranking=ranking;
    }

    /**
     * @param puntosAcumulados Puntos acumulados del tenista(double)
     */
    public void setPuntosAcumulados(double puntosAcumulados){
        this.puntosAcumulados=puntosAcumulados;
    }

    /**
     * @param pais Pais al que pertenece el tenista(String)
     */
    public void setPais(String pais){
        this.pais=pais;
    }

    /**
     * @return pais Pais al que pertenece el tenista(String)
     */
    public String getPais(){
        return pais;
    } 

    /**
     * @return nombre Nombre del tenista(String)
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return resto Velocidad de resto del tenista(double)
     */
    public double getResto (){
        return resto;
    }

    /**
     * @return saque Velocidad de saque del tenista(double)
     */
    public double getSaque (){
        return saque;
    }

    /**
     * @return zapatilla Zapatilla del tenista(Zapatilla)
     */
    public Zapatilla getZapatilla(){
        return zapatilla;
    }

    /**
     * @return puntosAcumulados Puntos acumulados del tenista(double)
     */
    public double getPuntosAcumulados (){
        return puntosAcumulados;
    }

    /**
     * @return ranking Ranking mundial del tenista(int)
     */
    public int getRanking (){
        return ranking;
    }

    //######################################MOdificado######################
    /**
     * Devuelve los puntos de saque resultantes de la velocidad de saque del
     * tenista y el valor de saque de sus zapatillas.
     * @return saque Saque del tenista(double)
     */
    public double calcularSaque(){
        return zapatilla.calcularValorSaque() 
        * raqueta.calcularPotencia() 
        * raqueta.calcularVelocidad() 
        * saque;
    }

    /**
     * Devuelve los puntos de resto resultantes de la velocidad de resto del
     * tenista y el valor de resto de sus zapatillas.
     * @return resto Resto del tenista(double)
     */
    public double calcularResto (){
        return zapatilla.calcularValorResto() 
        * raqueta.calcularControl() 
        * raqueta.calcularVelocidad() 
        * resto;
    }

    /**
     * Suma los puntos de saque del
     * tenista a sus puntos acumulados.
     * 
     */
    public void sacar(){
        puntosAcumulados=puntosAcumulados + calcularSaque();
    }

    /**
     * Suma los puntos de resto del
     * tenista a sus puntos acumulados, si sus puntos de resto son mayores que los puntos de saque del contrario.
     * @param t1 Tenista que realiza el saque(contrario)(Tenista)
     */
    public void restar(Tenista t1){
        if (calcularResto() > t1.calcularSaque()){
            puntosAcumulados = puntosAcumulados + calcularResto();
        }
    }

    /**
     * Muestra todos los datos del tenista(excepto puntos acumulados) y los de su zapatilla
     * 
     */
    public void mostrar (){
        System.out.println("Tenista [Nombre="+ nombre+ ", Saque=" + saque 
            + ", Resto="+resto + ", Ranking="+ ranking + ", Pais="+ pais+ "]");
        zapatilla.mostrar();
    }

    /**
     * Pone a 0 los puntos acumulados del tenista.
     * 
     */
    public void resetearPuntos(){
        puntosAcumulados=0;
    }
    
    //#########################ddd
    
    public Zapatilla elegirZapatillas(HashSet <Zapatilla> zapatillas){
        Zapatilla z = new aº
    }
    /**
     * Juego de un par de tenistas. Uno saca, otro intenta restar y viceversa.
     * @param t2 Tenista que saca segundo(Tenista)
     */
    public void juego (Tenista t2){
        sacar();
        t2.restar(this);
        t2.sacar();
        restar(t2);
    }
}