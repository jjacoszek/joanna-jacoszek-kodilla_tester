import java.util.Scanner;

public class Colors {

    public static char getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("what is a first letter?");
            char letter = scanner.next().charAt(0);
            return letter;
        }

    }




    public static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("The color is: (B - b , L- bl, A- bla, C - blac, K - black)");
            String merge = scanner.nextLine().trim().toUpperCase();
            switch (merge) {
                case "B":
                    return "B";
                case "L":
                    return "BL";
                case "A":
                    return "BLA";
                case "C":
                    return "BLAC";
                case "K":
                    return "BLACK";
                default:
                    System.out.println("Try again.");
            }


        }
    }
}