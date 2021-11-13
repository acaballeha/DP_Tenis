import java.util.*;

/**
 * Clase que define y maneja todo lo relativo al Campeonato: la lista de tenistas competidores, la lista de tenistas eliminados
 * y como se desarrolla el juego.
 * 
 * @author (Javier Tello Blázquez, Antonio Caballero Carrasco, Miguel Izquierdo Rojo) 
 * @version (1.0)
 */
public class Campeonato
{
    private String nombre;
    private ArrayList< Tenista> competidores; 
    private ArrayList< Tenista> eliminados;
    private ArrayList< Zapatilla> zapatillasCampeonato;
    private TreeSet <Raqueta> raquetasCampeonato;// se compara con compareTo

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
        zapatillasCampeonato= new ArrayList <> ();
        raquetasCampeonato = new TreeSet <> (new RaquetaComparatorPotencia ());
    }

    public void insertarZapatilla(Zapatilla z){
        zapatillasCampeonato.add(z);
    }

    private void eliminarZapatilla(Zapatilla z){
        Zapatilla aux;
        boolean enc = false;
        if(z != null){
            Iterator <Zapatilla> it =  zapatillasCampeonato.iterator();
            while (it.hasNext()&&!enc){
                aux= it.next();
                if(aux.getModelo() == z.getModelo()){
                    enc = true;
                    it.remove();
                }
            }

        }

    }
 

    public void insertarRaqueta(Raqueta r){

        if(!raquetasCampeonato.add(r)){
            System.out.println("Esta raqueta ya está registrada");
        }
    }

    public void asignarRaquetas(){

        if(competidores.size() <= raquetasCampeonato.size()){
            System.out.println("***** Asignando raquetas a tenistas *****");
            Iterator <Raqueta> it =  raquetasCampeonato.iterator();
            Raqueta aux;
            for (Tenista t : competidores){
                aux = it.next();
                t.setRaqueta(aux);
                aux.mostrar();
                System.out.println(" asignada a --> "+t.getNombre());
            }

        }
        else{
            System.out.println("No hay suficientes"+ 
                "raquetas para todos los competidores");
        }
    }

    /**
     * Se añade el tenista al final de a lista Competidores
     * @param t Tenista que se va a inscribir(Tenista)
     * 
     */
    public void inscribirTenista (Tenista t){
        competidores.add(t);
    }

    /**
     * Se añade el tenista indicado por la posicion a la lista de Eliminados
     * (al principio) y se elimina de la lista de Competidores
     * @param i Posicion que ocupa el tenista que 
     * se va a eliminar en Competidores(int)
     * 
     */
    private void eliminarTenista (int i){

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
            System.out.print("    **");
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
            System.out.print("    **");
            t.mostrar();
            System.out.println();
        }
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
            System.out.println("\t### Juego ----------->>>: "+i);
            System.out.println("\t## Tenista1 ---->>>: "+ competidores.get(i).getNombre());

            eliminarZapatilla(competidores.get(i).elegirZapatillas(zapatillasCampeonato));
            eliminarZapatilla(competidores.get(size-i-1).elegirZapatillas(zapatillasCampeonato));

            if(competidores.get(i).getAsignacionZapatillas()==true){
                System.out.print("Zapatillas asignadas:  ");
                competidores.get(i).getZapatilla().mostrar();
                System.out.println();
            }
            System.out.println("\t## Tenista2 ---->>>: "+ competidores.get(size-i-1).getNombre());
            if(competidores.get(size-i-1).getAsignacionZapatillas()==true){
                System.out.print("Zapatillas asignadas:  ");
                competidores.get(size-i-1).getZapatilla().mostrar();
                System.out.println();
            }
            competidores.get(i).juego(competidores.get(size-i-1));
            int orden= eliminados.size()+1;
            if (competidores.get(i).getPuntosAcumulados() == competidores.get(size-i-1).getPuntosAcumulados()){
                if(competidores.get(i).getSaque()+competidores.get(i).getResto() > 
                competidores.get(size-i-1).getSaque()+competidores.get(size-i-1).getResto()){
                    Collections.swap(competidores,i, size-i-1);

                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);

                    eliminarTenista(size-i-1);
                }
                else{
                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);

                    eliminarTenista(size-i-1);
                }
            }
            else{
                if (competidores.get(i).getPuntosAcumulados() < competidores.get(size-i-1).getPuntosAcumulados()){
                    Collections.swap(competidores,i, size-i-1);

                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);

                    eliminarTenista(size-i-1);
                }
                else{

                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);

                    eliminarTenista(size-i-1);
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

        asignarRaquetas();
        System.out.println();
        mostrarCompetidores();
        
        int rondas=1;
        while(competidores.size()>=2){
            System.out.println("\n\n***** Ronda---->>>: "+rondas);
            ronda();
            resetearPuntos();
            rondas++;
        }   

        System.out.print("\n\n---->>>>  Gana la competición: **");
        competidores.get(0).mostrar();
        System.out.println(" <<<<----\n\n");

        mostrarEliminados();
    }
}
