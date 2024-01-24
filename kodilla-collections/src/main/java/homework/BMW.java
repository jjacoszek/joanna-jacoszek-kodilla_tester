package homework;

public class BMW implements Car{

    private int speed;

    public BMW(int speed){

        this.speed = speed;
    }



    @Override
    public int getSpeed() {

        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
        }



    @Override
    public void decreaseSpeed() {
    speed -= 10;

    }

    @Override
    public String getModel() {

        return "BMW";
    }
}
