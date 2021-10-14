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

     /**
     * Se añade el tenista al final de a lista Competidores
     * @param t Tenista que se va a inscribir(Tenista)
     * 
     */
    public void inscribir (Tenista t){
        competidores.add(t);
    }

    /**
     * Se añade el tenista indicado por la posicion a la lista de Eliminados
     * (al principio) y se elimina de la lista de Competidores
     * @param i Posicion que ocupa el tenista que 
     * se va a eliminar en Competidores(int)
     * 
     */
    private void eliminar (int i){
                
        eliminados.add(0,competidores.get(i));
        competidores.remove(i);
        
    }

     /**
     * Muestra los datos de todos los tenistas en Competidores
     * 
     */
    private void mostrarCompetidores(){
        System.out.println("***** Listado de competidores: ");
        for (Tenista t: competidores){
            t.mostrar();
            System.out.println();
        }
    }

     /**
     * Muestra los datos de todos los tenistas en Eliminados
     * 
     */
    private void mostrarEliminados(){
        System.out.println("***** Listado de eliminados: ");
        for (Tenista t: eliminados){
            t.mostrar();
            System.out.println();
        }
    }

     /**
     * Juego de un par de tenistas. Uno saca, otro intenta restar y viceversa.
     * @param t1 Tenista que saca primero(Tenista)
     * @param t2 Tenista que saca segundo(Tenista)
     */
    private void juego (Tenista t1, Tenista t2){
        t1.sacar();
        t2.restar(t1);
        t2.sacar();
        t1.restar(t2);
    }

    /**
     * Se realiza una ronda de juegos(la mitad del numero
     * de tenistas Competidores). 
     * Se elimina al jugador perdedor en cada juego.
     * Se muestran los datos del ganador y el perdedor de cada juego.
     * 
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

    /**
     * Pone a 0 todos los puntos acumulados de todos los tenistas Competidores.
     * 
     */
    private void resetearPuntos(){
        for (Tenista t: competidores){
            t.resetearPuntos();
        }
    }

    /**
     * Inicia el campeonato.
     * Muestra el nombre del campeonato.
     * Muestra a los tenistas Competidores.
     * Realiza las rondas necesarias hasta que solo quede 1 tenista competidor(GANADOR).
     * Muestra los datos del tenista ganador.
     * Muestra los datos de los tenistas Eliminados.
     * 
     */
    public void competicion(){
        System.out.println("***** Inicio del campeonato: "+nombre+ " *****\n");
        mostrarCompetidores();

        int rondas=1;
        while(competidores.size()>=2){
            System.out.println("\n\n***** Ronda---->>>: "+rondas);
            ronda();
            resetearPuntos();
            rondas++;
        }   

        System.out.print("\n\n---->>>>  Gana la competición: ");
        competidores.get(0).mostrar();
        System.out.println(" <<<<----\n\n");

        mostrarEliminados();
    }
}
