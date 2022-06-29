import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListoIzanga {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = new ArrayList<>();

        skaiciai.add(5);
        skaiciai.add(50);
        skaiciai.add(-23);
        skaiciai.add(-47);
        
        System.out.println("skaiciai = " + skaiciai);
        
        // Išvedų list'o ilgį
        System.out.println("skaiciai.size() = " + skaiciai.size());

        // Išimu iš list'o skaičių, kurio reikšmė yra 50.
        skaiciai.remove(Integer.valueOf(50));
        System.out.println("skaiciai = " + skaiciai);
        
        // Išimu iš list'o paskutinį jo skaičių.
        skaiciai.remove(skaiciai.size() - 1);
        System.out.println("skaiciai = " + skaiciai);

        // pridedu porą skaičių
        skaiciai.add(25);
        skaiciai.add(4 + 8);
        skaiciai.add(27);
        System.out.println("skaiciai = " + skaiciai);

        // Išvedu tik tai 2-ą skaičių:
        System.out.println("skaiciai.get(2) = " + skaiciai.get(2));


        // pakeičiu 3-o elemento reikšmę į 50
        skaiciai.set(3, 50);
        System.out.println("skaiciai = " + skaiciai);

        // pasakau, kad skaiciai yra naujas tuščias arraylistas
        skaiciai = new ArrayList<>();
        System.out.println("skaiciai = " + skaiciai);
    }
}
