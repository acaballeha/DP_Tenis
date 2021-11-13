import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Potencia here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class Potencia
{
    Map <Double, Double > valores ; // <Key, Value>  
    /**
     * Constructor de valores
     */
    public Potencia()
    {
        // initialise instance variables
        valores= new HashMap <>();

        valores.put(new Double(680), new Double(2));
        valores.put(new Double(690), new Double(4));
        valores.put(new Double(700), new Double(6));
        valores.put(new Double(720), new Double(8));
        valores.put(new Double(740), new Double(10));


        
    }
     /**
     * Devuelve el valor de potencia en relacion a una clave
     * @return potencia Potencia de la cabeza(double)
     */
    public double getPotencia (Double longitud){
        return valores.get(longitud).doubleValue();
    }

}
