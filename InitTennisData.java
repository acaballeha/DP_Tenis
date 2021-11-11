/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Equipo Docente DP 
 * @version 2.0
 */
public class InitTennisData {

    public InitTennisData(Campeonato campeonato) {
    //Descomentar la carga de datos que se quiera probar
        cargarDatos1(campeonato);//Produce la salida Salida1_EC2
    //cargarDatos2(campeonato);/Produce la salida Salida2_EC2
        
    }
    
    private void cargarDatos1(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: tipo, modelo, número y valor)
        Zapatilla z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
        Zapatilla z2 = ZapatillasConAgarre("Court Vapor React", 40,  5);
        z3 = ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
        z4 = ZapatillasAmortiguadas("Vapor Lite", 42,  3);
        z5 = ZapatillasConAgarre("Court Lite", 39, 3);
        z6 = ZapatillasAmortiguadas("UberSonic 4K", 40, 6);
        z7 = ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
        z8 = ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);


        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais y número de pie)
        t1 = new Tenista ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        t2 = new Tenista  ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
        t3 = new Tenista  ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
        t4 = new Tenista  ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
        t5 = new Tenista  ("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40);
        t6 = new Tenista  ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
        t7 = new Tenista  ("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40);
        t8 = new Tenista  ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);
         
         //A continuación se inscribirán a los 8 tenistas en el campeonato

        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
          z9 = ZapatillasAmortiguadas("Lotto Space", 40,  5);
        z10 = ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
        z11 = ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
        z12 = ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
        z13 = ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
        z14 = ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
        z15 = ZapatillasAmortiguadas("Head Revolt", 40,  5);
        z16 = ZapatillasConAgarre("Joma Slam", 40, 3);
        z17 = ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
        z18 = ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
        z19 = ZapatillasConAgarre("Asics Solution", 42, 3);
        z20 = ZapatillasConAgarre("Nike Air Zoom", 40,  5);
        z21 = ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
        z22 = ZapatillasConAgarre("Wilson Kaos", 41,  5);
        z23 = ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);
    
    
        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control

        r1 =  RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
        r2 =  RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
        r3 =  RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        r4 =  RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        r5 =  RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        r6 =  RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        r7 =  RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        r8 =  RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
        r9 =  RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
        r10 =  RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
        r11 =  RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        r12 =  RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
    }
    
    private void cargarDatos2(Campeonato campeonato) {
            //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, tipo valor)
             z1 =  ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
            z2 =  ZapatillasConAgarre("Court Vapor React", 40,  5);
            z3 =  ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
            z4 =  ZapatillasAmortiguadas("Vapor Lite", 42,  3);
            z5 =  ZapatillasConAgarre("Court Lite", 39, 3);
            z6 =  ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
            z7 =  ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7);
            z8 =  ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais)
            t1 =  new Tenista   ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
              t2 = new Tenista    ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
             t3 = new Tenista    ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
             t4 = new Tenista    ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
             t5 = new Tenista    ("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40);
             t6 = new Tenista    ("Alexander Zverev", z8, 59, 49.5, 4, "Alemania", 42);
             t7 = new Tenista    ("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40);
             t8 = new Tenista    ("Daniil Medvedev", z4, 79, 68, 2, "Rusia", 42);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
         //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: tipo, modelo, número y valor)
        z9 = ZapatillasAmortiguadas("Lotto Space", 40,  5);
            z10 = ZapatillasConAgarre("Adidas Gamecourt", 40,  5);
            z11 = ZapatillasConAgarre("Asics Gel-Game", 42,  4.5);
            z12 = ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
            z13 = ZapatillasConAgarre("Joma Slam", 40, 3);
            z14 = ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
            z15 = ZapatillasConAgarre("Asics Solution", 42, 3);
            z16 = ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
            z17 = ZapatillasConAgarre("Nike Air Zoom", 40,  5);
            z18 = ZapatillasConAgarre("Nike Zoom Vapor", 42,  4);
            z19 = ZapatillasAmortiguadas("Wilson Rush", 42,  3.5);
            z20 = ZapatillasAmortiguadas("Head Revolt", 40,  3);
            z21 = ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
            z22 = ZapatillasConAgarre("Wilson Kaos", 41,  5);
            z23 = ZapatillasConAgarre("Head Revolt Pro", 42,  4.5);
    
        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        r1 = RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
            r2 = RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
            r3 = RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
            r4 = RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
            r5 = RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
            r6 = RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
            r7 = RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
            r8 = RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
            r9 = RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
            r10 = RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
            r11 = RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
            r12 = RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
   }
}
