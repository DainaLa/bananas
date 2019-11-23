package lt.sdaacademy.fundamentals.objectorentied.bicycle;

public class Bicycle {
    private int model;
    private int gear;
    private int speed;
    static int count = 0;

    public Bicycle(int model, int gear, int speed) {

        this.model = model;
        this.gear = gear;
        this.speed = speed;
        this.count++;
    }

    public int getModel() {
        return model;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public static int getCount() {
        return count;
    }
}