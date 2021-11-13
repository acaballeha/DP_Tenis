import java.util.Comparator;
/**
 * Write a description of class ZapatillaComparatorNumero here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class ZapatillaComparatorNumero implements Comparator <Zapatilla>
{
        public int compare (Zapatilla z1, Zapatilla z2){
        if(z1.getNumero() == z2.getNumero()){
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
