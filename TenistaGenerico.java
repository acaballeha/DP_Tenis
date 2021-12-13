import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase que define un tenista.
 * Define sus posibilidades de acumular puntos con los atributos saque, resto y sus zapatillas.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public abstract class TenistaGenerico implements Tenista
{
    private String nombre;
    private Zapatilla zapatilla;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntosAcumulados;
    //EC2
    private int numeroPie;
    private Raqueta raqueta;
    private boolean asignacionZapatillas;//Atributo para saber en todo momento si le 
    //han asignado al menos unas zapatillas nuevas

    /**
     * Constructor for objects of class Tenista
     * Los puntos acumulados del tenista comienzan en 0.0
     * El tenista comienza sin una raqueta asignada
     * El tenista comienza sin haber recibido unas zapatillas nuevas
     * 
     * @param nombre Nombre del tenista(String)
     * @param zapatilla Zapatilla que usará el tenista(Zapatilla)
     * @param saque Velocidad de saque del tenista(double)
     * @param resto Velocidad de resto del tenista(double)
     * @param ranking Posicion en el Ranking Mundial del tenista(int)
     * @param pais Pais al que pertenece el tenista(String)
     * @param numeroPie Numero de calzado del tenista (int)
     */

    public TenistaGenerico(String nombre,Zapatilla zapatilla,double saque, double resto,int ranking, String pais, int numeroPie)
    {
        this.nombre= nombre;
        this.zapatilla=zapatilla;
        this.saque=saque ;
        this.resto=resto;
        this.ranking=ranking;
        this.pais=pais;
        puntosAcumulados=0.0;
        this.numeroPie=numeroPie;
        this.raqueta = null;
        this.asignacionZapatillas=false;

    }

    /**
     * @param numeroPie Numero de pie del tenista(int)
     */
    public void setNumeroPie (int numeroPie){
        this.numeroPie=numeroPie;
    }

    /**
     * @return numeroPie(int)
     */
    public int getNumeroPie (){
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



    /**
     * Suma los puntos de saque del
     * tenista a sus puntos acumulados.
     * 
     */
    private void sacar(){
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
            + ", Resto="+resto + ", Ranking="+ ranking + ", Pais="+ pais+
            ", número pie:"+numeroPie+ "]");
        System.out.print("      ");
        zapatilla.mostrar();

    }

    /**
     * Pone a 0 los puntos acumulados del tenista.
     * 
     */
    public void resetearPuntos(){
        puntosAcumulados=0;
    }

    /**
     * Juego de un par de tenistas. Uno saca, otro intenta restar.
     * @param t2 Tenista que saca segundo(Tenista)
     */
    public void juego (Tenista t2){
        sacar();
        t2.restar(this);
        //#cambios necesarios AQUI
    }

    //######################################EC2######################
    /**
     * El tenista elige unas zapatillas de su numero si existen.
     * @param zapatillas Estructura en la que buscara el tenista zapatillas de su numero(ArrayList<Zapatilla>)
     * @return z Zapatilla que ha escogido o null en caso de no poder(Zapatilla)
     */
    public Zapatilla elegirZapatillas(ArrayList <Zapatilla> zapatillas){
        Zapatilla z = null;
        Iterator <Zapatilla> it =  zapatillas.iterator();
        while (it.hasNext()){
            z= it.next();
            if(numeroPie == z.getNumero()){
                asignacionZapatillas=true;//bandera para saber que se le han asignado zapatillas
                this.zapatilla=z;
                return z;
            }
        }
        return z;

    }    

    /**
     * Devuelve los puntos de resto resultantes de la velocidad de resto del
     * tenista por  el valor de resto de sus zapatillas por el valor de control
     * de su raqueta y el valor de velocidad de su raqueta.
     * @return resto Resto del tenista(double)
     */
    public double calcularResto (){
        return zapatilla.calcularValorResto() 
        * raqueta.calcularControl() 
        * raqueta.calcularVelocidad() 
        * resto;
    }
    
        /**
     * Devuelve los puntos de saque resultantes de la velocidad de saque del
     * tenista por el valor de saque de sus zapatillas por el valor de la potencia
     * de su raqueta y por el valor de la velocidad de su raqueta
     * @return saque Saque del tenista(double)
     */
    public double calcularSaque(){
        return  saque * zapatilla.calcularValorSaque() 
        * raqueta.calcularPotencia() 
        * raqueta.calcularVelocidad();
    }

    /**
     * 
     *@return asignacionZapatillas Devuelve si al tenista le han asignado alguna zapatilla nueva(boolean).
     */
    public boolean getAsignacionZapatillas(){
        return asignacionZapatillas;
    }

    /**
     * @param a Valor booleano que decide si se le han asignado zapatilas al tenista.(boolean).
     */
    public void setAsignacionZapatillas(boolean a){
        asignacionZapatillas=a;
    }

    /**
     * @param Raqueta Raqueta con la que jugara el tenista(Raqueta)
     */
    public void setRaqueta(Raqueta r){
        this.raqueta=r;;
    }

    /**
     * @return raqueta(Raqueta)
     */
    public Raqueta getRaqueta(){
        return raqueta;
    }
    //#####################EC3######################
    /**
     * Añade al tenista a la lista de competidores del Campeonato.
     */
    public void realizarInscripcion(){
        Campeonato c= Campeonato.getInstance();
        c.inscribirTenista(this);

    }

    /**
     * El tenista elige unas zapatillas (las primera que encuentre) de su numero, siempre que existan algunas 
     * en la lista de zapatillas del campeonato.
     */
    public void elegirZapatillas(){
        Campeonato c= Campeonato.getInstance();
        c.asignarZapatilla(this);
    }

    /**
     * El tenista cambia su raqueta por la primera que haya en el set de raquetas del campeonato.
     * (Siempre que exista alguna).
     */
    public void cambiarRaqueta(){
        Campeonato c=Campeonato.getInstance();
        c.asignarRaqueta(this);
    }
    
    /**
     * 
     */
     public abstract void golpear();
}