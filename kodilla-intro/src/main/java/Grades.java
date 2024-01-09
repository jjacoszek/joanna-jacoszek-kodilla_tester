/*import java.util.Arrays;

public class Grades {
    private int[] grade;
    private int size;

    public Grades() {
        this.grade = new int[10];
        this.size = 0;
        //IntStream intStream = new Random().ints(1, 1, 10);
        //int[] ints = intStream.toArray();
    }

    public void add(int value) {
        if (this.size == 10) {
            return;

        }
        this.grade[this.size] = value;
        this.size++;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grade=" + Arrays.toString(grade) +
                ", size=" + size +
                '}';
    }



/*Public static void main (String[]args){
            System.out.println("The values were added");
            Grades g1 = new Grades();
            System.out.println("Array Elements");
            // Accessing elements
            for (int grade : g1.grade) {
                System.out.println(grade);

            }
        }*/

   /* public int[] getGrade() {
        return grade;
    }

    public int getSize() {
        return size;
    }

    public void findIndex9(int value) {

        int searchnumb == this.grade[9];
        if (int serchnumb != 0){
            System.out.println("to jest to " + serchnumb);
        }
        else{
            System.out.println("szukaj dalej");
        }
    }


}

class App {
    public void main(String[] args) {
        Grades grades = new Grades();
        grades.add(3);
        grades.add(5);
        grades.add(2);
        grades.add(6);
        grades.add(5);
        grades.add(3);
        grades.add(5);
        grades.add(3);
        grades.add(2);
        grades.add(4);
        System.out.println(grades);
        grades.findIndex9();


        double sum = 0;
        for (int n = 0; n < grades.getSize(); n++) {
            sum += grades[n].getGrades();
        }
        double avg = sum / grades.getSize();
        for (int n = 0; n < grades.getSize(); n++) {
            if(grades[n].getGrades()>avg){
                System.out.println(grades[n]);
            }


    }
}
}
*/
