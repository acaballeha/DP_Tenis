import java.util.Comparator;
/**
 * Write a description of class TenistaComparator here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class TenistaComparatorPuntos implements Comparator<Tenista>
{
    public int compare (Tenista t1, Tenista t2){
        if(t1.getPuntosAcumulados()==t2.getPuntosAcumulados()){
            return t1.getNombre().compareTo(t2.getNombre()); //En caso de igualdad por los puntos, compara por el nombre
        }
        else if (t1.getPuntosAcumulados() > t2.getPuntosAcumulados()){
            return 1;
        }
        else{
            return -1;
        }
    }  

}
