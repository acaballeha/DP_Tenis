import java.util.Comparator;
/**
 * Write a description of class ZapatillaComparatorNumero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillaComparatorNumero implements Comparator <Zapatilla>
{
        public int compare (Zapatilla z1, Zapatilla z2){
        if(z1.getNumero() == z2.getNumero()){
            // return z1.getModelo().compareTo(z2.getModelo());
            return 0;
        }
        else if(z1.getNumero() > z2.getNumero()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
