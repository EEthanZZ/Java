package rmit_labs.Class_Inheritance;

public class Students extends People{
    private String program;
    private int year;
    
    public Students(String name_people, String add, String email){
        super(name_people, add, email);
        System.out.println("SuperClass is called");
    }
    public Students(String name_people, String add, String email, String program, int year){
        super(name_people, add, email);
        this.program = program;
        this.year = year;
        System.out.println("SuperClass is called");
    }

    public String toString(){
        return super.toString() + "program is " + program + ", is in year of " + year;
    }
}