
/**
 * Write a description of class ZapatillaAmortiguacion here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class ZapatillaAmortiguacion extends ZapatillaGenerica
{

    /**
     * Constructor for objects of class ZapatillaAmortiguacion
     */
    public ZapatillaAmortiguacion(String modelo, int numero, double valor){
        super(modelo,numero,valor);
    }

    /**
     * Multiplica el valor de saque original por 1.8
     * @return valorSaque(double)
     */
    @Override
    public double calcularValorSaque(){
        return super.calcularValorSaque() * 1.8;
    }

    /**
     * Muestra toda la informacion de las zapatillas
     */
    @Override
    public void mostrar(){
        System.out.print(this.toString());

    }

    @Override
    /**
     * Devuelve en un string con la información de la zapatilla
     * @return str Informacion de la zapatilla(String)
     */
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("ZapatillasAmortiguadas ");
        str.append(super.toString());

        return str.toString();
    }
}
