package ArrayList.StuTest;

/**Student.java will be used to create ArrayList of students
  */
  public class Student{
    //instance variables
    private int id;
    private String name;
    //constructors
    public Student(){
    }//null constructor
    public Student(int id, String name){
      this.id = id;
      this.name = name;
    }
    //get accessor methods
    public int getID(){
      return id;
    }
    public String getName(){
      return name;
    }
    //set mutator methods
    public void setID(int id){
      this.id = id;
    }
    public void setName(String name){
      this.name = name;
    }
    @Override
    public String toString(){
      return id + " " + name;
    }
  }
