



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
        Campeonato c = new Campeonato ("Campeonato de Extremadura");
        Zapatilla z1= new ZapatillaAmortiguacion ("Air Zoom Vapor Pro", 41, 5);
        Zapatilla z2= new ZapatillaAgarre ("Court Vapor React", 41, 5);
        Tenista t1 = new Tenista ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 41);
        Tenista t2 = new Tenista ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 41);
        c.insertarZapatilla(z1);
        c.insertarZapatilla(z2);
        c.inscribirTenista(t1);
        c.inscribirTenista(t2);
    }
}
