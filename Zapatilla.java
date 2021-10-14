
/**
 * Write a description of class Zapatilla here.
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (1.0)
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
     * Modifica el modelo de la zapatilla
     */
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    /*
     * Modifica el numero de la zapatilla
     */
    public void setNumero(int numero){
        this.numero=numero;
    }

    /*
     * Modifica el tipo de la zapatilla, comprobando si es un tipo válido
     */
    public void setTipo(String tipo){
        if(tipo.equals("agarre")||tipo.equals("amortiguacion")){
            this.tipo=tipo;
        }
        else{
            System.out.println("El tipo no es correcto");
        }
    }

    /*
     * Modifica el valor 
     */
    public void setValor(double valor){
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
    public int getNumero(){
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

