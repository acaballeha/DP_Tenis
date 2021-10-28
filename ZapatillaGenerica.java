
/**
 * Clase que define las zapatillas que usan los tenistas.
 * Las zapatillas pueden mejorar las habilidades del tenista(como saque o resta).
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (1.0)
 */
public class ZapatillaGenerica implements Zapatilla
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
                    //#######################################Nuevo####################################
    /**
     * Si las zapatillas son tipo "amortiguacion" multiplica el valor de la zaptilla por 2, si no devuelve
     * unicamente el valor
     * @return valorSaque(double) 
     */
    public double calcularValorSaque(){
        return valor * 1.2;
    }
            //#######################################Nuevo####################################
    /**
     * Si las zapatillas son tipo "agarre" multiplica el valor de la zaptilla por 1.5, si no devuelve
     * unicamente el valor
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
    public void mostrar (){
        System.out.print(" Zapatilla [Modelo="+ modelo+ ", Numero=" + numero + ", Valor="+ valor + "]");
    }
}

