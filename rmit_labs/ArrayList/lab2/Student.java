package ArrayList.lab2;

public class Student extends Person{ 
    private int year;
    private String program;

    public Student(){
    }
    public Student(int year, String program){
        this.year = year;
        this.program = program;
    }
    public Student(int year, String program, int id, String name){
        super(id, name);
        this.year = year;
        this.program = program;
    }
    public String getProgram( ){
        return program;
    }
    public int getYear( ){
        return year;
    }
    public void setYear(int year ){
       this.year = year;
    }
   
    public void setProgram(String program) {
        this.program = program;
    }
      public String toString(){
        return super.toString() + "\nProgram: "+ program + "\nyear:" +  year;
      }
}
