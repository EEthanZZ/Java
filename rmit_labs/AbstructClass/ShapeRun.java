package AbstructClass;

import java.util.ArrayList;

import AbstructClass.Shape.Circle;
import AbstructClass.Shape.Shape;
import AbstructClass.Shape.Square;

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
