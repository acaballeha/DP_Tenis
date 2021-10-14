
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
    /*
     * @param: { modelo de zapatilla, numero de zapatilla, tipo de zapatilla ("agarre", "amortiguacion"), valor de zapatilla}
     * @return: {}
     */
    public Zapatilla(String modelo, int numero, String tipo, double valor)
    {
        this.modelo=modelo;
        this.numero=numero;
        this.tipo=tipo;
        this.valor=valor;
    }

    /*
     * @param: {modelo de zapatilla}
     * @return:{}
     */
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    /*
     * @param:{numero de zapatilla}
     * @return:{}
     */
    public void setNumero(int numero){
        this.numero=numero;
    }

    /*
     * @param:{tipo de zapatilla ("agarre", "amortiguacion")}
     * @return:{}
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
     * @param:{valor de zapatilla}
     * @return:{}
     */
    public void setValor(double valor){
        this.valor=valor;
    }

    /*
     * @param:{}
     * @return:{modelo de la zapatilla}
     */
    public String getModelo(){
        return modelo;
    }

    /*
     * @param:{}
     * @return:{modelo de la zapatilla}
     */
    public String getTipo(){
        return tipo;
    }

    /*
     * @param:{}
     * @return:{valor de la zapatilla}
     */
    public double getValor(){
        return valor;
    }

    /*
     * @param:{}
     * @return:{numero de la zapatilla}
     */
    public int getNumero(){
        return numero;
    }

    /*
     * @param:{}
     * @return:{Si tipo="amortiguacion"->valor*2, si no ->valor}
     */
    public double calcularValorSaque(){
        if(tipo.equals ("amortiguacion")){
            return valor * 2;    
        }
        return valor;
    }

    /*
     * @param:{}
     * @return:{Si tipo="agarre"->valor*1.5, si no ->valor}
     */
    public double calcularValorResto(){
        if(tipo.equals ("agarre")){
            return valor * 1.5;    
        }
        return valor;
    }

    /*
     * @param:{}
     * @return:{Muestra por pantalla todos los datos de zapatilla}
     */
    public void mostrar (){
        System.out.print(" Zapatilla [Modelo="+ modelo+ ", Numero=" + numero + ", Tipo="+tipo + ", Valor="+ valor + "]");
    }
}

