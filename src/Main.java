import java.util.Random;

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
        System.out.println("****************");

        prntRndString(rndString(7));
        System.out.println("****************");
        prntRndString(rndString(7));
        System.out.println("****************");


        //=========================== S-3 =====================
        System.out.println("=========== S3 uzduotis=============");

        // Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių jos argumentas dalijasi
        // be liekanos (išskyrus vienetą ir patį save).

        int num = nmbWithoutReminder(30);
        System.out.println(num);

        //=========================== S-4 =====================
        System.out.println("=========== S4 uzduotis=============");

        //Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
        // Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją


        int[] arrTest4 = rndArr(100, 33, 77);// sugeneravau masyva

        // Masyvo perrusiavimas
        for (int i = 0; i < arrTest4.length; i++) {
            for (int j = i + 1; j < arrTest4.length; j++) {
                int divI = nmbWithoutReminder(arrTest4[i]);// issivedu masyvo elementu div reiksmes
                int divJ = nmbWithoutReminder(arrTest4[j]);
                int temp = 0;
                if (divJ > divI) {// jeigu j div yra didesnis uz i div, apkeiciam juos vietomis
                    temp = arrTest4[i];
                    arrTest4[i] = arrTest4[j];
                    arrTest4[j] = temp;
                }
                      }

        }

        for (int k = 0; k < arrTest4.length; k++) {
            int divK = nmbWithoutReminder(arrTest4[k]);
            System.out.println(arrTest4[k] + " " + divK);
        }

        //=========================== S-5 =====================
        System.out.println("=========== S5 uzduotis=============");

        // Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 333 iki 777.
        // Naudodami 3 uždavinio funkciją iš masyvo suskaičiuokite kiek yra pirminių skaičių.
        // pirminiai skaiciai didesni nei 1 ir dalinasi tik is saves arba vieneto.

        int[] arrTest5 = rndArr(100,333,777);// sugeneravau masyva

        for (int i = 0; i < arrTest5.length; i++) {

            System.out.println(arrTest5[i] + " ");
        }
        System.out.println("toliau skaiciuoju pirminius skaicius");

        int count5 = 0;
        for (int i = 0; i < arrTest5.length; i++) {
            int div5 = nmbWithoutReminder(arrTest5[i]);// isivedu div reiksmes (is kiek sk dalinasi elementas)
            if (arrTest5[i] > 1 && div5 <= 2 ) {// jeigu dalinasi tik is 1 ir saves <=2
                count5++;
            }
        }
        System.out.println(count5);



        //=========================== S-8 =====================
        System.out.println("=========== S8 uzduotis=============");

        // Sugeneruokite masyvą iš trijų elementų, kurie yra atsitiktiniai skaičiai nuo 1 iki 33.
        // Jeigu tarp trijų paskutinių elementų yra nors vienas ne pirminis skaičius, prie masyvo pridėkite
        // dar vieną elementą- atsitiktinį skaičių nuo 1 iki 33. Vėl patikrinkite pradinę sąlygą ir
        // jeigu reikia pridėkite dar vieną elementą. Kartokite, kol sąlyga nereikalaus pridėti elemento.


        int[] arrTest8 = rndArr(3,1,33);// sugeneravau masyva





        //=========================== S-9 =====================
        System.out.println("=========== S9 uzduotis=============");

        // Sugeneruokite masyvą iš 10 elementų, kurie yra masyvai iš 10 elementų, kurie yra atsitiktiniai skaičiai
        // nuo 1 iki 100. Jeigu tokio didelio masyvo (ne atskirai mažesnių) pirminių skaičių vidurkis mažesnis už 70,
        // suraskite masyve mažiausią skaičių (nebūtinai pirminį) ir prie jo pridėkite 3.
        // Vėl paskaičiuokite masyvo pirminių skaičių vidurkį ir jeigu mažesnis nei 70 viską kartokite.


        //int [][]
        //int[] arrTest9 = rndArr(3,1,33);// sugeneravau masyva





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
            int count = 0;

            if (Character.isDigit(ch)) {
                row += ch;

            } else {
                if (!row.isEmpty()) {
                    System.out.println("[" + row + "]");
                }
                    row = "";
                System.out.println(ch);

            }

        }
    }

    // Funkciją, kuri skaičiuoja ir gražina iš kiek sveikų skaičių jos argumentas dalijasi be liekanos
    // (išskyrus vienetą ir patį save).


    public static int nmbWithoutReminder(int a) {
        int count = 0;
        for (int i = 2; i < a; i++) {
             if (a % i == 0) {
                count++;
            }
        } return count;
    }



    //Funkcija generuojanti masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.

    public static int[] rndArr (int a4, int min, int max) {
        int num = a4;
        int rangeMin = min;
        int rangeMax = max;
        int[] numbs = new int[a4];
        Random randomNumb = new Random();
        for (int i = 0; i < num; i++) {
            numbs[i] = randomNumb.nextInt(rangeMin, rangeMax);
        }
        return numbs;
    }
    // End of file
}