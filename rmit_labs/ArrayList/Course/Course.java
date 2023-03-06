package ArrayList.Course;

import java.util.ArrayList;
import java.util.Scanner;

public class Course{
    private String cCode;
    private String cName;
    private ArrayList<Student> students;

    public Course(){
        students = new ArrayList<>();
    }
    public Course(String cCode, String cName){
        this.cCode = cCode;
        this.cName = cName;
        students = new ArrayList<Student>();
    }
    private void addStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("ID: ");
        int id = input.nextInt();
        System.out.println();//add a new line after enter id
        System.out.println("Name: ");
        String name = input.next();
        System.out.println();//add a new line after name cfreated
        Student s1 = new Student(name, id);

        //add Student s1 to ArrayList
        students.add(s1);
    }

        private void listStudents() {
            for (Student st: students){
                System.out.println(st);
            }
        }
        public void run() {
            boolean flag = true;
            int choice = 0;
            Scanner choiceInput = new Scanner(System.in);
            while(flag){
                System.out.println("Choose: \n" + 
                                   "1. Add a student\n" + 
                                   "2. List students\n" +
                                   "3. Exit\n");
            
            choice = choiceInput.nextInt();

            switch(choice){
                case 1:
                addStudent();
                break;
                case 2:
                listStudents();
                break;
                case 3:
                flag = false;
                default:
                System.out.println("Wrong option, choose between 1-3");
                break;
            }
        }
    }
}