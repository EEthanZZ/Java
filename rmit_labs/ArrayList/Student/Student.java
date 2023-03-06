package rmit_labs.ArrayList.Student;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return name + " " + id;
    }
}
