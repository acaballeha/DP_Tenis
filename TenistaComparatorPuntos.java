import java.util.Comparator;
/**
 * Write a description of class TenistaComparator here.
 * 
 * @author (Javier Tello Blazquez, Miguel Izquierdo Rojo, Antonio Caballero Carrasco) 
 * @version (a version number or a date)
 */
public class TenistaComparatorPuntos implements Comparator<Tenista>
{
    public int compare (Tenista t1, Tenista t2){
        if(t1.getPuntosAcumulados()==t2.getPuntosAcumulados()){
            return t1.getNombre().compareTo(t2.getNombre());
        }
        else if (t1.getPuntosAcumulados() > t2.getPuntosAcumulados()){
            return 1;
        }
        else{
            return -1;
        }
    }  
    
    
}
