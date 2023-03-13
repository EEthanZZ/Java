package ArrayList.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class College {
    private String coName;
    ArrayList <Course> courses = new ArrayList<Course>();
    Course course;
    
    public College(String coName){
        this.coName = coName;
    }
    public void addCourse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Course Name: ");
        String coName = input.nextLine();
        System.out.println("Course ID: ");
        int Cid = input.nextInt();
        Course c = new Course(Cid, coName);
        courses.add(c);
    }
    public void removeCourse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Course id: ");
        int id = input.nextInt();
        for (int i = 0; i < courses.size(); i++){
            Course c = courses.get(i);
            if (id == c.getCourseId()){
                courses.remove(c);
            }
        }
    }
    public void listCourses(){
        for (Course c : courses){
            System.out.println(c);
        }
    }

    public Course searchCourseByName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Course Name: ");
        String coueseName = input.nextLine();
        for (Course c: courses){
            if (coueseName.equals(c.getCourseName())){
                return c;
            }
        }
        return null;
    }

    public Course searchByCourseById(){
        Scanner input = new Scanner(System.in);
        System.out.println("Course ID: ");
        int cID = input.nextInt();
        for (Course c: courses){
            if (cID == c.getCourseId()){
                return c;
            }

        }
        return null;
    }
    public void run(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose from the following options:\n" +
            "1. Add course\n" +
            "2. List courses\n" +
            "3. Remove course\n" +
            "4. Enroll student into course\n" +
            "5. Add employee\n" +
            "6. List students\n"+
            "7. List employees\n" +
            "8. Exit\n");
//read user input
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            //create switch
            switch(choice){
            case 1:
            addCourse();
            break;
            case 2:
            listCourses();
            break;
            case 3:
            course = searchCourseByName(); 
            removeCourse();
            break;
            case 4:
            course = searchCourseByName();  
            course.enrolStudent();
                
            break;
            case 5:
            course = searchCourseByName();  
            course.addEmplyee();
            break;
            case 6:
            for(Course c: courses){
            System.out.println("Course: " + c.toString());
            c.listStudents();
            System.out.println();
            }
            break;  
            case 7:
            for(Course c: courses){
            System.out.println("Course: " + c.toString());
            c.listEmployees();
            System.out.println();
            }
            break;  
            case 8:
            flag = false;
            break;
            default:
            System.out.println("Wrong option");
            break;
                    }
                }
            }
}
