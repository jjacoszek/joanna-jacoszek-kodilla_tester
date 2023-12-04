public class LeapYear {

    /* sprawdz czy dany rok jest przestepny */
    public static boolean LeapYear(int year)
        {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }

        public static void main(String[] args) {
            int year;
            year = 2023;

            if (LeapYear(year)){
                System.out.println("Podany rok jest przestepny.");
            }
            else {
                System.out.println("Podany rok nie jest przestepny.");
            }
        }
}








