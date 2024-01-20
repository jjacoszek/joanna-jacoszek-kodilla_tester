package homework;

public class Mercedes implements Car {

    private int speed;

    public Mercedes(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {

        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 45;

    }

    @Override
    public String getModel() {
        return null;
    }
}
