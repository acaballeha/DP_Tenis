
/**
 * Clase que define las zapatillas que usan los tenistas.
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
     * @param modelo nombre del modelo de la zapatilla
     * @param numero numero de la zapatilla
     * @param tipo tipo de la zapatilla("agarre", "amortiguacion")
     * @param valor valor de la zapatilla
     */
    public Zapatilla(String modelo, int numero, String tipo, double valor)
    {
        this.modelo=modelo;
        this.numero=numero;
        this.tipo=tipo;
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
     * @param tipo tipo de la zapatilla("agarre", "amortiguacion")(String)
     */
    public void setTipo(String tipo){
        if(tipo.equals("agarre")||tipo.equals("amortiguacion")){
            this.tipo=tipo;
        }
        else{
            System.out.println("El tipo no es correcto");
        }
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
     * @return tipo(String)
     */
    public String getTipo(){
        return tipo;
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

    /**
     * Si las zapatillas son tipo "amortiguacion" multiplica el valor de la zaptilla por 2, si no devuelve
     * unicamente el valor
     * @return valorSaque(double) 
     */
    public double calcularValorSaque(){
        if(tipo.equals ("amortiguacion")){
            return valor * 2;    
        }
        return valor;
    }

    /**
     * Si las zapatillas son tipo "agarre" multiplica el valor de la zaptilla por 1.5, si no devuelve
     * unicamente el valor
     * @return valorResto(double) 
     */
    public double calcularValorResto(){
        if(tipo.equals ("agarre")){
            return valor * 1.5;    
        }
        return valor;
    }

    /**
     * 
     * Muestra toda la informacion de la zapatilla
     *  
     */
    public void mostrar (){
        System.out.print(" Zapatilla [Modelo="+ modelo+ ", Numero=" + numero + ", Tipo="+tipo + ", Valor="+ valor + "]");
    }
}

