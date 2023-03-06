package Array.Students_array;

public class Domestic extends Student {
    private String fromState;

    public Domestic(String name, int stuID, String fromState) {
        super(name, stuID);
        this.fromState = fromState;
        // TODO Auto-generated constructor stub
    }

    public void setFromState(String fromState) {
        this.fromState = fromState;
    }

    public String toString() {
        return super.toString() + " is from " + fromState;
    }

}
