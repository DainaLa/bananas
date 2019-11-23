package lt.sdaacademy.fundamentals.objectorentied.cicle;

import java.util.Scanner;

public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
}
