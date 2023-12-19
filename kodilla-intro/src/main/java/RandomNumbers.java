import java.util.Random;

public class RandomNumbers {

    private int[] randomnumbers;
    int size;

    public RandomNumbers(int[] randomnumbers, int size) {
        this.randomnumbers = randomnumbers;
        this.size = size;
    }

    public int[] getRandomnumbers() {
        return randomnumbers;
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        if (this.size == 30) {
            return;

        }
        this.randomnumbers[this.size] = value;
        this.size++;


    }

    public static void main(String[] args) {

        RandomNumbers no = new RandomNumbers();
        Random generator = new Random();


        double sum =0;
        for(int i=0; i< 5000; i++) {
            sum += no[i].getRandomnumbers();
        }
        no.add(generator.nextInt());
        }


    }









}
