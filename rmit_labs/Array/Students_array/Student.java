package Array.Students_array;

public class Student {
    protected String name;
    protected int stuID;
    protected boolean isPR;

    public Student(String name, int stuID) {
        this.name = name;
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public boolean getIsPR() {
        return isPR;
    }

    public void setIsPR(boolean isPR) {
        this.isPR = isPR;
    }

    public String toString() {
        return name + "'s ID: " + stuID;
    }
}
