package Array.Sports;

public class Boxing extends Sport {
    private String weight;

    public Boxing(String name, int fans, String weight) {
        super(name, fans);
        this.weight = weight;
        // TODO Auto-generated constructor stub
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void is_champion(String isornot) {
        System.out.println(name + isornot + " a champion.");
    }

    public String toString() {
        return super.toString() + " He is " + weight + " kg.";
    }
}
