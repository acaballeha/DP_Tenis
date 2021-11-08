
/**
 * Write a description of class RaquetaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaGenerica implements Raqueta
{
    // instance variables - replace the example below with your own

    double [][] potencia = {{680,690,700,720,740}, {2,4,6,8,10}};
    double [][] control = {{600,630,650,680,720}, {10,8,6,4,2}};
    double [][] velocidad = {{220,260,300,320,340}, {10,8,6,4,2}};

    private String modelo;
    private double peso;
    private double longitud;
    private double tamanoDeLaCabeza;
    private Encordado encordado;
    /**
     * Constructor for objects of class RaquetaGenerica
     */
    public RaquetaGenerica(String modelo, double peso,
    double longitud, double tamanoDeLaCabeza, String encordado)
    {
        this.modelo=modelo;
        this.peso=peso;
        this.longitud=longitud;
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
        this.encordado=Encordado.valueOf(encordado);

    }

    public void setModelo (String modelo){
        this.modelo=modelo;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public void setLongitud (double longitud){
        this.longitud = longitud;
    }

    public void setTamanoDeLaCabeza (double tamanoDeLaCabeza){
        this.tamanoDeLaCabeza = tamanoDeLaCabeza;
    }

    public void setEncordado (String encordado){
        this.encordado=Encordado.valueOf(encordado);
    }

    public String getModelo (){
        return modelo;
    }

    public double peso (){
        return peso;
    }

    public double longitud (){
        return longitud;
    }

    public double tamanoDeLaCabeza (){
        return tamanoDeLaCabeza;
    }

    public String getEncordado (){
        return encordado.getNombre();
    }
    
    public double getMultPotencia(){
        return encordado.getMultPotencia();
    }
    
        public double getMultControl(){
        return encordado.getMultControl();
    }
    public void mostrar(){
        System.out.println();

    }

    public double calcularPotencia(){
        for(int i=0;i<potencia.length/2;i++){
            if(longitud==potencia[0][i]){
                return potencia[1][i];
            }
        }
        return 0.0;
    }
    
        public double calcularControl(){
        for(int i=0;i<control.length/2;i++){
            if(tamanoDeLaCabeza==control[0][i]){
                return control[1][i];
            }
        }
        return 0.0;
    }
    
        public double calcularVelocidad(){
        for(int i=0;i<velocidad.length/2;i++){
            if(peso==velocidad[0][i]){
                return velocidad[1][i];
            }
        }
        return 0.0;
    }
}

