package Array;

import java.util.Scanner;

public class StudentRun {
    public static void main(String[] args) {
        int count = 0;
        String choice = "y";
        Student[] students = new Student[3];
        while (choice.equalsIgnoreCase("y")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Student name: ");
            String name = input.nextLine();
            System.out.println("Number: ");
            int number = input.nextInt();
            students[count] = new Student(name, number);
            count++;
            Scanner choiceinout = new Scanner(System.in);
            System.out.println("Do you wish to proceed?(Y/n)");
            choice = choiceinout.nextLine();
        }
        students[1].setName("Mike");
        students[0].setNumber(4);
        for (int i = 0; i < count; i++)
            System.out.println(students[i]);

    }
}
