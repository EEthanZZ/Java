package Array;

public class Square {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public String toString() {
        return "the length is " + length + "the area is " + getArea();
    }
}
