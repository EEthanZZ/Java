package ArrayList.College;
import java.util.*;

public class College {
    ArrayList<Course> courses = new ArrayList<Course>();
    private String cName;
    Scanner input = new Scanner(System.in);

    public College(String cName){
        this.cName = cName;
        courses.add(new Course("C1", "prgramming"));
        courses.add(new Course("C2", "Networking"));
    }
    private void addCourse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Course ID: ");
        String cid = input.nextLine();
        System.out.println("Course Name: ");
        String cName = input.nextLine();
        Course c = new Course(cid, cName);
        courses.add(c);
    }
    private Course searchForCourseById(String couseID){
        for(Course c: courses){
            if(c.getCID().equalsIgnoreCase(couseID)){
                return c;
            }
        }
        return null;
    }
    private Course searchForCourseByName(String cName){
        for (Course c: courses){
            if (c.getCName().equalsIgnoreCase(cName)){
                return c;
            }
        }
        return null;
    }
    private void removeC(){
        Scanner input = new Scanner(System.in);
        System.out.println("Course Id: ");
        String id = input.nextLine();
        for (int i = 0; i<courses.size(); i++){
            Course c = courses.get(i);
            if(c.getCName().equals(id)){
                courses.remove(c);
            }
        }

    }
    private void listCourse() {
        for(Course c: courses){
            System.out.println(c);
        }
    }
    public void run(){
        boolean flag = true;
        while(flag){
            System.out.println("Choose from following options: \n" + 
            "1: Add a cource: \n" + 
            "2: List courses: \n" + 
            "3: Remove a course: \n" +
            "4: Number of students into course: \n" +
            "5: Enroll student into course \n" +
            "6: Remove a student form course \n" + 
            "7: List students by course \n" + 
            "8: Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice){
            case 1:
            addCourse();
            break;
            case 2:
            listCourse();
            break;
            case 3:
            removeC();
            break;
            case 4:
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter ourse code: ");
            String cid = input1.nextLine();
            Course course = searchForCourseById(cid);
            System.out.println("Number of students in course " + cid + course.numberOfStudents());
            break;
            case 5:
            Scanner inoutid = new Scanner(System.in);
            System.out.println("Course Code: ");
            String cCode = input.nextLine();
            Course c = searchForCourseById(cCode);
            c.addStudent();
            break;
            case 6:
            Scanner inputCid = new Scanner(System.in);
            System.out.println("Student id: ");
            String id = inputCid.next();
            break;
            case 7:
                for(Course c2: courses){
                    System.out.println("Course: " + c2.toString());
                    c2.listStudent();
                    System.out.println();
                }
                break;
            case 8:
            flag = false;
            break;
        }
    

    }
}
public String toString(){
    return "College " + cName;
}
}
