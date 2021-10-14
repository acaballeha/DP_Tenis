import java.util.*;

/**
 * Clase que define y maneja todo lo relativo al Campeonato
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (1.0)
 */
public class Campeonato
{
    private String nombre;
    private ArrayList< Tenista> competidores; 
    private ArrayList< Tenista> eliminados;
    
    /**
     * Constructor de Campeonato.
     * @param nombre Nombre del campeonato(String)
     * 
     */
    public Campeonato(String nombre)
    {
        this.nombre=nombre;
        competidores = new ArrayList <Tenista> ();
        eliminados = new ArrayList <Tenista> ();
    }

    /*
     * @param:{Tenista}
     * @return:{Añade el tenista t al final de Competidores}
     */
    public void inscribir (Tenista t){
        competidores.add(t);
    }

    /**
     * 
     * @param Tenista Tenista que sera eliminado
     * 
     */
    
    private void eliminar (int i){
                
        eliminados.add(competidores.get(i));
        competidores.remove(i);
        
    }

    /*
     * @param:{}
     * @return:{Muestra todos los datos de todos los tenistas en Competidores}
     */
    private void mostrarCompetidores(){
        System.out.println("***** Listado de competidores: ");
        for (Tenista t: competidores){
            t.mostrar();
            System.out.println();
        }
    }

    /*
     * @param:{}
     * @return:{Muestra todos los datos de todos los tenistas en Eliminados}
     */
    private void mostrarEliminados(){
        System.out.println("***** Listado de eliminados: ");
        for (Tenista t: eliminados){
            t.mostrar();
            System.out.println();
        }
    }

    /*
     * @param:{Tenista, Tenista}
     * @return:{}
     * Se calculan los puntos despues de el juego de tenistas t1 y t2
     */
    private void juego (Tenista t1, Tenista t2){
        t1.sacar();
        t2.restar(t1);
        t2.sacar();
        t1.restar(t2);
    }

    /*
     * @param:{}
     * @return:{}
     * Se realizan todos los juegos correspondientes a la ronda(tantas veces como la mitad del numero de tenistas)
     * Se muestra quien gana y pierde en cada juego, además de sus puntos acumulados.
     */
    private void ronda(){
        int size = competidores.size();

        for (int i=0; i<size/2;i++){
            System.out.println(" ### Juego ----------->>>: "+i);
            System.out.println("  ## Tenista1 ---->>>: "+ competidores.get(i).getNombre());
            System.out.println("  ## Tenista2 ---->>>: "+ competidores.get(size-i-1).getNombre());
            juego (competidores.get(i), competidores.get(size-i-1));
            int orden= eliminados.size()+1;
            if (competidores.get(i).getPuntosAcumulados() == competidores.get(size-i-1).getPuntosAcumulados()){
                if(competidores.get(i).getSaque()+competidores.get(i).getResto() > 
                competidores.get(size-i-1).getSaque()+competidores.get(size-i-1).getResto()){
                    Collections.swap(competidores,i, size-i-1);

                    System.out.println("  ## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                        
                    System.out.println("  ## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado numero "+ orden);

                    eliminar(size-i-1);
                }
                else{
                    System.out.println("  ## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                        
                    System.out.println("  ## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado numero "+ orden);

                    eliminar(size-i-1);
                }
            }
            else{
                if (competidores.get(i).getPuntosAcumulados() < competidores.get(size-i-1).getPuntosAcumulados()){
                    Collections.swap(competidores,i, size-i-1);

                    System.out.println("  ## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                        
                    System.out.println("  ## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado numero "+ orden);

                    eliminar(size-i-1);
                }
                else{

                    System.out.println("  ## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                        
                    System.out.println("  ## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado numero "+ orden);

                    eliminar(size-i-1);
                }
            }

        }
    }

    /*
     * @param:{}
     * @return:{Pone a 0 los puntos acumulados de todos los tenistas competidores}
     */
    private void resetearPuntos(){
        for (Tenista t: competidores){
            t.resetearPuntos();
        }
    }

    /*
     * @param:{}
     * @return:{}
     * Inicia la competicion. 
     * Muestra los tenistas competidores.
     * Se ejecutan tantas rondas como hagan falta para que al final solo quede un tenista(ganador).
     * Muestra al ganador.
     * Muestra los tenistas eliminados.
     */
    public void competicion(){
        System.out.println("***** Inicio del campeonato: "+nombre+ " *****\n");
        mostrarCompetidores();

        int i=1;
        while(competidores.size()>=2){
            System.out.println("\n\n***** Ronda---->>>: "+i);
            ronda();
            resetearPuntos();
            i++;
        }   

        System.out.print("\n\n---->>>>  Gana la competición: ");
        competidores.get(0).mostrar();
        System.out.println(" <<<<----\n\n");

        mostrarEliminados();
    }
}
