package lt.sdaacademy.tasks1111;

import org.jetbrains.annotations.Contract;

public class Task3Car {
    private String model;
    private int engine;
    private int year;
    private int price;
    private String type;
    static int count = 0;

    @Contract(pure = true)
    public Task3Car(String model, int engine, int year, int price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getEngine() {
        return engine;
    }
    public void setEngine(int engine) {
        this.engine = engine;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Task3Car.count = count;
    }
    @Override
    public String toString() {
        return "Task3Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}