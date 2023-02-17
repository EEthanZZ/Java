package rmit_labs.Class;

public class TestMovie {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Joker", "Nolan", 2019, 5);
        System.out.println(movie1);
        movie1.setDirector("Todd Phillips");
        System.out.println(movie1);
        System.out.println(movie1.getYear());
    }
}