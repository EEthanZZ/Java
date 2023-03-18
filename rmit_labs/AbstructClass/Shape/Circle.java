package AbstructClass.Shape;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Circle with " + radius + " has area: " 
        + getArea();
    }
}
