
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
    private double tamanoDeLaCabeza;
    private Encordado encordado;
    /**
     * Constructor for objects of class RaquetaGenerica
     */
    public RaquetaGenerica(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, String encordado)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
        this.encordado=Encordado.valueOf(encordado);

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

    public void setTamanoDeLaCabeza (double tamanoDeLaCabeza){
        this.tamanoDeLaCabeza = tamanoDeLaCabeza;
    }

    public void setEncordado (String encordado){
        this.encordado=Encordado.valueOf(encordado);
    }

    public String getModelo (){
        return modelo;
    }

    public double peso (){
        return peso;
    }

    public double longitud (){
        return longitud;
    }

    public double tamanoDeLaCabeza (){
        return tamanoDeLaCabeza;
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

    public void mostrar(){
        System.out.println();

    }

    public double calcularPotencia(){
        Potencia p = new Potencia ();
        return p.getPotencia( new Double (longitud));

    }
    public double calcularControl(){
        Control c = new Control ();
        return c.getControl( new Double (tamanoDeLaCabeza));

    }

    public double calcularVelocidad(){
        Velocidad v = new Velocidad();    
        return v.getVelocidad( new Double (peso));

    }
}

