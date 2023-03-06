package Class_Inheritance;

public class Dog extends Pet {
    private String breed;

    public Dog() {
        System.out.println("SubClass is called");
    }

    public Dog(String name, int age) {
        super(name, age);
        System.out.println("SubClass is called");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("SubClass is called");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void speak(String sound) {
        System.out.println(name + "says" + sound);
    }

    public String toString() {
        return super.toString() + name + "is " + breed + ".";
    }
}