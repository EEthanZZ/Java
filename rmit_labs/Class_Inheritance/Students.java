package Class_Inheritance;

public class Students extends PersonArray {
    private String program;
    private int year;

    public Students(String name_people, String add, String email) {
        super(name_people, add, email);
    }

    public Students(String name_people, String add, String email, String program) {
        super(name_people, add, email);
        this.program = program;
        System.out.println("SuperClass is called");
    }

    public String setProgram(String program) {
        // this.program = program;
        return super.toString() + "program is " + program;
    }

    public String toString() {
        return super.toString();
    }
}