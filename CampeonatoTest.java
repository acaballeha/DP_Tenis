

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CampeonatoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CampeonatoTest
{
    private Campeonato c;
    /**
     * Default constructor for test class CampeonatoTest
     */
    public CampeonatoTest()
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
        this.c = Campeonato.getInstance("Campeonato de Extremadura");
        InitTennisData d = new InitTennisData(c);
    }

    @Test
    public void CompeticionTest(){
        c.competicion();
        
    }
    
    @Test
    public void asignarRaquetasTest(){
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new TenistaGolpeador("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        c.asignarRaqueta(tenista1);
        Raqueta r10 =  new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        Raqueta asignada = tenista1.getRaqueta();
        assertEquals(r10.getModelo(), asignada.getModelo());
        
    }
    
    @Test
    public void asignarZapatillasTest(){
        Zapatilla zapatill1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 41, 5.0);
        Tenista tenista1 = new TenistaGolpeador("Novak Djokovic", zapatill1, 90, 80, 1, "Serbia", 41);
        c.asignarZapatilla(tenista1);
        Zapatilla z22 = new ZapatillaAgarre("Wilson Kaos", 41,  5);
        Zapatilla asignada = tenista1.getZapatilla();
        assertEquals(z22.getModelo(), asignada.getModelo());
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        c=null;
    }
}
