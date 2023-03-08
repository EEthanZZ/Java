package ArrayList.College;
import java.util.*;
public class College {
    ArrayList<Course> courses = new ArrayList<Course>();
    private String cName;
    Scanner input = new Scanner(System.in);

    public College(String cName){
        this.cName = cName;
        
    }
}
