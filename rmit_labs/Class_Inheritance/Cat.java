package rmit_labs.Class_Inheritance;

public class Cat extends Pet {
    private String hair;

    public Cat() {
        System.out.println("SuperClass Pet called");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String hair) {
        super(name, age);
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String toString() {
        return super.toString() + "this is a cat";
    }
}