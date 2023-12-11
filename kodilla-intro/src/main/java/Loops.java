public class Loops {
    public static void main(String[] args) {
        int[] tab1 = { 1, 7, 20, 100 };
        System.out.println("Suma liczb tab1: " + sumaLiczb(tab1));

    }
    public static int sumaLiczb(int[] tab) {
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            result = result + tab[i];
        }
        return result;
    }
    }















