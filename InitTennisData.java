/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 3.0
 */
public class InitTennisData {

    public InitTennisData(Campeonato campeonato) {
        //Descomentar la carga de datos que se quiera probar
        cargarDatos1(campeonato);//Produce la salida Salida1_EC3
        //cargarDatos2(campeonato);/Produce la salida Salida2_EC3

    }

    private void cargarDatos1(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla z1 = new ZapatillaAmortiguacion("Air Zoom Vapor Pro", 42,  5);
        Zapatilla z2 = new ZapatillaAgarre("Court Vapor React", 40,  5);
        Zapatilla z3 = new ZapatillaAgarre("Gel-Resolution 8 GS", 40,  4);
        Zapatilla z4 = new ZapatillaAmortiguacion("Vapor Lite", 42,  3);
        Zapatilla z5 = new ZapatillaAgarre("Court Lite", 39, 3);
        Zapatilla z6 = new ZapatillaAmortiguacion("UberSonic 4K", 40, 6);
        Zapatilla z7 = new ZapatillaAmortiguacion("Zoom GP Turbo", 43, 3.5);
        Zapatilla z8 = new ZapatillaAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais y número de pie)
        //Novedad en EC3: cada tenista es de tipo "Golpeadores" o de tipo "Voleadores"
        Tenista t1 = new TenistaGolpeador ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        Tenista t2 = new TenistaGolpeador ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
        Tenista t3 = new TenistaVoleador ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        Tenista t4 = new TenistaVoleador ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        Tenista t5 = new TenistaGolpeador ("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        Tenista t6 = new TenistaGolpeador ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        Tenista t7 = new TenistaVoleador ("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        Tenista t8 = new TenistaVoleador ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        t3.realizarInscripcion();
        t4.realizarInscripcion();
        t5.realizarInscripcion();
        t6.realizarInscripcion();
        t7.realizarInscripcion();
        t8.realizarInscripcion();

        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla z9 = new ZapatillaAmortiguacion("Lotto Space", 40,  5);
        Zapatilla z10 = new ZapatillaAmortiguacion("K-Swiss Express", 42,  3);
        Zapatilla z11 = new ZapatillaAmortiguacion("Babolat Jet Tere", 42, 5.5);
        Zapatilla z12 = new ZapatillaAmortiguacion("Lotto Mirage", 40, 6);
        Zapatilla z13 = new ZapatillaAmortiguacion("K-Swiss Hypercourt", 40,  5);
        Zapatilla z14 = new ZapatillaAmortiguacion("Wilson Rush", 42,  3.5);
        Zapatilla z15 = new ZapatillaAmortiguacion("Head Revolt", 40,  5);
        Zapatilla z16 = new ZapatillaAgarre("Joma Slam", 40, 3);
        Zapatilla z17 = new ZapatillaAgarre("Adidas Gamecourt", 40,  5);
        Zapatilla z18 = new ZapatillaAgarre("Asics Gel-Game", 42,  4.5);
        Zapatilla z19 = new ZapatillaAgarre("Asics Solution", 42, 3);
        Zapatilla z20 = new ZapatillaAgarre("Nike Air Zoom", 40,  5);
        Zapatilla z21 = new ZapatillaAgarre("Nike Zoom Vapor", 42,  4);
        Zapatilla z22 = new ZapatillaAgarre("Wilson Kaos", 41,  5);
        Zapatilla z23 = new ZapatillaAgarre("Head Revolt Pro", 42,  4.5);

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
        Raqueta r1 =  new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        Raqueta r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        Raqueta r3 =  new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        Raqueta r4 =  new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        Raqueta r5 =  new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        Raqueta r6 =  new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        Raqueta r7 =  new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        Raqueta r8 =  new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        Raqueta r9 =  new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        Raqueta r10 =  new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        Raqueta r11 =  new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        Raqueta r12 =  new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);

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
        
        //Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Raqueta r14 = new RaquetaPotente("Wilson Energy XL", 260, 690, 680, Encordado.ABIERTO);
        Raqueta r15 = new RaquetaPotente("Wilson Pro Open", 340, 740, 720, Encordado.ABIERTO);
        Raqueta r16 = new RaquetaPotente("Babolat Boost Drive", 220, 680,600, Encordado.CERRADO);
        Raqueta r17 = new RaquetaPotente("Babolat Pure Drive", 260, 720, 600, Encordado.CERRADO);
        Raqueta r18 = new RaquetaControlada("Prince Force Ti OS", 340, 740, 600, Encordado.CERRADO);
        Raqueta r19 = new RaquetaControlada("Head Prestige Pro", 340, 740, 720, Encordado.ABIERTO);
        Raqueta r20 = new RaquetaControlada("Head Instinct", 220, 680,600, Encordado.ABIERTO);
        Raqueta r21 = new RaquetaControlada("Dunlop Nitro", 340, 720, 600, Encordado.CERRADO);
        Raqueta r22 = new RaquetaEquilibrada("Prince Force", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        Raqueta r23 = new RaquetaEquilibrada("Prince Warrior", 340, 740, 720, Encordado.ABIERTO, 6, 2);
        Raqueta r24 = new RaquetaEquilibrada("Wilson Pro Staff", 220, 680, 600, Encordado.CERRADO, 2.5, 4);

        campeonato.insertarRaqueta(r14);
        campeonato.insertarRaqueta(r15);
        campeonato.insertarRaqueta(r16);
        campeonato.insertarRaqueta(r17);
        campeonato.insertarRaqueta(r18);
        campeonato.insertarRaqueta(r19);
        campeonato.insertarRaqueta(r20);
        campeonato.insertarRaqueta(r21);
        campeonato.insertarRaqueta(r22);
        campeonato.insertarRaqueta(r23);
        campeonato.insertarRaqueta(r24);
       
    }

    // private void cargarDatos2(Campeonato campeonato) {
    // //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
    // z1 =  ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
    // z2 =  ZapatillasConAgarre("Court Vapor React", 40,  5);
    // z3 =  ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
    // z4 =  ZapatillasAmortiguadas("Vapor Lite", 42,  3);
    // z5 =  ZapatillasConAgarre("Court Lite", 39, 3);
    // z6 =  ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
    // z7 =  ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7);
    // z8 =  ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

    // //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
    // //Novedad en EC3: cada tenista es de tipo "Golpeadores" o de tipo "Voleadores"
    // t1 = Golpeadores ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
    // t2 = Golpeadores ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
    // t3 = Golpeadores ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
    // t4 = Golpeadores ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
    // t5 = Voleadores ("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
    // t6 = Voleadores ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
    // t7 = Voleadores ("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
    // t8 = Voleadores ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

    // //A continuación se inscribirán a los 8 tenistas en el campeonato
    // //Instanciamos zapatillas para ser usadas en el campeonato: 
    // //(Los parámetros están en el orden: tipo, modelo, número y valor)
    // z9 = ZapatillasAmortiguadas("Lotto Space", 40,  5);
    // z10 = ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
    // z11 = ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
    // z12 = ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
    // z13 = ZapatillasConAgarre("Joma Slam", 40, 3);
    // z14 = ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
    // z15 = ZapatillasConAgarre("Asics Solution", 42, 3);
    // z16 = ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
    // z17 = ZapatillasConAgarre("Nike Air Zoom", 40,  5);
    // z18 = ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
    // z19 = ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
    // z20 = ZapatillasAmortiguadas("Head Revolt", 40,  3);
    // z21 = ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
    // z22 = ZapatillasConAgarre("Wilson Kaos", 41,  5);
    // z23 = ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);

    // //Instanciamos raquetas para ser usadas en el campeonato: 
    // //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
    // //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
    // r1 = RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
    // r2 = RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
    // r3 = RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
    // r4 = RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
    // r5 = RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
    // r6 = RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
    // r7 = RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
    // r8 = RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
    // r9 = RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
    // r10 = RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
    // r11 = RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
    // r12 = RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);

    // //Novedad en EC3: Las siguientes raquetas son nuevas para EC3
    // r13 = RaquetaPotente("Wilson Energy XL", 260, 690, 680, Encordado.ABIERTO);
    // r14 = RaquetaPotente("Wilson Pro Open", 340, 740, 720, Encordado.ABIERTO);
    // r15 = RaquetaPotente("Babolat Boost Drive", 220, 680,600, Encordado.CERRADO);
    // r16 = RaquetaPotente("Babolat Pure Drive", 260, 720, 600, Encordado.CERRADO);
    // }

}
