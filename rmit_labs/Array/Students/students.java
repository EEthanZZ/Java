package Array.Students;

public class students {
    protected String name;
    protected int stuID;

    public students(String name, int stuID) {
        this.name = name;
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String toString() {
        return name + "'s ID: " + stuID;
    }
}
