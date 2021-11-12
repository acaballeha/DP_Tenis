
/**
 * Write a description of class ZapatillaAmortiguacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillaAmortiguacion extends ZapatillaGenerica
{

    /**
     * Constructor for objects of class ZapatillaAmortiguacion
     */
    public ZapatillaAmortiguacion(String modelo, int numero, double valor){
        super(modelo,numero,valor);
    }
    
    
    @Override
    
    public double calcularValorSaque(){
        return super.calcularValorSaque() * 1.8;
    }
    
    @Override
    public void mostrar(){
         System.out.print(" ZapatillasConAmortiguación [Modelo="+ getModelo()+ ", Numero=" + getNumero() + ", Valor="+ getValor() + "]");
    }
}
