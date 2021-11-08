
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaControlada extends RaquetaGenerica
{
        public RaquetaControlada(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, String encordado)
    {
        super(modelo,peso,longitud,tamanoDeLaCabeza,encordado);
    }
    
    @Override
    public double calcularControl(){
        return super.calcularControl() * super.getMultControl();
    }
    
    @Override
    public double calcularVelocidad(){
        return super.calcularVelocidad() * 1.2;
    }
    
    
    @Override
    public void mostrar(){
    }
}
