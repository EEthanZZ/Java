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
        System.out.println("Student class is called two");
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

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Name: " + name + ", number: " + number;
    }
}
