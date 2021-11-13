
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaPotente extends RaquetaGenerica
{
    public RaquetaPotente(String modelo, double peso,
    double longitud, double tamanoCabeza, Encordado encordado)
    {
        super(modelo,peso,longitud,tamanoCabeza,encordado);
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
        System.out.println("    ** RaquetaPotente"+"(Encordado:"+getEncordado().toString()+
            ")(MultiplicadorDePotencia:"+getMultPotencia()+")(MultiplicadorDeControl:"+getMultControl()+")");
        System.out.print("\t[modelo="+getModelo()+
            "\n\tlongitud: "+getLongitud()       +",potencia asociada: "+calcularPotencia()+
            "\n\ttamaño: "  + getTamanoCabeza()  +",control asociado: "+calcularControl()+
            "\n\tpeso: "    + getPeso()          + ",velocidad Asociada: "+calcularVelocidad());
        //no hace salto de linea al final
    }
}
