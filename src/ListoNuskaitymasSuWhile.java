import java.util.ArrayList;
import java.util.Scanner;

public class ListoNuskaitymasSuWhile {
    public static void main(String[] args) {
        ArrayList<Integer> temperaturos = nuskaitytiLista();

        System.out.println("temperaturos = " + temperaturos);

    }

    /**
     * Funkcija nuskaito listą iš konsolės naudojant while ciklą.
     * Nuskaitoma yra String eilutė, jeigu ta eilutė NĖRA žodis "Stop", tada bando konvertuoti į skaičių ir jį pridėti į listą
     * Jeigu ta nuskaityta iš konsolės eilutė yra "stop", tai tada nustoja while ciklas ir listo nuskaitymas baigėsi
     * @return sveikų skaičių listą
     */
    public static ArrayList<Integer> nuskaitytiLista() {
        Scanner skaitytuvas = new Scanner(System.in);
        final String stabdymoZodis = "STOP";
        ArrayList<Integer> skaiciai = new ArrayList<>();
        System.out.println("Įveskite sąrašo skaičius. Jeigu norite sustoti rašykite 'STOP'");
        String eilute;
        eilute = skaitytuvas.nextLine();
        while (!eilute.equalsIgnoreCase(stabdymoZodis)) {
            int skaicius = Integer.parseInt(eilute);
            skaiciai.add(skaicius);
            eilute = skaitytuvas.nextLine();
        }
        return skaiciai;
    }
}
