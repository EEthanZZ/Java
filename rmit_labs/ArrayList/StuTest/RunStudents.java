package rmit_labs.ArrayList.StuTest;

/**RunStudents will create ArrayList of Student type in
  * main method*/
  import java.util.*;

  public class RunStudents{
    public static void main(String[] args){
      //create array list object
      ArrayList<Student> students = new ArrayList<Student>();//size is 0
      //create Student object
      Student s1 = new Student(123, "Kate Ellis");
      //add to ArrayList
      students.add(s1); //size is 1
      //add another student
      students.add(new Student(234, "Maria Ellis"));
      //print list as a whole
      System.out.println(students);
      System.out.println("I have " + students.size() + " students");
      //get ( as Object) at index 1
      Student s2 = students.get(1);
      System.out.println("At index 1 we have " + s2);
      students.add(new Student(111, "Natasha Stepanova"));
      //display list using for-each loop
      for(Student s: students){
        System.out.println(s);
      }
      //insert student at index 1
      System.out.println("----------------------------");
      students.add(1, new Student(222, "Nora Gabbits"));
       //display list using for-each loop
      for(Student s: students){
        System.out.println(s);
      }
      //whats at index 1
      System.out.println("At index 1  we have " + students.get(1));
      //System.out.println("At index 4  we have " + students.get(4));
      //What is index of s2
      System.out.println("What is index of s2? " + students.indexOf(s2));
      //remove object at index 2
      Student s = students.remove(2);
      //what did we removed
      System.out.println("We removed " + s);
      System.out.println("After removal \n----------------------------");
      for(Student st: students){
        System.out.println(st);
      }
      //look at nonexisting element
      Student s4 = new Student(1000, "Ho Ho");
      System.out.println("Does \"s4\" contains? " + students.contains(s4));
      //index of nonexisting element
      System.out.println("Index of s4 is " + students.indexOf(s4));
      
      
      
      
    }
  }
