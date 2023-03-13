package ArrayList.lab2;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private int Cid;
    private String cName;
    ArrayList <Person> people = new ArrayList<Person>();

    public Course(){
    }
    public Course(int Cid, String cName){
        this.Cid = Cid;
        this.cName = cName;

    }

    public void enrolStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Student name: ");
        String name = input.nextLine();
        System.out.println("ID: ");
        int Sid = input.nextInt();
        Student s = new Student(Sid, name);
        System.out.println("Program: ");
        String program = input.nextLine();
        System.out.println("Year: ");
        int year = input.nextInt();
        s.setYear(year);
        people.add(s);
    }

    public void addEmplyee(){
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        int id = input.nextInt();
        System.out.println("Name: ");
        String name = input.nextLine();
        Employee e = new Employee(id, name);
        System.out.println("Salary: ");
        double salary = input.nextInt();
        e.setSalary(salary);
        people.add(e);
    }

    public void listStudents(){
        for (Person p:people){
            if (p instanceof Student){
                System.out.println(p);
            }
        }
    }
}
