package AbstructClass.Shape;

public class Square extends Shape{
    private int length;
    public Square(int length){
        this.length = length;
    }
    public double getArea(){
        return length*length;
    }
    public String toString(){
        return "Square with length " + length + "has area: "
         + getArea();
    }
}
