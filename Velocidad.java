import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Velocidad here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class Velocidad
{
    Map <Double, Double > valores ; // <Key, Value>  
    /**
     * Constructor de valores
     */
    public Velocidad()
    {
        // initialise instance variables
        valores= new HashMap <>();

        valores.put(new Double(220), new Double(10));
        valores.put(new Double(260), new Double(8));
        valores.put(new Double(300), new Double(6));
        valores.put(new Double(320), new Double(4));
        valores.put(new Double(340), new Double(2));


        
    }
       /**
     * Devuelve el valor de velocida en relacion a una clave
     * @return velocidad Velocidad de la cabeza(double)
     */
    public double getVelocidad (Double peso){
        return valores.get(peso).doubleValue();
    }

}
