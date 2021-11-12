/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 2.0
 */
public class InitTennisData {

    public InitTennisData(Campeonato campeonato) {
        //Descomentar la carga de datos que se quiera probar
        cargarDatos2(campeonato);//Produce la salida Salida1_EC2
        //cargarDatos2(campeonato);/Produce la salida Salida2_EC2

    }

    private void cargarDatos1(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla z1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 42,  5);
        Zapatilla z2 = new ZapatillaAgarre("Court Vapor React", 40,  5);
        Zapatilla z3 = new ZapatillaAgarre("Gel-Resolution 8 GS", 40,  4);
        Zapatilla z4 =  new ZapatillaAmortiguacion("Vapor Lite", 42,  3);
        Zapatilla z5 = new ZapatillaAgarre("Court Lite", 39, 3);
        Zapatilla z6 =  new ZapatillaAmortiguacion("UberSonic 4K", 40, 6);
        Zapatilla z7 =  new ZapatillaAmortiguacion("Zoom GP Turbo", 43, 3.5);
        Zapatilla z8 = new ZapatillaAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais y número de pie)
        Tenista t1 = new Tenista ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista t2 = new Tenista  ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
        Tenista t3 = new Tenista  ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista t4 = new Tenista  ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista t5 = new Tenista  ("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista t6 = new Tenista  ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista t7 = new Tenista  ("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista t8 = new Tenista  ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
        campeonato.inscribirTenista(t1);
        campeonato.inscribirTenista(t2);
        campeonato.inscribirTenista(t3);
        campeonato.inscribirTenista(t4);
        campeonato.inscribirTenista(t5);
        campeonato.inscribirTenista(t6);
        campeonato.inscribirTenista(t7);
        campeonato.inscribirTenista(t8);
        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla  z9 = new ZapatillaAmortiguacion("Lotto Space", 40,  5);
        Zapatilla  z10 = new ZapatillaAmortiguacion("K-Swiss Express", 42,  3);
        Zapatilla  z11 = new ZapatillaAmortiguacion("Babolat Jet Tere", 42, 5.5);
        Zapatilla z12 = new ZapatillaAmortiguacion("Lotto Mirage", 40, 6);
        Zapatilla z13 = new ZapatillaAmortiguacion("K-Swiss Hypercourt", 40,  5);
        Zapatilla z14 = new ZapatillaAmortiguacion("Wilson Rush", 42,  3.5);
        Zapatilla z15 = new ZapatillaAmortiguacion("Head Revolt", 40,  5);
        Zapatilla z16 = new ZapatillaAgarre("Joma Slam", 40, 3);
        Zapatilla  z17 = new ZapatillaAgarre("Adidas Gamecourt", 40,  5);
        Zapatilla z18 = new ZapatillaAgarre("Asics Gel-Game", 42,  4.5);
        Zapatilla  z19 = new ZapatillaAgarre("Asics Solution", 42, 3);
        Zapatilla  z20 = new ZapatillaAgarre("Nike Air Zoom", 40,  5);
        Zapatilla  z21 = new ZapatillaAgarre("Nike Zoom Vapor", 42,  4);
        Zapatilla   z22 = new ZapatillaAgarre("Wilson Kaos", 41,  5);
        Zapatilla  z23 = new ZapatillaAgarre("Head Revolt Pro", 42,  4.5);

        campeonato.insertarZapatilla(z9);
        campeonato.insertarZapatilla(z10);
        campeonato.insertarZapatilla(z11);
        campeonato.insertarZapatilla(z12);
        campeonato.insertarZapatilla(z13);
        campeonato.insertarZapatilla(z14);
        campeonato.insertarZapatilla(z15);
        campeonato.insertarZapatilla(z16);
        campeonato.insertarZapatilla(z17);
        campeonato.insertarZapatilla(z18);
        campeonato.insertarZapatilla(z19);
        campeonato.insertarZapatilla(z20);
        campeonato.insertarZapatilla(z21);
        campeonato.insertarZapatilla(z22);
        campeonato.insertarZapatilla(z23);

        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control

        Raqueta r1 = new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        Raqueta r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        Raqueta r3 = new  RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        Raqueta r4 =  new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        Raqueta r5 = new   RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        Raqueta r6 = new  RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        Raqueta r7 = new  RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        Raqueta r8 = new  RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        Raqueta r9 = new  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        Raqueta r10 = new  RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        Raqueta r11 = new  RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        Raqueta r12 = new  RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);

        campeonato.insertarRaqueta(r1);
        campeonato.insertarRaqueta(r2);
        campeonato.insertarRaqueta(r3);
        campeonato.insertarRaqueta(r4);
        campeonato.insertarRaqueta(r5);
        campeonato.insertarRaqueta(r6);
        campeonato.insertarRaqueta(r7);
        campeonato.insertarRaqueta(r8);
        campeonato.insertarRaqueta(r9);
        campeonato.insertarRaqueta(r10);
        campeonato.insertarRaqueta(r11);
        campeonato.insertarRaqueta(r12);

    }

    private void cargarDatos2(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
        Zapatilla   z1 =   new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 42,  5);
        Zapatilla   z2 =  new ZapatillaAgarre("Court Vapor React", 40,  5);
        Zapatilla    z3 =  new ZapatillaAgarre("Gel-Resolution 8 GS", 40,  4);
        Zapatilla    z4 =  new ZapatillaAmortiguacion("Vapor Lite", 42,  3);
        Zapatilla    z5 =  new ZapatillaAgarre("Court Lite", 39, 3);
        Zapatilla     z6 =  new ZapatillaAmortiguacion("UberSonic 4K", 40, 5.5);
        Zapatilla     z7 =  new ZapatillaAmortiguacion("Zoom GP Turbo", 43, 7);
        Zapatilla     z8 =  new ZapatillaAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
        Tenista   t1 =  new Tenista   ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista     t2 = new Tenista    ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
        Tenista     t3 = new Tenista    ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista     t4 = new Tenista    ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista     t5 = new Tenista    ("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista     t6 = new Tenista    ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista     t7 = new Tenista    ("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista   t8 = new Tenista    ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        campeonato.inscribirTenista(t1);
        campeonato.inscribirTenista(t2);
        campeonato.inscribirTenista(t3);
        campeonato.inscribirTenista(t4);
        campeonato.inscribirTenista(t5);
        campeonato.inscribirTenista(t6);
        campeonato.inscribirTenista(t7);
        campeonato.inscribirTenista(t8);
        //A continuación se inscribirán a los 8 tenistas en el campeonato
        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla   z9 =  new ZapatillaAmortiguacion("Lotto Space", 40,  5);
        Zapatilla       z10 = new ZapatillaAgarre("Adidas Gamecourt", 40,  5);
        Zapatilla       z11 = new ZapatillaAgarre("Asics Gel-Game", 42,  4.5);
        Zapatilla       z12 =  new ZapatillaAmortiguacion("K-Swiss Express", 42,  3);
        Zapatilla       z13 = new ZapatillaAgarre("Joma Slam", 40, 3);
        Zapatilla      z14 =  new ZapatillaAmortiguacion("Babolat Jet Tere", 42, 5.5);
        Zapatilla      z15 = new ZapatillaAgarre("Asics Solution", 42, 3);
        Zapatilla      z16 =  new ZapatillaAmortiguacion("K-Swiss Hypercourt", 40,  5);
        Zapatilla     z17 = new ZapatillaAgarre("Nike Air Zoom", 40,  5);
        Zapatilla     z18 = new ZapatillaAgarre("Nike Zoom Vapor", 42,  4);
        Zapatilla      z19 =  new ZapatillaAmortiguacion("Wilson Rush", 42,  3.5);
        Zapatilla     z20 =  new ZapatillaAmortiguacion("Head Revolt", 40,  3);
        Zapatilla     z21 =  new ZapatillaAmortiguacion("Lotto Mirage", 40, 6);
        Zapatilla     z22 = new ZapatillaAgarre("Wilson Kaos", 41,  5);
        Zapatilla     z23 = new ZapatillaAgarre("Head Revolt Pro", 42,  4.5);

        campeonato.insertarZapatilla(z9);
        campeonato.insertarZapatilla(z10);
        campeonato.insertarZapatilla(z11);
        campeonato.insertarZapatilla(z12);
        campeonato.insertarZapatilla(z13);
        campeonato.insertarZapatilla(z14);
        campeonato.insertarZapatilla(z15);
        campeonato.insertarZapatilla(z16);
        campeonato.insertarZapatilla(z17);
        campeonato.insertarZapatilla(z18);
        campeonato.insertarZapatilla(z19);
        campeonato.insertarZapatilla(z20);
        campeonato.insertarZapatilla(z21);
        campeonato.insertarZapatilla(z22);
        campeonato.insertarZapatilla(z23);

        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        Raqueta  r1 =new  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        Raqueta     r2 =new  RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        Raqueta      r3 = new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        Raqueta     r4 = new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        Raqueta    r5 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        Raqueta    r6 = new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        Raqueta    r7 =new  RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        Raqueta   r8 = new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        Raqueta   r9 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        Raqueta   r10 = new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        Raqueta   r11 = new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        Raqueta    r12 = new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);

        campeonato.insertarRaqueta(r1);
        campeonato.insertarRaqueta(r2);
        campeonato.insertarRaqueta(r3);
        campeonato.insertarRaqueta(r4);
        campeonato.insertarRaqueta(r5);
        campeonato.insertarRaqueta(r6);
        campeonato.insertarRaqueta(r7);
        campeonato.insertarRaqueta(r8);
        campeonato.insertarRaqueta(r9);
        campeonato.insertarRaqueta(r10);
        campeonato.insertarRaqueta(r11);
        campeonato.insertarRaqueta(r12);

    }
}
