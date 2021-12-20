
/**
 * Subtipo de Raqueta
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */
public class RaquetaEquilibrada extends RaquetaGenerica
{
    private double multiPotencia;
    private double multiControl;

    /**
     * Constructor
     * @param modelo Nombre de la raqueta(String)
     * @param peso Peso de la raqueta(double)
     * @param longitud Longitud de la raqueta(double)
     * @param tamanoCabeza Tamaño de la cabeza de la raqueta(double)
     * @param multiPotencia Multiplicador de potencia de la raqueta(double)
     * @param multiControl Multiplicador de control de la raqueta(double)
     */
    public RaquetaEquilibrada(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza,Encordado encordado, double multiPotencia,double multiControl)
    {
        super(modelo,peso,longitud,tamanoDeLaCabeza, encordado);
        this.multiPotencia=multiPotencia;
        this.multiControl=multiControl;
    }

    /**
     * 
     * @return multiPotencia Multiplicador de potencia de la raqueta(double)
     */
    @Override
    public double getMultPotencia(){
        return multiPotencia;
    }

    /**
     * 
     * @return multiControl Multiplicador de control de la raqueta(double)
     */
    @Override
    public double getMultControl(){
        return multiControl;
    }

    /**
     * 
     * @param multiPotencia Multiplicador de potencia de la raqueta(double)
     */    
    public void setMultiPotencia(double multiPotencia){
        this.multiPotencia=multiPotencia;
    }

    /**
     * 
     * @param multiControl Multiplicador de control de la raqueta(double)
     */
    public void setMultiControl(double multiControl){
        this.multiControl=multiControl;
    }

    /**
     * Devuelve el valor de potencia relativo a la longitud de la raqueta
     * multiplicado por el multiplicador de potencia de la propia raqueta.
     * @return potencia Potencia de la raqueta(double)
     */
    @Override
    public double calcularPotencia(){
        return super.calcularPotencia() * getMultPotencia();
    }

    /**
     * Devuelve el valor de control relativo a al tamaño de la cabeza de la raqueta
     * multiplicado por el multiplicador de control de la propia raqueta.
     * @return control Control de la raqueta(double)
     */
    @Override
    public double calcularControl(){
        return super.calcularControl() * getMultControl();
    }

    /**
     * Muestra todos los datos de la raqueta equilibrada. No hace salto de linea al acabar.
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

        str.append("\t**RaquetaEquilibrada");
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
        return "RaquetaEqulibrada";
    }
}
