
/**
 * Write a description of interface Raqueta here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
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

    public String getTipo();
}
