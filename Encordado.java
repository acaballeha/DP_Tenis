
/**
 * Enumeration class Encordado - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Encordado
{
    ABIERTO("ABIERTO",2.0,2.2),
    CERRADO("CERRADO",1.8,2.5);
    
    private final String nombre;
    private final double multPotencia;//multiplicador de potencia
    private final double multControl;//multiplicador de control

    Encordado(String nombre, double multPotencia, double multControl){
        this.nombre=nombre;
        this.multPotencia=multPotencia;
        this.multControl=multControl;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getMultPotencia(){
        return multPotencia;
    }
    
    public double getMultControl(){
        return multControl;
    }
    
    @Override
    public String toString(){
        return getNombre();
    }
        
}
