package Array.Pets;

public class Pets {
    // SuperClass of Cats and dogs
    protected String name;
    protected int age;

    public Pets() {
        // empty constructor
        System.out.println("SuperClass Empty is called");
    }

    public Pets(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(String word) {
        System.out.println(word);
    }

    public void eat(String food) {
        System.out.println("like eating " + food);
    }

    public String toString() {
        return "I have a " + getClass().getSimpleName() + " "
                + name + " of " + age + " years old.";
    }
}
