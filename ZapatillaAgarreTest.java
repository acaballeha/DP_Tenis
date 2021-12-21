

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ZapatillaAgarreTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ZapatillaAgarreTest
{
    Zapatilla zapatill1;
    
    /**
     * Default constructor for test class ZapatillaAgarreTest
     */
    public ZapatillaAgarreTest()
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
        this.zapatill1 = new ZapatillaAgarre("Zapatilla de prueba 1", 41, 5);
    }

    
    @Test
    public void ConstructorTest()
    {
        assertEquals("Zapatilla de prueba 1", zapatill1.getModelo());
        assertEquals(41, zapatill1.getNumero(),0.1);
        assertEquals(5, zapatill1.getValor(),0.1);
    }
    
    @Test
    public void calcularValorSaqueTest(){
        assertEquals(6.0, zapatill1.calcularValorSaque(), 0.1);
    }
    
    @Test
    public void calcularValorRestoTest(){
         assertEquals(11.0, zapatill1.calcularValorResto(), 0.1);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        zapatill1 = null;
    }
    
    
}
