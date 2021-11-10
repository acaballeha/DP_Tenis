import java.util.Comparator;
/**
 * Write a description of class RaquetaComparatorPotencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaComparatorPotencia implements Comparator<Raqueta>
{
    public int compare (Raqueta r1, Raqueta r2){
        if(r1.calcularPotencia() == r2.calcularPotencia()){
            return 0;
        }
        else if(r1.calcularPotencia() > r2.calcularPotencia()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
