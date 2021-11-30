
/**
 * Subtipo de Zapatilla de tipo Agarre. Estas zapatillas mejoran la capacidad de resto del tenista.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
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

    /**
     * Multiplica el resto original de las zapatillas por 1.7
     * 
     * @return valorResto(double)
     */
    public double calcularValorResto(){
        return super.calcularValorResto() * 1.7;
    }

    /**
     * Muestra toda la informacion de las zapatillas
     */
    @Override
    public void mostrar(){
        System.out.print("ZapatillasConAgarre ");
        super.mostrar();
    }
}
