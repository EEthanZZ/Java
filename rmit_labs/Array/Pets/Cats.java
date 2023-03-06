package Array.Pets;

public class Cats extends Pets {
    // specify variables for Cats
    private String hair;

    public Cats(String name, int age, String hair) {
        super(name, age);
        this.hair = hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public void speak(String word) {
        System.out.println("My cat " + name + " says " + word);
    }

    public String toString() {
        return super.toString() + "\nHair: " + hair;
    }
}
