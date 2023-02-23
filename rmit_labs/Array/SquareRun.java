package Array;

public class SquareRun {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(2.2);
        squares[1] = new Square(3.3);
        squares[2] = new Square(4.4);
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i].toString());
        }
    }
}
