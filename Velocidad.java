import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Velocidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velocidad
{
    Map <Double, Double > valores ; // <Key, Value>  

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
    
    public double getVelocidad (Double peso){
        return valores.get(peso).doubleValue();
    }

}
