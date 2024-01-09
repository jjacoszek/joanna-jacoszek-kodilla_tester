import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        int suma = 0;
        int x = 0;
        while (suma < 5000) {
            x = random.nextInt(0, 30);
            suma += x;
            list.add(x);
            System.out.println("Program losuje " + " git" + suma + " przed sortowaniem wartosc to " + x);

        }
        Collections.sort(list);
        System.out.println("Po sortowaniu " + list);
        System.out.println("Wartosc minimalna to " + list.get(0));

        System.out.println("Rozmiar listy to " + list.size());
        System.out.println("Wartosc maksymalna to " + list.get(list.size()-1));

    }


}





























