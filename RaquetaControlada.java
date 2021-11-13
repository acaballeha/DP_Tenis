
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaControlada extends RaquetaGenerica
{
        public RaquetaControlada(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, Encordado encordado)
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
          System.out.println("    ** RaquetaControlada"+"(Encordado:"+getEncordado().toString()+
        ")(MultiplicadorDePotencia:"+getMultPotencia()+")(MultiplicadorDeControl:"+getMultControl()+")");
        System.out.print("\t[modelo="+getModelo()+"\n\tlongitud: "+getLongitud()+",potencia asociada: "+calcularPotencia()+
        "\n\ttamaño: "+ getTamanoCabeza()+",control asociado: "+calcularControl()+
        "\n\tpeso: " + getPeso()+ ",velocidad Asociada: "+calcularVelocidad());
        //no hace salto de linea al final
    }
}
