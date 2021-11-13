import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Control here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class Control
{
    Map <Double, Double > valores ; // <Key, Value>  
    /**
     * Constructor de valores
     */
    public Control()
    {
        // initialise instance variables
        valores= new HashMap <>();

        valores.put(new Double(600), new Double(10));
        valores.put(new Double(630), new Double(8));
        valores.put(new Double(650), new Double(6));
        valores.put(new Double(680), new Double(4));
        valores.put(new Double(720), new Double(2));


        
    }
    /**
     * Devuelve el valor de control en relacion a una clave
     * @return control Control de la cabeza(double)
     */
    public double getControl (Double tamanoCabeza){
        return valores.get(tamanoCabeza).doubleValue();
    }

}
