

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
    /**
     * Default constructor for test class ZapatillaTest
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
    public void ConstructorTest()
    {
        Zapatilla zapatill1 = new ZapatillaAgarre("Air Zoom Vapor Pro", 41, 5);
        assertEquals("Air Zoom Vapor Pro", zapatill1.getModelo());
        assertEquals(41, zapatill1.getNumero());
    }

    @Test
    public void pruebaSetNumero()
    {
        Zapatilla zapatill1 = new ZapatillaAgarre("Air Zoom Vapor Pro", 41, 5);
        zapatill1.setNumero(42);
        assertEquals(42, zapatill1.getNumero());
    }
    
    @Test
    public void pruebaSetModelo()
    {
        Zapatilla zapatill1 = new ZapatillaAgarre("Air Zoom Vapor Pro", 41, 5);
        zapatill1.setModelo("Court Vapor React");
        assertEquals("Court Vapor React", zapatill1.getModelo());
    }
    
    @Test
    public void pruebaSetValor()
    {
        Zapatilla zapatill1 = new ZapatillaAgarre("Air Zoom Vapor Pro", 41, 5);
        zapatill1.setValor(10.0);
        assertEquals(10.0, zapatill1.getValor(), 0.1);
    }
    

    @Test
    public void pruebaValorSaque()
    {
       Zapatilla zapatill1 = new ZapatillaAgarre("Air Zoom Vapor Pro", 41, 5);
        assertEquals(6.0, zapatill1.calcularValorSaque(), 0.1);

    }
    
    @Test
    public void pruebaValorResto()
    {
        Zapatilla zapatill1 = new ZapatillaAgarre("Air Zoom Vapor Pro", 41, 5);
        assertEquals(11.0, zapatill1.calcularValorResto(), 0.1);
    }
}