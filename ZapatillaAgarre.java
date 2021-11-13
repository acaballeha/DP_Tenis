
/**
 * Write a description of class ZapatillaAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillaAgarre extends ZapatillaGenerica
{
    /**
     * Constructor for objects of class ZapatillaAgarre
     */
    public ZapatillaAgarre(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
    }
    
    public double calcularValorResto(){
        return super.calcularValorResto() * 1.7;
    }
    
    @Override
    public void mostrar(){
        System.out.print("ZapatillasConAgarre [Modelo="+ getModelo()+ ", Numero=" + getNumero() + ", Valor="+ getValor() + "]");
    }
}
