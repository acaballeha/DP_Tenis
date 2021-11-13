
/**
 * Enumeration class Encordado - write a description of the enum class here
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public enum Encordado
{
    ABIERTO("ABIERTO",2.0,2.2),

    CERRADO("CERRADO",1.8,2.5);

    private final String nombre;
    private final double multPotencia;//multiplicador de potencia
    private final double multControl;//multiplicador de control
    /**
     * Constructor
     * @param nombre Nombre del tipo de encordado(String
     * @param multPotencia Multiplicador de potencia del encordado(double)
     * @param multControl Multiplicador de control del encordado(double)
     */
    Encordado(String nombre, double multPotencia, double multControl){
        this.nombre=nombre;
        this.multPotencia=multPotencia;
        this.multControl=multControl;
    }

    /**
     * @return nombre Nombre del tipo de encordado(String)
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return multPotencia Multiplicador de potencia del encordado(double)
     */
    public double getMultPotencia(){
        return multPotencia;
    }
    /**
     * @return multControl Multiplicador de control del encordado(double)
     */
    public double getMultControl(){
        return multControl;
    }
    /**
     * @return nombre Nombre del tipo de encordado(String)
     */
    @Override
    public String toString(){
        return getNombre();
    }

}
