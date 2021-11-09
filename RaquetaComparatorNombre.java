import java.util.Comparator;
/**
 * Write a description of class RaquetaComparatorNombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaComparatorNombre implements Comparator<Raqueta>
{
    public int compare (Raqueta r1, Raqueta r2){
        return r1.getModelo().compareTo(r2.getModelo());
    }
}
