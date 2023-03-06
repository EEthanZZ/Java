package Array.Pets;

public class Dogs extends Pets {
    // Subclass of Pets Class
    private String breed;

    public Dogs(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void speak(String word) {
        System.out.println(name + " says " + word);
    }

    public String toString() {
        return super.toString() + ". \nBreed: " + breed;
    }

}
