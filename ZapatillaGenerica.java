
/**
 * Clase que define las zapatillas que usan los tenistas.
 * Las zapatillas pueden mejorar las habilidades del tenista(como saque o resta).
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public abstract class  ZapatillaGenerica implements Zapatilla
{
    // instance variables - replace the example below with your own
    private String modelo;
    private double valor;
    private int numero;

    /**
     * Constructor for objects of class Zapatilla
     * @param modelo nombre del modelo de la zapatilla
     * @param numero numero de la zapatilla
     * @param valor valor de la zapatilla
     */
    public ZapatillaGenerica(String modelo, int numero, double valor)
    {
        this.modelo=modelo;
        this.numero=numero;
        this.valor=valor;
    }

    /**
     * 
     * @param modelo nombre del modelo de la zapatilla(String)
     * 
     */
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    /** 
     * @param numero numero de la zapatilla(int)
     */
    public void setNumero(int numero){
        this.numero=numero;
    }

    /**
     * @param valor valor de la zapatilla(double)
     * 
     */
    public void setValor(double valor){
        this.valor=valor;
    }

    /**
     * @return modelo(String)
     */

    public String getModelo(){
        return modelo;
    }

    /**
     * @return valor(double)
     */
    public double getValor(){
        return valor;
    }

    /**
     * @return numero(int)
     */
    public int getNumero(){
        return numero;
    }
    //#######################################EC2####################################
    /**
     * Multiplica el valor de la zaptilla por 1.2
     * @return valorSaque(double) 
     */
    public double calcularValorSaque(){
        return valor * 1.2;
    }
    //#######################################EC2####################################
    /**
     * Multiplica el valor de la zaptilla por 1.3
     * @return valorResto(double) 
     */
    public double calcularValorResto(){
        return valor *1.3;
    }

    /**
     * 
     * Muestra toda la informacion de la zapatilla
     *  
     */
    public abstract void mostrar ();
}

