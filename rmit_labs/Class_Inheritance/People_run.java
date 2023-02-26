package Class_Inheritance;

public class People_run {
    public static void main(String[] args) {
        int count = 0;
        PersonArray[] people = new PersonArray[5];
        Students stu1 = new Students("stu1", "add1", "email1");
        count++;
        Students stu2 = new Students("stu2", "add2", "email2");
        count++;
        Employee emp1 = new Employee("emp1", "add3", "email3");
        count++;
        Employee emp2 = new Employee("emp2", "add4", "email4");
        count++;
        stu1.setProgram("pro1");
        people[0] = stu1;
        people[1] = stu2;
        people[2] = emp1;
        people[3] = emp2;
        for (int i = 0; i < count; i++) {

            if (people[i] instanceof Students) {
                System.out.println("this is Students: \n" + people[i]);
            } else {
                System.out.println("these are employers: \n" + people[i]);
            }
        }

    }
}