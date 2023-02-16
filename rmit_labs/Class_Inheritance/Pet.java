package rmit_labs.Class_Inheritance;

public class Pet {
    protected String name;
    protected int age;

    public Pet() {
        System.out.println("Superclass constructor is called");
    }

    public Pet(String name, int age) {
        System.out.println("Superclass constructor is called");
        this.name = name;
        this.age = age;
        System.out.println("Superclass constructor is called");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "it's name is: " + name + " and it's " + age + " years old.";
    }

    public void speak(String sound) {
        System.out.println(sound);
    }

    public void eat(String food) {
        System.out.println(name + "likes " + food);
    }
}