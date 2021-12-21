

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
public class RaquetaPotenteTest
{
    private Raqueta r1;
    
    /**
     * Default constructor for test class RaquetaPotenteTest
     */
    public RaquetaPotenteTest()
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
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
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
        assertEquals(2.0, r1.calcularPotencia(),0.1);
    }
    
    @Test
    public void pruebaCalcularControl(){
        assertEquals(8.8, r1.calcularControl(),0.1);
    }
    
    @Test
    public void pruebaCalcularVelocidad(){
        assertEquals(9.6, r1.calcularVelocidad(),0.1);
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
