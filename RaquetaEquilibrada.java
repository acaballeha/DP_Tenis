
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
    double longitud, double tamanoDeLaCabeza, Encordado encordado,double multiPotencia,double multiControl)
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
    
    public void setMultiPotencia(double multiPotencia){
        this.multiPotencia=multiPotencia;
    }
    
    public void setMultiControl(double multiControl){
        this.multiControl=multiControl;
    }
    
    @Override
    public double calcularPotencia(){
        return super.calcularPotencia() * getMultPotencia();
    }
    
        @Override
    public double calcularControl(){
        return super.calcularControl() * getMultControl();
    }
    

    @Override
    public void mostrar(){
    }
}
