package Array;

import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class StudentRun {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Students name: ");
            String name = input.nextLine();
            System.out.println("Student number: ");
            int number = input.nextInt();
            students[i] = new Student(name, number);
            input.nextLine();

            System.out.println();

        }
    }

}
