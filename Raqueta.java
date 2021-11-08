
/**
 * Write a description of interface Raqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Raqueta
{
    public void setModelo (String modelo);

    public void setPeso (double peso);

    public void setLongitud (double longitud);

    public void setTamanoDeLaCabeza (double tamanoDeLaCabeza);

    public void setEncordado (String encordado);

    public String getModelo ();

    public double peso ();

    public double longitud ();

    public double tamanoDeLaCabeza ();

    public String getEncordado ();

    public double getMultPotencia();

    public double getMultControl();

    public void mostrar();

    public double calcularPotencia();

    public double calcularControl();

    public double calcularVelocidad();



}
