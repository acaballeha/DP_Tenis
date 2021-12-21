

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * The test class TenistaVoleadorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TenistaVoleadorTest
{
    private Tenista tenista1;
    private Raqueta r5;
    private Zapatilla zapatill1;
    /**
     * Default constructor for test class TenistaVoleadorTest
     */
    public TenistaVoleadorTest()
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
        this.zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        this.tenista1 = new TenistaVoleador("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        this.r5 =  new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        this.tenista1.setRaqueta(r5);
    }

    @Test
    public void ConstructorTest(){
        assertEquals("Novak Djokovic", tenista1.getNombre());
        assertEquals(zapatill1, tenista1.getZapatilla());
        assertEquals(90, tenista1.getSaque(),0.1);
        assertEquals(80, tenista1.getResto(),0.1);
        assertEquals(1, tenista1.getRanking());
        assertEquals("Serbia", tenista1.getPais());
        assertEquals(0, tenista1.getPuntosAcumulados(),0.1);
    }
        
    @Test
    public void golpearTest(){
        tenista1.golpear();
        assertEquals(1.5, tenista1.getPuntosAcumulados(),0.1);
    }
    
    @Test
    public void calcularRestoTest(){
        assertEquals(31200.0, tenista1.calcularResto(),0.1);
    }
    
    @Test
    public void calcularSaqueTest(){
        assertEquals(23328.0, tenista1.calcularSaque(),0.1);
    }
    
    @Test
    public void jugarTest(){
        Campeonato c = Campeonato.getInstance("Campeonato de Extremadura");
        Tenista t2 = new TenistaGolpeador ("Ashleigh Barty", zapatill1, 70, 80, 1, "Australia", 40);
        tenista1.realizarInscripcion();
        t2.realizarInscripcion();
         Raqueta r1 =  new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        Raqueta r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        c.insertarRaqueta(r1);
        c.insertarRaqueta(r2);
        tenista1.setRaqueta(r1);
        t2.setRaqueta(r2);
        
        tenista1.juego(t2);
        
        assertEquals(46656.6, tenista1.getPuntosAcumulados(), 0.1);
        
    }
    
    @Test
    public void elegirZapatillasTest(){
        Zapatilla z2 =  new ZapatillaAgarre("Court Vapor React", 40,  5);
        Zapatilla z3 =  new ZapatillaAgarre("Gel-Resolution 8 GS", 40,  4);
        Zapatilla z4 =  new ZapatillaAmortiguacion("Vapor Lite", 42,  3);
        Zapatilla z5 =  new ZapatillaAgarre("Court Lite", 39, 3);
        ArrayList< Zapatilla> zapatillas = new ArrayList <> ();
        zapatillas.add(z2);
        zapatillas.add(z3);
        zapatillas.add(z4);
        zapatillas.add(z5);
        assertEquals(z5, tenista1.elegirZapatillas(zapatillas));
        
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        tenista1=null;
        zapatill1=null;
    }
}
