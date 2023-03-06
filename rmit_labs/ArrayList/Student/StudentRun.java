package rmit_labs.ArrayList.Student;

import java.util.ArrayList;

public class StudentRun {
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList <Student>();
        Student s1 = new Student("s1", 1);
        students.add(s1);
        Student s2 = new Student("s2", 2);
        students.add(s2);
        students.add(new Student("s3", 3));
        System.out.println(students);
        System.out.println("I have " + students.size() + " students.");
        Student s4 = students.get(0);
        System.out.println("the first student is " + s4.getName());

        for (Student s:students){
            System.out.println(s);
        }

        Student s_rm1 = students.remove(2);
        System.out.println("remove: " + s_rm1);
        
        for (Student s:students){
            System.out.println(s);
        }

        students.
    }
}
