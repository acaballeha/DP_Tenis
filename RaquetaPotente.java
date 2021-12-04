
/**
 * Subtipo de Raqueta
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class RaquetaPotente extends RaquetaGenerica
{
    /**
     * Constructor
     * @param modelo Nombre de la raqueta(String)
     * @param peso Peso de la raqueta(double)
     * @param longitud Longitud de la raqueta(double)
     * @param tamanoCabeza Tamaño de la cabeza de la raqueta(double)
     * @param encordado Encordado de la raqueta(Encordado)
     */
    public RaquetaPotente(String modelo, double peso,
    double longitud, double tamanoCabeza, Encordado encordado)
    {
        super(modelo,peso,longitud,tamanoCabeza,encordado);
    }

    /**
     * Devuelve el valor de potencia relativa a la longitud 
     * multiplicado por el multiplicador de potencia del encordado
     * @return potencia Potencia de la raqueta(double)
     * 
     */
    @Override
    public double calcularPotencia(){
        return super.calcularPotencia() * super.getMultPotencia();
    }

    /**
     * Devuelve el valor de velocidad relativa al peso 
     * multiplicado por 1.5
     * @return velocidad Velocidad de la raqueta(double)
     * 
     */
    @Override
    public double calcularVelocidad(){
        return super.calcularVelocidad() * 1.5;
    }

    /**
     * Muestra todos los datos de la raqueta potente. No hace salto de linea al acabar.
     */
    @Override
    public void mostrar(){
        System.out.print("\t**RaquetaPotente(Encordado:"+
        getEncordado().toString()+")");
        super.mostrar();
    }
}
