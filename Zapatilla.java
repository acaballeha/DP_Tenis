
/**
 * Write a description of class Zapatilla here.
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (a version number or a date)
 */
public class Zapatilla
{
    // instance variables - replace the example below with your own
    private String modelo;
    private String tipo;
    private double valor;
    private int numero;

    /**
     * Constructor for objects of class Zapatilla
     */

    public Zapatilla(String modelo, int numero, String tipo, double valor)
    {
        this.modelo=modelo;
        this.numero=numero;
        this.tipo=tipo;
        this.valor=valor;
    }

    /*
     *Devuelve el modelo de la zapatilla 
     */
    public String getModelo(){
        return modelo;
    }

    /*
     * Devuelve el tipo de la zapatilla
     */    
    public String getTipo(){
        return tipo;
    }

    /*
     * Devuelve el valor de la zapatilla(en cuanto al tipo)
     */    
    public double getValor(){
        return valor;
    }

    /*
     * Devuelve el numero de pie de la zapatilla
     */
    public int numero(){
        return numero;
    }

    /*
     * Devuelve el valor del saque de la zapatilla de forma relativa a su tipo
     */
    public double calcularValorSaque(){
        if(tipo.equals ("amortiguacion")){
            return valor * 2;    
        }
        return valor;
    }

    /*
     * Devuelve el valor del resto de la zapatilla de forma relativa a su tipo
     */
    public double calcularValorResto(){
        if(tipo.equals ("agarre")){
            return valor * 1.5;    
        }
        return valor;
    }

    /*
     * Muestra los datos de la zapatilla
     */
    public void mostrar (){
        System.out.print(" Zapatilla [Modelo="+ modelo+ ", Numero=" + numero + ", Tipo="+tipo + ", Valor="+ valor + "]");
    }
}


