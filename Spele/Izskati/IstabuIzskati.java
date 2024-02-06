package Spele.Izskati;

public class IstabuIzskati {
  
  // ? ----------------------------------------------------------------------------------- GULTAS ISTABAS VIRZIENI --------------------------------------------------------------------------------------------------
  
  private static final String[] gultasPrieksa = {
    "       / |   |    ________                 ________________      |              " ,
    "      /| |   |   |        |               /            |\\  \\     |              " ,
    "     /|| |   |   | |\\/\\/\\ |               |            ||\\_|     |              " ,
    "    / || |   |   | | \\  | |               |____________||| |  _  |   /|\\        " ,
    "   /. || |   |   |  \\  /  |               |            \\|| | |=| |  / | \\       " ,
    "  /   || |   |   |   ||   |               |             \\|_| |_| | / /|  \\      " ,
    " / .  || |   |   |   ||   |               |                |     | |\\ |   \\     " ,
    "/|\\ / || |   |   |________|    _________  |                |     | | \\| | |     " ,
    "||    ||_|   |                |         | |                |     | |/ | | |     " ,
    "||/   |/ /   |                |_________| |                |     | |  |   |     " ,
    "||  \\ / /    |                |  _____  | |                |     | | / \\  |     " ,
    "||.  / / __  |                | |  |  | | |                |     | |/   \\ |     " ,
    "||  / / / /| |________________| | -O- | |_|                |_____|       \\|     " ,
    "|| / / /|/ |/                 | |__|__| |                         \\             " ,
    "||/ / / / //                  |_________|                          \\            " ,
    "|/ / /|/ /|                                                         \\           "
  };

  private static final String[] gultasLabaPuse = {
    "             |                       ________________            |              " ,
    "   _____     |                      /___________\\| | \\           |  __          " ,
    "  /     \\    |                      |             _|_|           | |  \\         " ,
    " /       |   |                      |____________|\\o_|           | | / |        " ,
    "/        ||| |                      |            ||/ |           | |   |        " ,
    "         ||| |                      |            \\|\\_|           | |\\  |        " ,
    "    A    |   |                      |             || |           | |   |        " ,
    "    R    |   |                      |             \\|\\|     ______| | . |        " ,
    "    K    |   |                      |              |||    |\\     \\  \\__|        " ,
    "    A    |   |                      |              \\||    | \\     \\             " ,
    "         |   |                      |               ||    | O\\     \\            " ,
    "         |   |                      |               \\|    |\\  \\     \\           " ,
    "         |   |______________________|                |____| \\  \\_____\\          " ,
    "         |  /                                             | O\\ |     |          " ,
    "         | /                                              \\\\  \\|     |          " ,
    "         |/                                                \\\\  |     |          "
  };
  
  private static final String[] gultasLeja = {
    "             |      _____                                        |              " ,
    "__           |     /     \\                                       |              " ,
    "  \\          |    |    .  |                                      |              " ,
    "   |         |    |  \\    |                                      |              " ,
    "   |         |    |       |                   _                 _|              " ,
    "   |         |    | .  /  |                  ( )      ___      ( )              " ,
    " A |         |     \\_____/                   | |___---   ---___| |              " ,
    " R |         |_____________________          | |               | |              " ,
    " K |        /                     /|         | |               | |              " ,
    " A |       /_____________________/ |         | |_______________| |              " ,
    "   |       | |       ( )       | | |         ||\\       _________\\|              " ,
    "   |       | |_________________| | |         || \\_____/          \\              ",
    "   |       | |       ( )       | | |_________|| |\\                \\             ",
    "   |       | |_________________| | |         ||\\| \\                \\            " ,
    "   |       |_____________________|/             \\  \\                \\           " ,
    "   |      /                                      \\  \\                \\          "
  };
  
  private static final String[] gultasKreisaPuse = {
    "             |                         ________________________  |              ",
    "             |                        |                        | |              ",
    "             |                        |                        | | |\\           " ,
    "             |                        |             L          | | | \\          " ,
    "             |_                       |             O          | | |  \\         " ,
    "             ( )                      |             G          | | ||\\_|        " ,
    "         ____| |                      |             S          | | |\\ /|        " ,
    "    _   /    | |                   _  |                        | | | | |        " ,
    "   ( ) /     | |                  ( ) |/______________________\\| | | | |        " ,
    "   | |/      |_|__________________| | ^   _________________      |  \\  |        " ,
    "   | |      / /                   | |$|==|_|___|__|__|___|_|     |   \\ |        " ,
    "   | |    /  /              _   / | | |  |_________________|     |    \\|        " ,
    "   | |  /    |             ( )/   | |_|____|_____________|_______|              " ,
    "   | |/_____/______________| |    | |                             \\             " ,
    "   | |      |              | |  / |_|                              \\            " ,
    "   | |______|______________| |/                                     \\           "
  };
  
  // ? ----------------------------------------------------------------------------------- DURVJU ISTABAS VIRZIENI --------------------------------------------------------------------------------------------------
  
  private static final String[] durvjuPrieksa = {
    " /  |    |       ________________________________                           |   ",
    "/   |    |      |                                |                          |   ",
    "    |    |      |              L                 |                          |   ",
    "    |    |      |              O                 |                          |   ",
    "    |    |      |              G                 |                          |   ",
    "    | +  |      |              S                 |                          |   ",
    "    |   /|      |                                |                          |   ",
    "    |  / |      |                                |                          |   ",
    "  + | /  |      |/______________________________\\|               ___________|   ",
    "    |/   |                                                       \\           \\  ",
    "    /____|                                                        \\           \\ ",
    "   /    /|                                                        |\\           \\",
    "  /    / |________________________________________________________|_\\           ",
    " /    /  |                                                           \\          ",
    "/    /  /                                                             \\         ",
    "    /  /                                                               \\        "
  };
  
  private static final String[] durvjuLabaPuse = {
    "             |                                                   |              ",
    "             |                              __________________   |              ",
    "             |                             |                  |  |              ",
    " /|          |                             |                  |  |   |\\       __",
    "/ |          |                             |                  |  |   | \\     /  ",
    "| |          |                             |         D        |  |   |  \\   /   " ,
    "| |          |                             |         U        |  |   |\\| |  |   " ,
    "| |          |                             |         R        |  |   |\\|/|  |   " ,
    "| |          |___________________          |         V        |  |   | |/|  |    " ,
    "| |         /      /  ~~ /       \\         |        I         |  |    \\| |  |   ",
    "| |        /      /_____/         \\        |        S         |  |     \\ |  |   ",
    "| |       /________________________\\       |                  |  |      \\|  |   ",
    "|_|        ||___________________||_________|                  |__|          |    " ,
    " /         |                     |                                \\         |   " ,
    "/         /|                     |                                 \\        |   " ,
    "         /                                                          \\       |   " ,
  };
  
  private static final String[] durvjuLeja = {
    "   |                                                   | \\                   \\  ",
    " . |              ________________                     |  \\___________________\\ ",
    "/| |   _______   / |_______v__|__v\\            |       |  |           | | | | | ",
    " | |  |       |  | |\\______\\_____/|           \\|/      |  |___________| |f|_| | ",
    " | |  |   |   |  | | | .-----. .--|   _        |       |  |____________\\|_|__\\| ",
    " | |  |  \\|/  |  |_| | |____O| |O_|  |=|       |       |  || | | | |        | | ",
    " | |  |  \\|/  |  |  \\|____________|  |_|       |       |  || |e|a|d|________| | ",
    " | |  |  \\|/  |  |                |            |       |  |_\\|_|_|_|_________\\| ",
    " | |  |___|___|  |                |            |       |  |          | | | || | ",
    " | |             |                |            |       |  |__________| |y|u|| | ",
    " | |             |                |            |       |  |___________\\|_|_|_\\| ",
    " | |             |                |           /|\\      |  | | | |           | | ",
    " | |_____________|                |__________/_|_\\_____|  |_| |p|___________| | ",
    " |/                                         /  |  \\     \\ |__\\|_|____________\\| ",
    " /                                             |         \\|___________________| ",
    "/                                                                              \\"
  };
  
  private static final String[] durvjuKreisaPuse = {
    "         /     /|     ___.----.___            |  \\_____________\\ |              ",
    "        /     / |  .--   _ _ |_|  --.         |  |      |      | |              ",
    "       /     /__|  |     \\//     | \\|         |  |      |      | |    .         ",
    "      /     /| /|  |_____//\\_____|  |         |  |      |      | |    |\\        ",
    "     /     /||/ |  | '--//-\\\\-'  |__|         |  |      |      | |    | \\       ",
    "    /     / |/__|  |                |         |  |      |      | |    | |\\      ",
    "   /     /  /  /|  |                |         |  |   +  |  +   | |    | | \\     ",
    "  /     /  /  / |  |                |         |  |      |      | |    | |. \\    ",
    " /     /  /| /|_|  |                |         |  |______|______| |    | |   \\   ",
    "/_____/  /||/||/|  |                |         |  |           | | |    | | /  \\  ",
    "|     | /||/||/ |  |                |  .---.  |  |           | | |    |_|   \\ \\ ",
    "|     |/||/ |/__|  |                |  \\___/  |  |___________| | |    \\  \\ .   \\",
    "|     | |/  /  /|__|                |__|_|_|__|  |____________\\|_|     \\  \\ /   ",
    "|     | /  /  //                       | | |   \\ |             |  \\     \\  \\ .  ",
    "|     |/  /| //                          |      \\|_____________|   \\     \\  \\   ",
    "|     |  /||//                                                      \\     \\  \\  "
  };
  
  // ? ----------------------------------------------------------------------------------- DĪVĀNA ISTABAS VIRZIENI --------------------------------------------------------------------------------------------------
  
  private static final String[] divanaPrieksa = {
    "             |           ____________________________            |              ",
    "             |          |                            |           |              ",
    "             |          |               L            |           |              ",
    "             |          |               O            |           |              ",
    "             |          |               G            |           |              ",
    "           __|          |               S            |           | |            ",
    "          /   \\         |                            |           | |            ",
    "         /    |         |/__________________________\\|         __|_|_    /      ",
    "        /     |                                           ____|\\   | \\  /       ",
    "       /.  x  |                                          |\\   |.\\     \\/        ",
    "      /  \\    |________                                  | \\  ||\\\\    /\\        ",
    "     /   |   /         \\                                 | o\\ || .\\_____\\       ",
    "    /    |  /________  /_________________________________|  |\\ | ||     |       ",
    "   /  x  | /         \\/|                                 \\  | \\ \\||     |       ",
    "  / \\    |/________  /|/                                  \\ | o\\ ||     |       ",
    " /  |    /         \\/|/                                    \\|   \\ |     |       "
  };
  
  private static final String[] divanaLabaPuse = {
    "   |                                                                        |   ",
    "   |                                                   ___.----.___         |   ",
    "   |         \\        /                             .--         | |--.      |   ",
    "   |          \\      /                              |___________|_| ||      |   ",
    "   |        ___\\____/____                       _   |              \\||      |   ",
    "   |       /___________ /|                     |=|  |               ||      |   ",
    "   |      |.--------.| | |               _     |_|  |               ||      |   ",
    "   |      ||        ||+| |               U          |               ||      |   ",
    "   |______||________||-| |____           |          |               ||      |   ",
    "   /      |__________|_|/     /|         |          |               ||      |   ",
    "  /__________________________/ |         |          |                |      |   ",
    "  |       |         |        | |         |_         |                |      |   ",
    "  |  O    |    O    |    O   | |_______ |--| _______|                |______|   ",
    "  |       |         |        | /        \\__/                                 \\  ",
    " /|_______|_________|________|/                                               \\ ",
    "/                                                                              \\"
  };
  
  private static final String[] divanaLeja = {
    "             |       ________________               _______      |              ",
    "             |      /__________./|   \\             /   |   \\     |              ",
    "    ______   |      |___o_____|| |___|            |    |    |    |              ",
    "   /      |  |      |___o_____||/    |            |    O--  |    |              ",
    "  /       |  |      |----------'     |            |         |    |              ",
    " /        |  |      |                |             \\_______/     |              ",
    "/         |  |      |                |                           |           |\\ ",
    "     A    |  |      |                |                           |           | \\",
    "     R    |  |      |                |                           |           |  ",
    "     K    |  |      |                |                           |   /\\      |/\\",
    "     A    |  |      |                |  _______________          |  /  \\     |\\ ",
    "          |  |      |                | /___/_____/___/ |         | /   /     | |",
    "          |  |______|                |_|   $     $   | |_________|/   /      | |",
    "          | /                          |   |     |   | |   ____  /   /        \\ ",
    "          |/                           |_____________|/    \\   \\/   /          \\",
    "                                                            \\  /   /\\           "
  };
  
  private static final String[] divanaKreisaPuse = {
    "   |                                                                        |   " ,
    "   |                                                                        |   " ,
    "   |                                                                        |   " ,
    "   |                    ___                                                 |   " ,
    "   |                   |<=]|                                                |   " ,
    "   |                   | | |             _________________________________  |   " ,
    "   |             _     |===|            /       \\                 /       \\ |   " ,
    "   |         _  / \\    | | |            |_   x   |       x       |   x   _| |   " ,
    "   |        /\\\\/ //    |___|           /  \\      |               |      /  \\|   " ,
    "   |        \\ /  /                    /_  /______|_______________|______\\  _\\   " ,
    "   |         // /                    |  \\/______/_________________\\______\\/  |  " ,
    "   |        /  / \\                   |  |      |                   |      |  |  " ,
    "   |_______/  /\\\\ \\__________________|  |      |                   |      |  |  ",
    "  /    ___// /__\\ \\\\____             |_______________________________________|  ",
    " /     \\__\\_/____\\  \\___\\                                                     \\ ",
    "/                 \\_/                                                          \\"
  };
  
  // ? ----------------------------------------------------------------------------------- VIRTUVES ISTABAS VIRZIENI --------------------------------------------------------------------------------------------------

  private static final String[] virtuvesPrieksa = {
    "   |                 ______________                              ___________|   ",
    "   |               _/____/___/___  \\          ________________  |\\           \\  ",
    "   |              /              \\/|  _____  /         _______\\ |\\\\           \\ ",
    "   |              |              | | |PHONE| |         \\      | ||\\\\ __________\\",
    "   |              |              | | |  _  | |         |\\ ..''| |||\\|          |",
    "   |              |              | | | ( ) | |_________| \\\\..'| |||||          |",
    "   |              |            - | | |  |  | |            \\   | |||||          |",
    "   |______________|            | | | | (_) | |             \\__| |||||          |",
    "   /     O---     |            | | | |_____| |              | | |||||          |",
    "  /    ___________|            - | |         |              | | |||||  .    .  |",
    " /    /|       |  |              | |         |                | |||||  |____|  |",
    "/    / |       |  |              | |         |                | |||||  |    |  |",
    "--E /__|_______|__|              | |_________|                |_|\\|||  |____|  |",
    "   /.-.           |______________|/                              \\\\||  |____|  |",
    "  /'._.'                                                          \\\\|  \\     \\ |",
    " /   |                                                             \\|__|\\_____\\|"
  };

  private static final String[] virtuvesLabaPuse = {
    "           /              /|                                     |              ",
    "          /              / |                                     |              ",
    "         /______________/  |      ___________________________    |   ______     ",
    "   ___   | ____   ____ |   |     |                           |   |  /      \\    ",
    "  /   \\  ||    | |    ||   |     |                           |   | |        \\   ",
    " /    |  ||    | |    ||   |     |               L           |   | |         |  ",
    "/     |  ||    | |    ||   |     |               O           |   | |         |  ",
    "      |  ||    | |    ||   ||    |               G           |   | |         |  ",
    "  A   |  ||    | |    ||   /|    |               S           |   | |         |  ",
    "  R   |  || ( )| |( ) || |/||    |/_________________________\\|   | |         |  ",
    "  K   |  ||    | |    || | ||                                    | |         |  ",
    "  A   |  ||    | |    || | /|_____                               | |         |  ",
    "      |  ||    | |    || |//     /_______________________________| |         |  ",
    "      |  ||    | |    || |/_____/|                                \\|___      |  ",
    "      |  ||____| |____|| |  |  | |                                     \\ __  |  ",
    "      |  |             |/|     |                                        \\  \\ |  "
  };
  
  private static final String[] virtuvesLeja = {
    "   |    __.-------.__                                       |  |       |       |",
    "   | .--             --.                                    |  |    ( )|( )    |",
    "  .| |                 |  _                                 |  |_______|_______|",
    " /|| |                 | |=|                                |  |_______________|",
    "/ || |                 | |_|                                |  |       |       |",
    "| || |       A         |                                    |  |       |       |",
    "| || |       R         |          |==^                      |  |       |       |",
    "| || |       K         |________V__||__V____________________|  |       |       |",
    "|_|| |       A         |\\ ---O |        \\      \\  {+}   {+}  \\ |       |       |",
    " / | |                 | \\_____\\________/_______\\_____________\\|    ( )|( )    |",
    "/  | |                 | |  _______    _______  |==(+)====(-)==|       |       |",
    "   | |                 | | |       |  |       | | |          | |       |       |",
    "   |_|                 | | |    ( )|  |( )    | | |          | |       |       |",
    "  /                    \\ | |_______|  |_______| | |__________| |_______|_______|",
    " /                      \\|______________________|______________|_______________|",
    "/                                                                               "
  };

  private static final String[] virtuvesKreisaPuse = {
    "    /        /  |   |   ________________                         |              ",
    "   /________/   |()/|  /________________\\                        |              ",
    "   |        |   | //|  |               /|                        |              ",
    "   |        | ()|// |  |____________()//|  _                     |              ",
    "   |        |   //  |  |_           ||/ | |=|                    |              ",
    "   |        |  //   |  |/|----------||  | |_|                .---------.        ",
    "   |        | //|   |  | |              |    ________________|\\         \\       ",
    "   |        |// |   |  | |              |   /  |             | \\         \\      ",
    "   |        |/  |   |  | |              |  /___H_____________|  '--------.\\     ",
    "   |        |   |   |  |/               |   |     .-.        |  |         |     ",
    "   |        |   |() |  |                |   |    '._.'       |  |         |     ",
    "   |______  |   |   |  |                |   |      |         |  |         |  .  ",
    "  /      /| | ()|   |__|                |___|_____/|\\________|  |         |  |\\ ",
    " /  {}  //| |   |  //                            / | \\       |  |         |  |~\\",
    "/      /O | |   | //                               |         | \\|         |  | ~",
    "  {}  //| | |   |//                                          | ||         |  |()"
  };
  
  // Masīvs satur visas istabas un visus istabas virzienus.
  public static final String[] [][] istabuMasivs = // String[] - Masīvs,  [][] - dimensijas.
	{ // { Priekša , LabāPuse , Leja , KreisāPuse } // Istabas virzieni.
	{ gultasPrieksa , gultasLabaPuse , gultasLeja , gultasKreisaPuse },                            // Gultas istaba [x][].
	{ divanaPrieksa , divanaLabaPuse , divanaLeja , divanaKreisaPuse },                              // Dīvāna istaba [x][].
	{ durvjuPrieksa , durvjuLabaPuse , durvjuLeja , durvjuKreisaPuse },    // Durvju istaba [x][].
	{ virtuvesPrieksa , virtuvesLabaPuse ,  virtuvesLeja , virtuvesKreisaPuse }     // Virtuves istaba.
  };
}