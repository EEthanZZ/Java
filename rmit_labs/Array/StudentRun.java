package Array;

public class StudentRun {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("john", 22);
        students[1] = new Student("mike", 33);
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
        String studentName = students[0].getName();
        System.out.println(studentName);
        students[1].setName("LLLLLLLLoke");
        System.out.println(students[1].getName());
    }

}
