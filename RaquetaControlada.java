
/**
 * Subtipo de Raqueta
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class RaquetaControlada extends RaquetaGenerica
{
    /**
     * Constructor
     * @param modelo Nombre de la raqueta(String)
     * @param peso Peso de la raqueta(double)
     * @param longitud Longitud de la raqueta(double)
     * @param tamanoCabeza Tamaño de la cabeza de la raqueta(double)
     * @param encordado Encordado de la raqueta(Encordado)
     */
    public RaquetaControlada(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, Encordado encordado)
    {
        super(modelo,peso,longitud,tamanoDeLaCabeza,encordado);
    }

    /**
     * Devuelve el valor de control relativo al tamaño de la cabeza 
     * multiplicado por el multiplicador de control del encordado
     * @return control Control de la raqueta(double)
     */
    @Override
    public double calcularControl(){
        return super.calcularControl() * super.getMultControl();
    }

    /**
     * Devuelve el valor de velocidad relativo al peso
     * multiplicado por 1.2
     * @return velocidad Velocidad de la raqueta(double)
     */
    @Override
    public double calcularVelocidad(){
        return super.calcularVelocidad() * 1.2;
    }

    /**
     * Muestra todos los datos de la raqueta controlada. No hace salto de linea al acabar.
     */
    @Override
    public void mostrar(){
        System.out.print(this.toString());
    }

    @Override
    /**
     * Devuelve en un string con la información del Tenista
     * @return str Informacion del Tenista(String)
     */
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("\t**RaquetaControlada(Encordado:");
        str.append(getEncordado().toString());
        str.append(")");
        str.append(super.toString());

        //no hace salto de linea al final

        return str.toString();
    }

    @Override
    /**
     * Devuelve el tipo de raqueta.
     * @return tipoRaqueta devuelve el tipo de raqueta(String)
     */
    public  String getTipo(){
        return "RaquetaControlada";
    }
}
