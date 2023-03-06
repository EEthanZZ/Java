package Array;

import java.util.Random;

public class SquareRun {
    public static void main(String[] args) {
        Square[] squares = new Square[7];
        Random r = new Random();
        for (int i = 0; i < squares.length; i++) {
            double d = r.nextDouble();
            if (i % 2 == 0)
                squares[i] = new Square(d * 100);
            else
                squares[i] = new Square(3.3);
        }

        for (int i = 0; i < squares.length; i++) {
            System.out.printf("%8.2f\n", squares[i].getArea());
        }

    }
}
