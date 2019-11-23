package lt.sdaacademy.fundamentalscoding.practicalexercisestogether.triangles;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private TrangleType triangleType;
    private int perimeter;

    public Triangle(int a, int b, int c, TrangleType triangleTyp) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.triangleType = triangleType;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public TrangleType getTriangleType() {
        return triangleType;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
