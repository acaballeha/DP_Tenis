
/**
 * Write a description of interface Zapatilla here.
 * 
 * @author Antonio Caballero Carrasco, Miguel Izquierdo Rojo, Javier Tello Blazquez
 * @version 13/11/2021
 */

public interface Zapatilla {

    public void setModelo(String modelo);

    public void setNumero(int numero);

    public void setValor(double valor);

    public String getModelo();

    public double getValor();

    public int getNumero();

    public double calcularValorSaque();

    public double calcularValorResto();

    public void mostrar ();
}
