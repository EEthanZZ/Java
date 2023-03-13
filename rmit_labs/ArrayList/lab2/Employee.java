package ArrayList.lab2;

public class Employee extends Person{
    private double salary;
    public Employee(){
    }
    public Employee(int id, String name){
        super(id, name);
    }
    public Employee(double salary, int id, String name){
        super(id, name);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "\nSalary" + salary;
    }
}
