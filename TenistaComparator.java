import java.util.Comparator;
/**
 * Write a description of class TenistaComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenistaComparator implements Comparator<Tenista>
{
    public int compare (Tenista t1, Tenista t2){
        if(t1.getPuntosAcumulados()==t2.getPuntosAcumulados()){
            return 0;
        }
        else if (t1.getPuntosAcumulados() > t2.getPuntosAcumulados()){
            return 1;
        }
        else{
            return -1;
        }
    }  
}
