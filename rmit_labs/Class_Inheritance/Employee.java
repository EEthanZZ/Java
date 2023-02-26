package Class_Inheritance;

public class Employee extends People {
    private String office;
    private int salary;

    public Employee() {
        System.out.println("SubClass is called");
    }

    public Employee(String name_people, String add, String email) {
        super(name_people, add, email);
        System.out.println("SuperClass is called");
    }

    public Employee(String name_people, String add, String email, String office, int salary) {
        super(name_people, add, email);
        this.office = office;
        this.salary = salary;
        System.out.println("SuperClass is called");
    }

    public String toString() {
        return super.toString() + "at " + office + " office " + " paid " + salary + " per year";
    }
}