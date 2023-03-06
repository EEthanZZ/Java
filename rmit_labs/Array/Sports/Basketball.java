package Array.Sports;

public class Basketball extends Sport {
    private String height;

    public Basketball(String name, int fans, String height) {
        super(name, fans);
        this.height = height;
        // TODO Auto-generated constructor stub
    }

    public String getPlayer() {
        return height;
    }

    public void setPlayer(String height) {
        this.height = height;
    }

    public void setNetworth(int networth) {
        System.out.println("worth is " + networth);
    }

    public String toString() {
        return super.toString() + " top players is " + height + "m tall";
    }
}
