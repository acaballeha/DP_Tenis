import java.util.Map;
import java.util.HashMap;
/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Control
{
    Map <Double, Double > valores ; // <Key, Value>  

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
    
    public double getControl (Double tamanoCabeza){
        return valores.get(tamanoCabeza);
    }

}
