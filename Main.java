public class Main {
    // Visur izmantojamie mainīgie jeb objekti.
    public static volatile boolean speleSakas = true; // Mainīgais bool, kas palaiž visu spēli.

    // String array-i, kas nosaka varoņa pozīciju un virzienu.
    static volatile String[] virziens = {"Prieksa", "LabaP", "Zeme", "KreisaP"}; // [P]riekša, [L]aba puse, [Z]eme V, [K]reisā puse.
    static volatile String[] atrasanasVieta = {"Gulta", "Divans", "Durvis", "Virtuve"}; // Specifiska istaba.

    // Spelētāja pozīcija.
    static volatile int virzienaSkaitlis = 3;
    static volatile int atrasanasSkaitlis = 3; // 1, no gultas istabas. 2, jo testā sāku no durvju istabas. 3, no virtuves istabas. 

    // Ieslēdz spēles testēšanas režīmu.
    public static boolean testesana = false;

    // *Beta* spēlētāja darbības.
    public volatile static boolean pagrabaGaismaON = false;

    // Spēlētāja darbības.
    public static boolean virtDarbibas;
    public static boolean pagrDarbibas;

    // Iestata tikšķa jeb 1 "refreša" periodu.
    public static int spelesAtrums = 1000 / 25; // Pēc cik ilga laika ekrāns "refrešojas". (Milisekundēs)
    public static int spelesIlgums = 20000;

    public static void main(String[] args) throws InterruptedException {
        // Jaunie rīki.
        Laiks laiks = new Laiks(); // Izveido jaunu Thredu, kas vienlaicīgi pildās
        Ievade ievadesLasitajs = new Ievade(); // Arī threads, bet šis lasa ievadi.

        // Sākas atsevišķās darbības jeb patstāvīgie procesi.
        laiks.start();
        ievadesLasitajs.start();


        tiritEkranu();
        // ================================================================== Sākas spēles kods ============================================================= //
        while (speleSakas) { // Kamēr laiks nav beidzies, turpināt ciklu jeb spēli.

            // ----------------------------------------------------------- vvv Jāatjauno, jāpārveido vvv --------------------------------------------------------//
            // Atjaunos istabas ar spoka bildēm tikai tad, kad loga spoks būs izvēlējies savu istabu.
            Spoki.logaSpoks();
            Spoki.durSpoks();
            Spoki.virSpoks();

            Istabu_Izskati.virtuvesPagrabaGaismasStavoklaNoteiksana();
            // ------------------------------------------------------------------^^^^^^^^^^^^^^^^^^^^^^^^^^^---------------------------------------------------- //

            Varona_Darbibas.varonaDarbibas(Ievade.ievade); // Lietotāja jeb varoņa ievade un tās darbības (komandas un to darbības).
            
            if (Spoki.spokuInfoIzvadeBoolean) { // Spoku informācijas izvade. --Debuging--
                Spoki.spokuInformacijasIzvade();
            }

            UI_Izskats.salipinataUIIzvade(); // Izvade uz ekrāna.
            
            Ievade.notiritIevadi(); // Cikla beigās notīra Ievadi, jo visas matodes, kurām tā bija vajadzīga jau to ir paņēmušas.

            try { // Vienas bildes izvade jeb beigas.
                Thread.sleep(spelesAtrums); // Spēle apstājas uz noteiktu brīdi. 30 FPS.
            } catch (Exception e) {
                // Kods ko pildīs, ja "try" kods izmetīs kļūdu.
            }
        }

        // Noķer un apstādina neatkarīgos procesus.
        laiks.join();
        ievadesLasitajs.join();
        // ======================================================================== Beidzas spēles kods ============================================================================== //
    }

    static void tiritEkranu() {
        System.out.print("\033[H\033[2J"); // Notīra terminālu.
        System.out.flush(); // Kaut kas ar kursora pozīciju.
    }
    
    // Kustoties pa māju, uz kuru pusi skatīsies varonis.
    static void istabasVirziens() {
        // Nosākuma pārbauda, kurā istabā atrodas varonis un pēc tam viņa virzienu.
        // Skatoties kurā istabā atrodas varons ir pieejami citi skati.

        // Gultas istaba.
        if (atrasanasVieta[atrasanasSkaitlis].equals("Gulta")) {
            if (virziens[virzienaSkaitlis].equals("Prieksa")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.modificetasGultPrieksasIzvade());

            } else if (virziens[virzienaSkaitlis].equals("LabaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.gultasLaba);

            } else if (virziens[virzienaSkaitlis].equals("Zeme")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.gultasZeme);

            } else if (virziens[virzienaSkaitlis].equals("KreisaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.gultasKreisa);
            }
        // Dīvāna istaba.
        } else if (atrasanasVieta[atrasanasSkaitlis].equals("Divans")) {
            if (virziens[virzienaSkaitlis].equals("Prieksa")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.modificetaDivanaPrieksasBildesIzvade());

            } else if (virziens[virzienaSkaitlis].equals("LabaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.divanaLaba);

            } else if (virziens[virzienaSkaitlis].equals("Zeme")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.divanaZeme);

            } else if (virziens[virzienaSkaitlis].equals("KreisaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.divanaKreisa);
            }
        // Durvju istaba.    
        } else if (atrasanasVieta[atrasanasSkaitlis].equals("Durvis")) {
            // Skatoties uz masīva elementu var noteikt, uz kuru pusi skatās varonis.
            if (virziens[virzienaSkaitlis].equals("Prieksa")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.modificetasDurPrieksasBildesIzvade());

            } else if (virziens[virzienaSkaitlis].equals("LabaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.durvisLaba);

            } else if (virziens[virzienaSkaitlis].equals("Zeme")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.durvisZeme);

            } else if (virziens[virzienaSkaitlis].equals("KreisaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.modificetaDurKreisasPusesBildesIzvade());
            }
        // Virtuves istaba.
        } else if (atrasanasVieta[atrasanasSkaitlis].equals("Virtuve")) {
            virtDarbibas = true;
            if (virziens[virzienaSkaitlis].equals("Prieksa")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.modificetasVirtPrieksasBildesIzvade());

            } else if (virziens[virzienaSkaitlis].equals("LabaP")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.virtuveLaba);

            } else if (virziens[virzienaSkaitlis].equals("Zeme")) {
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.virtuveZeme);

            } else if (virziens[virzienaSkaitlis].equals("KreisaP")) {
                pagrDarbibas = true;
                Istabu_Izskati.aktualasIstabasParrakstisana(Istabu_Izskati.modificetasVirtKreisasPusesIzvade()); // Izvada modificētu jeb pavisam jaunu istabu.
            }
        }
    }
    
    // Kustība pa māju.
    static void ietUzPrieksu(String tagadejaIstaba, String tagadejaisVirziens) {
        if (tagadejaIstaba.equals("Gulta")) {
            if (tagadejaisVirziens.equals("LabaP")) {
                atrasanasSkaitlis++;
                virzienaSkaitlis = 0; // Skats uz divana logu.
            } else if (tagadejaisVirziens.equals("Zeme")) {
                atrasanasSkaitlis = 3; // Ieiet virtuves istabā (3. jeb pēdējais elements).
                virzienaSkaitlis = 3; // Skats uz logu.
            }
        } else if (tagadejaIstaba.equals("Divans")) {
            if (tagadejaisVirziens.equals("LabaP")) {
                atrasanasSkaitlis++;
                virzienaSkaitlis = 0; // Skats uz durvīm.
            } else if (tagadejaisVirziens.equals("Zeme")) {
                atrasanasSkaitlis--;
                virzienaSkaitlis = 3; // Skats uz spoguli.
            }
        } else if (tagadejaIstaba.equals("Durvis")) {
            if (tagadejaisVirziens.equals("LabaP")) {
                atrasanasSkaitlis++;
                virzienaSkaitlis = 0; // Priekša
            } else if (tagadejaisVirziens.equals("Zeme")) {
                atrasanasSkaitlis--;
                virzienaSkaitlis = 3; // Skats uz dīvānu.
            }
        } else if (tagadejaIstaba.equals("Virtuve")) {
            if (tagadejaisVirziens.equals("LabaP")) {
                atrasanasSkaitlis = 0; // Ieiet gultas istabā (0. elements).
                virzienaSkaitlis = 0; // Skats uz gultu.
            } else if (tagadejaisVirziens.equals("Zeme")) {
                atrasanasSkaitlis--; // Vajadzēs virzienu mirorot.!!!!!!!!!!!!!!!!!!!!
                virzienaSkaitlis = 3; // Skats uz logu no virtuves puses.
            }
        }
    }
}