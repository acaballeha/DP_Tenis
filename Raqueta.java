
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

    public void setTamanoCabeza (double tamanoCabeza);

    public void setEncordado (String encordado);

    public String getModelo ();

    public double getPeso ();

    public double getLongitud ();

    public double getTamanoCabeza ();

    public String getEncordado ();

    public double getMultPotencia();

    public double getMultControl();

    public void mostrar();

    public double calcularPotencia();

    public double calcularControl();

    public double calcularVelocidad();



}
