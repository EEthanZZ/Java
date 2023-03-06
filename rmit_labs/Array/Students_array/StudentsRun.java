package Array.Students_array;

public class StudentsRun {

    public static void main(String[] args) {
        Student d1 = new Student("d1", 2);
        Domestic d2 = new Domestic("d2", 2, "nsw");
        International i1 = new International("i1", 3, "jp");
        International i2 = new International("i2", 4, "kr");
        Student[] students = new Student[4];
        students[0] = d1;
        students[1] = d2;
        students[2] = i1;
        students[3] = i2;
        i1.setIsPR(true);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (int i = 0; i < students.length; i++) {
            if (!students[i].getIsPR()) {
                System.out.println("\n" + students[i].getName() + " will have HECS goverment substitude");
            }
        }

    }
}