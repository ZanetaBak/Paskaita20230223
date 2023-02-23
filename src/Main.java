public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // FUNKCIJOS


        //=========================== S-1 =====================
        System.out.println("=========== S1 uzduotis=============");

        // Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant
        // “---” pradžioje ir gale. PVZ (---labas---)


        prntString("labas");


        //=========================== S-2 =====================
        System.out.println("=========== S2 uzduotis=============");

        // Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu.
        // Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].

        for (int i = 0; i < 10; i++) {
            String rndStr = rndString(7);
            System.out.println(rndStr);
        }

        prntRndString(rndString(7));


        //=========================== S-3 =====================
        System.out.println("=========== S3 uzduotis=============");


        // End of code
    }
    // Funkcijos

// Funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant
    // “---” pradžioje ir gale. PVZ (---labas---)

    public static void prntString(String str) {
        System.out.println("---" + str + "---");
    }

    // Funkcija generuoja atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).


    public static String rndString(int lenght) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String rndStr = "";
        for (int i = 0; i < lenght; i++) {
            rndStr += symbols.charAt((int) (Math.random() * (symbols.length() - 1)));
        }
        return rndStr;
    }

    // Funkcija spausdina Stringo simbolius stulpeliu.
    // Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].


    public static void prntRndString(String randomString) {
        String row = "";
        for (int i = 0; i < randomString.length(); i++) {
            char ch = randomString.charAt(i);
           // int charCount = 0;

            if (Character.isDigit(ch)) {
             //   charCount++;
                row += ch;
//                System.out.println("[" + row + "]");
            } else {
                // jeigu row != "", [row], row = "";

                System.out.println(ch);
            }
        }

    }


    // End of file
}