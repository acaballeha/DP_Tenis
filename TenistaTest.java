

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TenistaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TenistaTest
{
    /**
     * Default constructor for test class TenistaTest
     */
    public TenistaTest()
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
    public void pruebaConstructor()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        assertEquals("Novak Djokovic", tenista1.getNombre());
        assertEquals(zapatill1, tenista1.getZapatilla());
        assertEquals(90, tenista1.getSaque(),0.1);
        assertEquals(80, tenista1.getResto(),0.1);
        assertEquals(1, tenista1.getRanking());
        assertEquals("Serbia", tenista1.getPais());
        assertEquals(0, tenista1.getPuntosAcumulados(),0.1);
    }
    

    @Test
    public void pruebaSetNombre()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setNombre("Ashleigh Barty");
        assertEquals("Ashleigh Barty", tenista1.getNombre());
    }
    
    @Test
    public void pruebaSetZapatilla()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Zapatilla zapatill2= new Zapatilla ("Court Vapor React", 41, "agarre", 5);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setZapatilla(zapatill2);
        assertEquals(zapatill2, tenista1.getZapatilla());
    }
    
    @Test
    public void pruebaSetSaque()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setSaque(60.0);
        assertEquals(60.0, tenista1.getSaque(),0.1);
    }
    
    @Test
    public void pruebaSetResto()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setResto(90.0);
        assertEquals(90.0, tenista1.getResto(),0.1);
    }
    
    @Test
    public void pruebaSetRanking()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setRanking(2);
        assertEquals(2, tenista1.getRanking());
    }
    
    @Test
    public void pruebaSetPais()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setPais("España");
        assertEquals("España", tenista1.getPais());
    }
    
    @Test
    public void pruebaSetPuntosAcumulados()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia");
        tenista1.setPuntosAcumulados(12);
        assertEquals(12, tenista1.getPuntosAcumulados(),0.1);
    }
    

    @Test
    public void pruebaCalcularSaque()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Alejandro", zapatill1, 80, 90, 1, "España");
        assertEquals(800.0, tenista1.calcularSaque(), 0.1);
        Zapatilla z2= new Zapatilla ("Court Vapor React", 41, "agarre", 5);
        tenista1.setZapatilla(z2);
        assertEquals(400.0, tenista1.calcularSaque(), 0.1);
    }
    
    @Test
    public void pruebaCalcularResto()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Alejandro", zapatill1, 80, 90, 1, "España");
        assertEquals(450.0, tenista1.calcularResto(), 0.1);
        Zapatilla z2= new Zapatilla ("Court Vapor React", 41, "agarre", 5);
        tenista1.setZapatilla(z2);
        assertEquals(675.0, tenista1.calcularResto(), 0.1);
    }
    
    @Test
    public void pruebaSacar()
    {
        Zapatilla zapatill1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Tenista tenista1 = new Tenista("Alejandro", zapatill1, 80, 90, 1, "España");
        tenista1.sacar();
        assertEquals(800.0, tenista1.getPuntosAcumulados(), 0.1);
        Zapatilla z2= new Zapatilla ("Court Vapor React", 41, "agarre", 5);
        tenista1.setZapatilla(z2);
        tenista1.sacar();
        assertEquals(1200.0, tenista1.getPuntosAcumulados(), 0.1);
    }
    
    @Test
    public void pruebaRestar()
    {
        Zapatilla z1 = new Zapatilla("Air Zoom Vapor Pro", 41, "amortiguacion", 5.0);
        Zapatilla z2= new Zapatilla ("Court Vapor React", 41, "agarre", 5);
        Zapatilla z3= new Zapatilla ("Zoom GP Turbo", 41, "amortiguacion", 6);
        Tenista t2 = new Tenista ("Stefanos Tsitsipas", z3, 55, 48, 3, "Grecia");
        Tenista t1 = new Tenista("Alejandro", z1, 80, 90, 1, "España");
        t1.restar(t2);
        assertEquals(0, t1.getPuntosAcumulados(), 0.1);
        t2.restar(t1);
        assertEquals(0, t2.getPuntosAcumulados(), 0.1);
        t1.setZapatilla(z2);
        t1.restar(t2);
        assertEquals(675.0, t1.getPuntosAcumulados(), 0.1);
    }
}



