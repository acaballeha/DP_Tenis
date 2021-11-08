
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaEquilibrada extends RaquetaGenerica
{
    private double multiPotencia;
    private double multiControl;
    
    
    
    public RaquetaEquilibrada(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, String encordado,double multiPotencia,double multiControl)
    {
        super(modelo,peso,longitud,tamanoDeLaCabeza,encordado);
        this.multiPotencia=multiPotencia;
        this.multiControl=multiControl;
    }
    
    @Override
    public double getMultPotencia(){
        return multiPotencia;
    }
    
    @Override
    public double getMultControl(){
        return multiControl;
    }
    
    
    @Override
    public double calcularPotencia(){
        return super.calcularPotencia() * super.getMultPotencia();
    }

    @Override
    public double calcularVelocidad(){
        return super.calcularVelocidad() * 1.5;
    }

    @Override
    public void mostrar(){
    }
}
