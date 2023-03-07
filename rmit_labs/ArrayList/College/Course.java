package ArrayList.College;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String cID;
    private String cName;
    ArrayList<Student> students;

    public Course(){}
    public Course(String cID, String cName){
        this.cName = cName;
        this.cID = cID;
        students = new ArrayList<Student>();
    }

    public void addStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Student Name:");
        String name = input.nextLine();
        System.out.println("Student ID: ");
        int id = input.nextInt();
        Student s = new Student(id, name);
        students.add(s);
    }

    public void removeStudent(){
        
    }

    public void listStudent(){
        for(Student s: students){
            System.out.println(s);
        }
    }
    public int numberOfStudents(){
        return students.size();
    }
    public String getCID(){
        return cID;
    }
    public String getCName(){
        return cName;
    }
}
