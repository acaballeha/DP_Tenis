

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ZapatillaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ZapatillaTest
{
    /**
     * Default constructor for test class ZapatillaTest
     */
    public ZapatillaTest()
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
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5);
        assertEquals("Air Zoom Vapor Pro", zapatill1.getModelo());
        assertEquals(41, zapatill1.getNumero());
        assertEquals("amortiguacion", zapatill1.getTipo());
        assertEquals(5.0, zapatill1.getValor(), 0.1);
    }

    @Test
    public void pruebaSetNumero()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5);
        zapatill1.setNumero(42);
        assertEquals(42, zapatill1.getNumero());
    }
    
    @Test
    public void pruebaSetModelo()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5);
        zapatill1.setModelo("Court Vapor React");
        assertEquals("Court Vapor React", zapatill1.getModelo());
    }
    
    @Test
    public void pruebaSetValor()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5);
        zapatill1.setValor(10.0);
        assertEquals(10.0, zapatill1.getValor(), 0.1);
    }
    
    @Test
    public void pruebaSetTipo()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5);
        zapatill1.setTipo("agarre");
        assertEquals("agarre", zapatill1.getTipo());
    }

    @Test
    public void pruebaValorSaque()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        assertEquals(10.0, zapatill1.calcularValorSaque(), 0.1);
        zapatill1.setTipo("agarre");
        assertEquals(5.0, zapatill1.calcularValorSaque(), 0.1);
    }
    
    @Test
    public void pruebaValorResto()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        assertEquals(5.0, zapatill1.calcularValorResto(), 0.1);
        zapatill1.setTipo("agarre");
        assertEquals(7.5, zapatill1.calcularValorResto(), 0.1);
    }
}



