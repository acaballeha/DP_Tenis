
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaPotente extends RaquetaGenerica
{
        public RaquetaPotente(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, Encordado encordado)
    {
        super(modelo,peso,longitud,tamanoDeLaCabeza,encordado);
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
