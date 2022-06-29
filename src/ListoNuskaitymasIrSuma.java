import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListoNuskaitymasIrSuma {
    public static void main(String[] args) {
        ArrayList<Double> prekiuKainos = nuskaitytiSarasa();
        System.out.println("prekiuKainos = " + prekiuKainos);

        System.out.println("listoSuma(prekiuKainos) = " + listoSuma(prekiuKainos));

    }

    /**
     * Funkcija nuskaito realiųjų skaičių ArrayList'ą iš konsolės, NAUDOJANT papildomą kintamąjį.
     * T.y., funkcija pirma paklausia vartotojo KIEK bus sąraše skaičių ir po to pagal įvestą informaciją, nuskaito sąrašą.
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

    /**
     * Funkcija, kuri apskaičiuoja listo sumą
     * @param listas kurio sumą skaičiuoti
     * @return double sumą
     */
    public static double listoSuma(ArrayList<Double> listas) {
        double suma = 0;
        for (int i = 0; i < listas.size(); i++) {
            suma += listas.get(i);
        }
        return suma;
    }

}
