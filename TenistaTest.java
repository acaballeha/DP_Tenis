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
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
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
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setNombre("Ashleigh Barty");
        assertEquals("Ashleigh Barty", tenista1.getNombre());
    }

    @Test
    public void pruebaSetZapatilla()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        Zapatilla zapatill2= new ZapatillaAgarre ("Court Vapor React", 41, 5);
        tenista1.setZapatilla(zapatill2);
        assertEquals(zapatill2, tenista1.getZapatilla());
    }

    @Test
    public void pruebaSetSaque()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setSaque(60.0);
        assertEquals(60.0, tenista1.getSaque(),0.1);
    }

    @Test
    public void pruebaSetResto()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setResto(90.0);
        assertEquals(90.0, tenista1.getResto(),0.1);
    }

    @Test
    public void pruebaSetRanking()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setRanking(2);
        assertEquals(2, tenista1.getRanking());
    }

    @Test
    public void pruebaSetPais()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setPais("España");
        assertEquals("España", tenista1.getPais());
    }

    @Test
    public void pruebaSetPuntosAcumulados()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setPuntosAcumulados(12);
        assertEquals(12, tenista1.getPuntosAcumulados(),0.1);
    }

    @Test
    public void pruebaCalcularSaque()
    {
        Raqueta r9 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setRaqueta(r9);
        assertEquals(97200.0, tenista1.calcularSaque(), 0.1);
        Zapatilla z2= new ZapatillaAgarre ("Court Vapor React", 41, 5);
        tenista1.setZapatilla(z2);
        assertEquals(54000.0, tenista1.calcularSaque(), 0.1);
    }

    @Test
    public void pruebaCalcularResto()
    {
        Raqueta r9 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        tenista1.setRaqueta(r9);
        assertEquals(208000.0, tenista1.calcularResto(), 0.1);
        Zapatilla z2= new ZapatillaAgarre("Court Vapor React", 41, 5);
        tenista1.setZapatilla(z2);
        assertEquals(353599.9, tenista1.calcularResto(), 0.1);
    }

    @Test
    public void pruebaJuego()
    {
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 7.0);
        Tenista tenista1 = new Tenista("Novak Djokovic", zapatill1, 110, 100, 1, "Serbia", 41);
        Zapatilla zapatill2 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro2", 41, 5.0);
        Raqueta r9 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        tenista1.setRaqueta(r9);
        
        Tenista tenista2 = new Tenista("Novak Djokovic2", zapatill1, 90, 80, 1, "Serbia", 41);
        
        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        tenista2.setRaqueta(r1);
        
        tenista1.juego(tenista2);
        
        assertEquals(530320.0, tenista1.getPuntosAcumulados(), 0.1);
    }
}