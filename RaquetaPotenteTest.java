

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
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals(260.0,r1.getPeso(),0.1);
    }
    
    @Test
    public void pruebaSetPeso()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        r1.setPeso(300.5);
        assertEquals(300.5,r1.getPeso(),0.1);
    }
    
    @Test
    public void pruebaGetModelos()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals("Head Radical",r1.getModelo());
    }
    
    @Test
    public void pruebaSetModelos()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        r1.setModelo("Otro Modelo");
        assertEquals("Otro Modelo", r1.getModelo());
    }
    
    @Test
    public void pruebaGetLongitud()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals(680.0,r1.getLongitud(),0.1);
    }
    
    @Test
    public void pruebaSetLongitud()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        r1.setLongitud(400.0);
        assertEquals(400.0,r1.getLongitud(),0.1);
    }
    
    @Test
    public void pruebaGetTamanoCabeza()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals(680.0,r1.getTamanoCabeza(),0.1);
    }
    
    @Test
    public void pruebaSetTamanoCabeza()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        r1.setTamanoCabeza(300.5);
        assertEquals(300.5,r1.getTamanoCabeza(),0.1);
    }
    
    @Test
    public void pruebaGetEncordado()
    {
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals("ABIERTO",r1.getEncordado());
    }
    
    // @Test
    // public void pruebaSetEncordado()
    // {
        // Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        // r1.setEncordado("CERRADO");
        // assertEquals("CERRADO",r1.getTamanoCabeza());
    // }
    
    @Test
    public void pruebaCalcularPotencia(){
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals(4.0, r1.calcularPotencia(),0.1);
    }
    
    @Test
    public void pruebaCalcularControl(){
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals(4.0, r1.calcularControl(),0.1);
    }
    
    @Test
    public void pruebaCalcularVelocidad(){
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        assertEquals(12, r1.calcularVelocidad(),0.1);
    }
}
