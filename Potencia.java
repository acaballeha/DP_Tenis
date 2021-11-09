import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Potencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potencia
{
    Map <Double, Double > valores ; // <Key, Value>  

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
    
    public double getPotencia (Double longitud){
        return valores.get(longitud);
    }

}
