package Array;

public class Student {
    private String name;
    private int number;

    public Student() {
        System.out.println("student is called");
    }

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ", number: " + number;
    }
}
