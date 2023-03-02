package Array.Students;

public class domestic extends students {
    private String fromState;

    public domestic(String name, int stuID, String fromState) {
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
