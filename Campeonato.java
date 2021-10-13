import java.util.*;

/**
 * Write a description of class Campeonato here.
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (a version number or a date)
 */
public class Campeonato
{
    private String nombre;
    private ArrayList< Tenista> competidores; 
    private ArrayList< Tenista> eliminados;

    public Campeonato(String nombre)
    {
        this.nombre=nombre;
        competidores = new ArrayList <Tenista> ();
        eliminados = new ArrayList <Tenista> ();
    }

    /*
     * Inscribe al tenista t en la lista de competidores
     */
    public void inscribir (Tenista t){
        competidores.add(t);
    }

    /*
     * Elimina al tenista t de la lista de competidores y lo añade 
     * al inicio de la lista de eliminados
     */
    public void eliminar (Tenista t){
        //competidores.remove(t); Otra forma de hacerlo
        boolean enc=false;
        for(int i=0;i < competidores.size()&& !enc ;i++){
            if(t.equals(competidores.get(i))){
                enc=true;
                competidores.remove(i);
            }
        }
        if(enc){
            eliminados.add(0,t);
        }
    }

    /*
     * Muestra los tenistas competidores del campeonato
     */

    public void mostrarCompetidores(){
        System.out.println("***** Listado de competidores: ");
        for (Tenista t: competidores){
            t.mostrar();
            System.out.println();
        }
    }

    /*
     * Muestra los tenistas eliminados del campeonato
     */
    public void mostrarEliminados(){
        System.out.println("***** Listado de eliminados: ");
        for (Tenista t: eliminados){
            t.mostrar();
            System.out.println();
        }
    }

    /*
     * Juegan tenista t1 contra tenista t2. Primero t1 saca y t2 intenta restar, y luego al reves.
     */
    public void juego (Tenista t1, Tenista t2){
        t1.sacar();
        t2.restar(t1);
        t2.sacar();
        t1.restar(t2);
    }

    /*
     * Juegan pares de tenistas de los dos extremos de la lista de competidores hacia el centro de esta.
     * El jugador que consigue menos puntos queda eliminado. En caso de empate, se decide ganador al jugador con menos total
     * en la suma de sus velocidades de resto y saque.
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
                    eliminar(competidores.get(size-i-1));
                }
                else{
                    System.out.println("  ## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                    System.out.println("  ## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado numero "+ orden);
                    eliminar(competidores.get(size-i-1));
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
                    eliminar(competidores.get(size-i-1));
                }
                else{

                    System.out.println("  ## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                    System.out.println("  ## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado numero "+ orden);
                    eliminar(competidores.get(size-i-1));
                }
            }

        }
    }
    
    /*
     * Devuelve la cantidad de puntos acumulados de todos los tenistas competidores a 0
     */
    public void resetearPuntos(){
        for (Tenista t: competidores){
            t.resetearPuntos();
        }
    }
    /*
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
