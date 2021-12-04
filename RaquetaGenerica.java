
/**
 * Clase con las funcionalidades comunes a todas las raquetas.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public abstract class RaquetaGenerica implements Raqueta
{    
    private String modelo;
    private double peso;
    private double longitud;
    private double tamanoCabeza;
    private Encordado encordado;
    /**
     * Constructor for objects of class RaquetaGenerica
     * @param modelo Nombre de la raqueta(String)
     * @param peso Peso de la raqueta(double)
     * @param longitud Longitud de la raqueta(double)
     * @param tamanoCabeza Tamaó de la cabeza de la raqueta(double)
     * @param encordado Encordado de la raqueta(Encordado)
     */
    public RaquetaGenerica(String modelo, double peso,
    double longitud, double tamanoCabeza, Encordado encordado)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoCabeza=tamanoCabeza;
        //this.encordado=Encordado.valueOf(encordado); Para el caso de definir el encordado con un String
        this.encordado=encordado;

    }

    /**
     * Constructor alternativo sin especificar el encordado
     */
    public RaquetaGenerica(String modelo, double peso,
    double longitud, double tamanoCabeza)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoCabeza=tamanoCabeza;
        this.encordado=null;

    }

    /**
     * @param modelo Nombre de la raqueta(String)
     */
    public void setModelo (String modelo){
        this.modelo=modelo;
    }

    /**
     * @param pes Peso de la raqueta(double)
     */
    public void setPeso (double peso){
        this.peso = peso;
    }

    /**
     * @param longitud Longitud de la raqueta(double)
     */
    public void setLongitud (double longitud){
        this.longitud = longitud;
    }

    /**
     * @param tamanoCabeza Tamaño de la cabeza de la raqueta(double)
     */
    public void setTamanoCabeza (double tamanoCabeza){
        this.tamanoCabeza = tamanoCabeza;
    }

    /**
     * @param encordado Nombre del encordado de la raqueta(String)
     */
    public void setEncordado (String encordado){
        this.encordado=Encordado.valueOf(encordado);
    }

    /**
     * @return modelo Nombre de la raqueta(String)
     */
    public String getModelo (){
        return modelo;
    }

    /**
     * @return peso Peso de la raqueta(double)
     */
    public double getPeso (){
        return peso;
    }

    /**
     * @return longitud Longitud de la raqueta(double)
     */
    public double getLongitud (){
        return longitud;
    }

    /**
     * @return tamanoCabeza Tamaño de la cabeza de la raqueta(double)
     */
    public double getTamanoCabeza (){
        return tamanoCabeza;
    }

    /**
     * @return encordado Nombre del encordado de la raqueta(String)
     */
    public String getEncordado (){
        return encordado.getNombre();
    }

    /**
     * @return multPotencia Multiplicador de potencia de la raqueta(double)
     */   
    public double getMultPotencia(){
        return encordado.getMultPotencia();
    }

    /**
     * @return multControl Multiplicador de control de la raqueta(double)
     */
    public double getMultControl(){
        return encordado.getMultControl();
    }

    /**
     * Muestra la informacion de la raqueta
     */
    public  void mostrar(){
        System.out.println("(MultiplicadorDePotencia:"+getMultPotencia()+
        ")(MultiplicadorDeControl:"+getMultControl()+")");
        System.out.print("\t[modelo="+getModelo()+
            "\n\tlongitud: "+getLongitud()       +",potencia asociada: "+calcularPotencia()+
            "\n\ttamaño: "  + getTamanoCabeza()  +",control asociado: "+calcularControl()+
            "\n\tpeso: "    + getPeso()          + ",velocidad Asociada: "+calcularVelocidad());
        //no hace salto de linea al final
        
    }

    /**
     * Devuelve la potencia de la raqueta en funcion de la longitud de la misma.
     * @return potencia Potencia de la raqueta(double)
     */
    public double calcularPotencia(){
        Potencia p = new Potencia ();
        return p.getPotencia(new Double (longitud));

    }

    /**
     * Devuelve el control de la raqueta en funcion del tamaño de la cabeza de la misma.
     * @return control Control de la raqueta(double)
     */
    public double calcularControl(){
        Control c = new Control ();
        return c.getControl( new Double (tamanoCabeza));

    }

    /**
     * Devuelve la velocidad de la raqueta en funcion del peso de la misma.
     * @return velocidad Velocidad de la raqueta(double)
     */
    public double calcularVelocidad(){
        Velocidad v = new Velocidad();    
        return v.getVelocidad( new Double (peso));

    }

}
