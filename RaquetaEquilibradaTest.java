import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RaquetaPotenteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RaquetaEquilibradaTest
{
    /**
     * Default constructor for test class RaquetaPotenteTest
     */
    public RaquetaEquilibradaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void pruebaGetPeso()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(220.0,r1.getPeso(),0.1);
    }
    
    @Test
    public void pruebaSetPeso()
    {
       Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
      r1.setPeso(300.5);
        assertEquals(300.5,r1.getPeso(),0.1);
    }
    
    @Test
    public void pruebaGetModelos()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals("Prince Hornet 100",r1.getModelo());
    }
    
    @Test
    public void pruebaSetModelos()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        r1.setModelo("Otro Modelo");
        assertEquals("Otro Modelo", r1.getModelo());
    }
    
    @Test
    public void pruebaGetLongitud()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(690.0,r1.getLongitud(),0.1);
    }
    
    @Test
    public void pruebaSetLongitud()
    {
       Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        r1.setLongitud(400.0);
        assertEquals(400.0,r1.getLongitud(),0.1);
    }
    
    @Test
    public void pruebaGetTamanoCabeza()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
       assertEquals(600.0,r1.getTamanoCabeza(),0.1);
    }
    
    @Test
    public void pruebaSetTamanoCabeza()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        r1.setTamanoCabeza(300.5);
        assertEquals(300.5,r1.getTamanoCabeza(),0.1);
    }
    
    @Test
    public void pruebaGetEncordado()
    {
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals("CERRADO",r1.getEncordado());
    }
    
    // @Test
    // public void pruebaSetEncordado()
    // {
        // Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        // r1.setEncordado("CERRADO");
        // assertEquals("CERRADO",r1.getTamanoCabeza());
    // }
    
    @Test
    public void pruebaGetMultPotencia(){
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(2.5,r1.getMultPotencia(),0.1);
    }
    
    @Test
    public void pruebaGetMultControl(){
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(4,r1.getMultControl(),0.1);
    }
    
    @Test
    public void pruebaCalcularPotencia(){
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(10.0, r1.calcularPotencia(),0.1);
    }
    
    @Test
    public void pruebaCalcularControl(){
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(40.0, r1.calcularControl(),0.1);
    }
    
    @Test
    public void pruebaCalcularVelocidad(){
        Raqueta r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        assertEquals(10.0, r1.calcularVelocidad(),0.1);
    }
}
