

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RaquetaEquilibradaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RaquetaEquilibradaTest
{
    private Raqueta r1;
    
    /**
     * Default constructor for test class RaquetaEquilibradaTest
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
        this.r1 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);

    }

    @Test
    public void pruebaGetMultPotencia(){
        assertEquals(2.5,r1.getMultPotencia(),0.1);
    }
    
    @Test
    public void pruebaGetMultControl(){
        assertEquals(4.0,r1.getMultControl(),0.1);
    }
    
    @Test
    public void pruebaCalcularPotencia(){
        assertEquals(10.0, r1.calcularPotencia(),0.1);
    }
    
    @Test
    public void pruebaCalcularControl(){
        assertEquals(40.0, r1.calcularControl(),0.1);
    }
    
    @Test
    public void pruebaCalcularVelocidad(){
        assertEquals(10.0, r1.calcularVelocidad(),0.1);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        r1=null;
    }
}
