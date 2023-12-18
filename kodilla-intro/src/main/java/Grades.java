import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

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

}

class App {
    public static void main(String[] args) {
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

    }


}
