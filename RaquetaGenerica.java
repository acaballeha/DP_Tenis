
/**
 * Write a description of class RaquetaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     */
    public RaquetaGenerica(String modelo, double peso,
    double longitud, double tamanoCabeza, Encordado encordado)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoCabeza=tamanoCabeza;
        //this.encordado=Encordado.valueOf(encordado);
        this.encordado=encordado;

    }
     public RaquetaGenerica(String modelo, double peso,
    double longitud, double tamanoCabeza)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoCabeza=tamanoCabeza;
        //this.encordado=Encordado.valueOf(encordado);
        this.encordado=null;

    }

    
    public void setModelo (String modelo){
        this.modelo=modelo;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public void setLongitud (double longitud){
        this.longitud = longitud;
    }

    public void setTamanoCabeza (double tamanoCabeza){
        this.tamanoCabeza = tamanoCabeza;
    }

    public void setEncordado (String encordado){
        this.encordado=Encordado.valueOf(encordado);
    }

    public String getModelo (){
        return modelo;
    }

    public double getPeso (){
        return peso;
    }

    public double getLongitud (){
        return longitud;
    }

    public double getTamanoCabeza (){
        return tamanoCabeza;
    }

    public String getEncordado (){
        return encordado.getNombre();
    }

    public double getMultPotencia(){
        return encordado.getMultPotencia();
    }

    public double getMultControl(){
        return encordado.getMultControl();
    }

    public abstract void mostrar();

    public double calcularPotencia(){
        Potencia p = new Potencia ();
        return p.getPotencia( new Double (longitud));

    }
    public double calcularControl(){
        Control c = new Control ();
        return c.getControl( new Double (tamanoCabeza));

    }

    public double calcularVelocidad(){
        Velocidad v = new Velocidad();    
        return v.getVelocidad( new Double (peso));

    }
    
    
}

