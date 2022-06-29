import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListoNuskaitymasIrSuma {
    public static void main(String[] args) {
        ArrayList<Double> prekiuKainos = nuskaitytiSarasa();
        System.out.println("prekiuKainos = " + prekiuKainos);

    }

    /**
     * Funkcija nuskaito realiųjų skaičių ArrayList'ą iš konsolės
     * @return realiųjų skaičių arraylistą.
     */
    public static ArrayList<Double> nuskaitytiSarasa() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Double> skaiciai = new ArrayList();
        System.out.println("Įveskite kiek bus sąraše skaičių:");
        int n = skaitytuvas.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + " sąrašo elementą");
            skaiciai.add(skaitytuvas.nextDouble());
        }
        return skaiciai;
    }


}
