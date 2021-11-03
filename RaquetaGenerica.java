
/**
 * Write a description of class RaquetaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaGenerica implements Raqueta
{
    // instance variables - replace the example below with your own
    private String modelo;
    private float peso;
    private float longitud;
    private float tamanoDeLaCabeza;
    private Encordado encordado;
    /**
     * Constructor for objects of class RaquetaGenerica
     */
    public RaquetaGenerica(String modelo, int peso,
    int longitud, int tamanoDeLaCabeza, String encordado)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
        this.encordado=Encordado.valueOf(encordado);
        
        
    }
    
}
    
    

