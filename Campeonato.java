import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
/**
 * Clase que define y maneja todo lo relativo al Campeonato: la lista de tenistas competidores, la lista de tenistas eliminados
 * y como se desarrolla el juego.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class Campeonato
{

    private static Campeonato instance = null;//atributo instanciado unico de Campeonato

    private String nombre;
    private ArrayList< Tenista> competidores; //lista de competidores (sin eliminar).Ordenado por insercion al final.
    private ArrayList< Tenista> eliminados;//lista de competidores eliminados. Ordenado por orden de eliminacion.
    private ArrayList< Zapatilla> zapatillasCampeonato;//lista de zapatillas disponibles.Ordenado por insercion.
    private TreeSet <Raqueta> raquetasCampeonato;// se compara con compareTo

    /**
     * Constructor de Campeonato.
     * @param nombre Nombre del campeonato(String)
     * 
     */
    private Campeonato(String nombre)
    {
        this.nombre=nombre;
        competidores = new ArrayList <Tenista> ();
        eliminados = new ArrayList <Tenista> ();
        zapatillasCampeonato= new ArrayList <> ();
        raquetasCampeonato = new TreeSet <> (new RaquetaComparatorPotencia ());//Se añade el criterio de ordenacion
    }

    /**
     * Añade la zapatilla al final de la estructura de zapatillas.
     * @param z Zapatilla que se va a insertar(Zapatilla)
     */
    public void insertarZapatilla(Zapatilla z){
        zapatillasCampeonato.add(z);
    }

    /**
     * Elimina la primera zapatilla que se llame igual que la indicada de la estructura de zapatillas.
     * @param z Zapatilla que se va a eliminar(Zapatilla)
     */
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

    /**
     * Añade la raqueta de forma ordenada por la potencia y el nombre a la estructura de raquetas. Si ya existe una no lo hace.
     * @param r Raqueta que se va a insertar(Raqueta)
     */
    public void insertarRaqueta(Raqueta r){
        if(!raquetasCampeonato.add(r)){
            System.out.println("Esta raqueta ya está registrada");
        }
    }

    /**
     * Si existen suficientes raquetas asigna una a cada competidor del campeonato.
     * 
     */
    private void asignarRaquetasTodos(){

        if(competidores.size() <= raquetasCampeonato.size()){
            System.out.println("***** Asignando raquetas a tenistas *****");
            escribirFichero("***** Asignando raquetas a tenistas *****\n");
            for (Tenista t : competidores){
                asignarRaquetaIni(t);
                t.getRaqueta().mostrar();
                escribirFichero(t.getRaqueta().toString());
                System.out.println(" asignada a --> "+t.getNombre());
                escribirFichero(" asignada a --> "+t.getNombre()+"\n");
            }

        }
        else{
            System.out.println("No hay suficientes raquetas para todos los competidores");
            escribirFichero("No hay suficientes raquetas para todos los competidores");
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
     * Muestra los datos de todas las raquetas disponibles en el campeonato
     */
    private void mostrarRaquetas (){
        System.out.println("***** Listado de raquetas disponibles: ");
        escribirFichero("***** Listado de raquetas disponibles: \n");
        for(Raqueta r: raquetasCampeonato){
            r.mostrar();
            escribirFichero(r.toString()+"\n");
            System.out.println();
        }
    }

    /**
     * Muestra los datos de todos los tenistas en Competidores
     * 
     */
    private void mostrarCompetidores(){
        System.out.println("***** Listado de competidores: ");
        escribirFichero("***** Listado de competidores: \n");
        for (Tenista t: competidores){
            System.out.print("    **");
            escribirFichero("    **");
            t.mostrar();
            escribirFichero(t.toString());
            escribirFichero("\n");
        }
    }

    /**
     * Muestra los datos de todos los tenistas en Eliminados
     * 
     */
    private void mostrarEliminados(){
        System.out.println("***** Listado de eliminados: ");
        escribirFichero("***** Listado de eliminados: \n");
        for (Tenista t: eliminados){
            System.out.print("    **");
            escribirFichero("    **");
            t.mostrar();
            escribirFichero(t.toString());
            escribirFichero("\n");
        }
    }

    /**
     * Se realiza una ronda de juegos(la mitad del numero
     * de tenistas Competidores). 
     * Si es posible se dan unas zapatillas a los tenistas antes de jugar 
     *  y elimina estas de las zapatillas disponibles del campeonato.
     * Se elimina al jugador perdedor en cada juego.
     * Se muestran los datos del ganador y el perdedor de cada juego.
     * 
     */
    private void ronda(){
        int size = competidores.size();

        for (int i=0; i<size/2;i++){
            System.out.println("\t### Juego ----------->>>: "+i);
            escribirFichero("\t### Juego ----------->>>: "+i+"\n");//#salida
            //asignacion zapatillas
            //##Cambios necesarios aqui
            eliminarZapatilla(competidores.get(i).elegirZapatillas(zapatillasCampeonato));
            eliminarZapatilla(competidores.get(size-i-1).elegirZapatillas(zapatillasCampeonato));

            //Mostrar datos del primer tenista
            System.out.println("\t## Tenista1 ---->>>: "+ competidores.get(i).getNombre());
            escribirFichero("\t## Tenista1 ---->>>: "+ competidores.get(i).getNombre()+"\n");//#salida

            if(competidores.get(i).getAsignacionZapatillas()==true){
                System.out.print("\tZapatillas asignadas:  ");
                escribirFichero("\tZapatillas asignadas:  ");//#salida
                competidores.get(i).getZapatilla().mostrar();
                System.out.println();

                escribirFichero(competidores.get(i).getZapatilla().toString()+"\n");//#salida
            }

            //Mostrar datos del segundo tenista
            System.out.println("\t## Tenista2 ---->>>: "+ competidores.get(size-i-1).getNombre());
            escribirFichero("\t## Tenista2 ---->>>: "+ competidores.get(size-i-1).getNombre()+"\n");//#salida
            if(competidores.get(size-i-1).getAsignacionZapatillas()==true){
                System.out.print("\tZapatillas asignadas:  ");
                escribirFichero("\tZapatillas asignadas:  ");//#salida
                competidores.get(size-i-1).getZapatilla().mostrar();
                System.out.println();
                escribirFichero(competidores.get(size-i-1).getZapatilla().toString()+"\n");//#salida
            }

            //Juego
            competidores.get(i).juego(competidores.get(size-i-1));
            competidores.get(size-i-1).juego(competidores.get(i));

            //Mostrar ganador y eliminado. Organización.
            int orden= eliminados.size()+1;
            if (competidores.get(i).getPuntosAcumulados() == competidores.get(size-i-1).getPuntosAcumulados()){
                if(competidores.get(i).getSaque()+competidores.get(i).getResto() > 
                competidores.get(size-i-1).getSaque()+competidores.get(size-i-1).getResto()){
                    Collections.swap(competidores,i, size-i-1);

                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                    escribirFichero("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.\n");//#salida

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);
                    escribirFichero("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden+"\n");//#salida

                    eliminarTenista(size-i-1);
                }
                else{
                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");

                    escribirFichero("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.\n");//#salida

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);
                    escribirFichero("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden+"\n");//#salida

                    eliminarTenista(size-i-1);
                }
            }
            else{
                if (competidores.get(i).getPuntosAcumulados() < competidores.get(size-i-1).getPuntosAcumulados()){
                    Collections.swap(competidores,i, size-i-1);

                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");

                    escribirFichero("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.\n");//#salida

                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);
                    escribirFichero("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden+"\n");//#salida

                    eliminarTenista(size-i-1);
                }
                else{

                    System.out.println("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.");
                    escribirFichero("\t## Gana este juego: "+ competidores.get(i).getNombre()
                        + " con: " + competidores.get(i).getPuntosAcumulados()+ " puntos acumulados.\n");//#salida
                    System.out.println("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden);
                    escribirFichero("\t## Se elimina: "+competidores.get(size-i-1).getNombre()+
                        " con: " +competidores.get(size-i-1).getPuntosAcumulados()+ " puntos acumulados. Tenista"
                        +" eliminado núm: "+ orden+"\n");//#salida

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
     * Asigna las raquetas a cada tenista y las muestra.
     * Muestra a los tenistas Competidores.
     * Realiza las rondas necesarias hasta que solo quede 1 tenista competidor(GANADOR).
     * Muestra los datos del tenista ganador.
     * Muestra los datos de los tenistas Eliminados.
     * 
     */
    public void competicion(){

        try{

            FileWriter flS= new FileWriter("salida.txt");
            BufferedWriter fS= new BufferedWriter(flS);

            System.out.println("***** Inicio del campeonato: "+nombre+ " *****\n");
            escribirFichero("***** Inicio del campeonato: "+nombre+ " *****\n");

            asignarRaquetasTodos();
            System.out.println();
            mostrarCompetidores();
            mostrarRaquetas();

            int rondas=1;
            while(competidores.size()>=2){
                System.out.println("\n\n***** Ronda---->>>: "+rondas);
                escribirFichero("\n\n***** Ronda---->>>: "+rondas+"\n");//#salida
                ronda();
                resetearPuntos();
                rondas++;
            }   

            System.out.print("\n\n---->>>>  Gana la competición: **");
            escribirFichero("\n\n---->>>>  Gana la competición: **");//#salida
            competidores.get(0).mostrar();
            escribirFichero(competidores.get(0).toString());//#salida
            System.out.println(" <<<<----\n\n");
            escribirFichero(" <<<<----\n\n\n");//#salida

            mostrarEliminados();
        }catch(IOException e){}
    }

    //########################EC3#######################3
    /**
     * Asigna la primera raqueta al tenista y la elimina de la estructura.
     * (Siempre que haya raquetas disponibles).
     * @param t Tenista al que se le asignara una raqueta(Tenista).
     * @return 
     */
    public boolean asignarRaquetaIni(Tenista t){
        boolean disp=false;
        if(!raquetasCampeonato.isEmpty()){

            t.setRaqueta(raquetasCampeonato.pollFirst());

            disp=true;
        }
        return disp;
    }

    /**
     * Asigna la primera raqueta al tenista y la elimina de la estructura.
     * (Siempre que haya raquetas disponibles).
     * @param t Tenista al que se le asignara una raqueta(Tenista).
     * @return 
     */
    public boolean asignarRaqueta(Tenista t){
        boolean disp=false;
        if(!raquetasCampeonato.isEmpty()){

            t.setRaqueta(raquetasCampeonato.pollFirst());
            System.out.println(t.getRaqueta().getTipo()+" modelo="+t.getRaqueta().getModelo()
                +" velocidad="+t.getRaqueta().calcularVelocidad());
            escribirFichero(t.getRaqueta().getTipo()+" modelo="+t.getRaqueta().getModelo()
                +" velocidad="+t.getRaqueta().calcularVelocidad()+"\n");
            disp=true;
        }
        return disp;
    }

    public boolean asignarRaquetaVelocidad(Tenista t){
        boolean disp=false;
        if(!raquetasCampeonato.isEmpty()){
            Raqueta r = null;
            boolean enc = false;
            Iterator <Raqueta> it = raquetasCampeonato.iterator();
            while(it.hasNext() && !enc){
                r = it.next();
                if(t.getRaqueta().calcularVelocidad() < r.calcularVelocidad()){

                    enc = true;
                    t.setRaqueta(r);
                    System.out.println(t.getRaqueta().getTipo()+" modelo="+t.getRaqueta().getModelo()
                        +" velocidad="+t.getRaqueta().calcularVelocidad());
                    escribirFichero(t.getRaqueta().getTipo()+" modelo="+t.getRaqueta().getModelo()
                        +" velocidad="+t.getRaqueta().calcularVelocidad()+"\n");
                    it.remove();
                    disp=true;
                }
            }
        }
        return disp;
    }

    /**
     * Asigna la primera zapatilla que encuentre para el numero de pie del tenista a ese tenista
     * y elimina la zapatilla de la lista.
     * @param t Tenista al que se le asignara (si quedan zapatillas de su numero) unas zapatillas(Tenista).
     */
    public void asignarZapatilla(Tenista t){
        boolean enc=false;
        Zapatilla z = null;
        if(!zapatillasCampeonato.isEmpty()){
            Iterator <Zapatilla> it =  zapatillasCampeonato.iterator();
            while (it.hasNext()&&!enc){
                z= it.next();
                if(t.getNumeroPie() == z.getNumero()){
                    enc=true;
                    t.setAsignacionZapatillas(true);//bandera para saber que se le han asignado zapatillas
                    t.setZapatilla(z);
                    it.remove();
                }
            }
        }

    }

    /**
     * Devuelve la instancia unica de Campeonato, en caso de no existir 
     * la crea con el nombre introducido por el usuario y la devuelve.
     * indicado por el usuario y la devuelve.
     * @return instance Devuelve la instancia unica de Campeonato(Campeonato).
     * 
     */
    public static Campeonato getInstance() {
        if (instance == null){
            System.out.println("No existe ningun campeonato aún. Indica el nombre: ");
            Scanner sc = new Scanner(System.in);
            String nombre= sc.next();
            instance = new Campeonato(nombre);
        }
        return instance;
    }

    /**
     * Devuelve la instancia unica de Campeonato, en caso de no existir 
     * la crea con el nombre por parametro y la devuelve.
     * @param nombre Nombre que se dará al Campeonato(String)
     * @return instance Devuelve la instancia unica de Campeonato(Campeonato).
     * 
     */
    public static Campeonato getInstance(String nombre) {
        if (instance == null){
            instance = new Campeonato(nombre);
        }
        return instance;
    }
    
    /**
     * Escribe la cadena indicada al final de fichero "salida.txt"
     * @param cadena Cadena que se va a escribir(String)
     */
    public void escribirFichero(String cadena){
        try{
            FileWriter flS= new FileWriter("salida.txt", true);
            BufferedWriter fS= new BufferedWriter(flS);

            fS.write(cadena);

            fS.close();

        }catch(IOException e){}
    }
}