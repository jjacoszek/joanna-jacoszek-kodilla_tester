public class SimpleArray {

    public static void main(String[] args) {

        String[] animals = new String[5];
        animals[0] = "Elephant";
        animals[1] = "Cat";
        animals[2] = "Dog";
        animals[3] = "Lion";
        animals[4] = "Lark";

        String animal = animals[2];
        System.out.println(animal);

        int numberOfElements;
        numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + animals.length + " elementów");
    }

    }



