package homework;

public class CarRace {

    public static void main(String[] args) {

        Car bmw = new BMW(170);
        doRace(bmw);

        Car mercedes = new Mercedes(230);
        doRace(mercedes);

        Car toyota = new Toyota(90);
        doRace(toyota);
    }

    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println("The speed equals " + car.getSpeed());
    }
}

