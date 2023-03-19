package AbstructClass.Shape;

import java.util.ArrayList;

public class ShapeRun {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    Square sq = new Square(4);
    Circle c = new Circle(3);
    shapes.add(sq);
    shapes.add(c);
    for(Shape s: shapes){
        System.out.println(s);
    }
    }
}
