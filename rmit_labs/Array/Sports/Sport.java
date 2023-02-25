package Array.Sports;

public class Sport {
    protected String name;
    protected int fans;

    public Sport(String name, int fans) {
        this.name = name;
        this.fans = fans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getName() {
        return name;
    }

    public int getFans() {
        return fans;
    }

    public void popularity(String pop) {
        System.out.println("is " + pop);
    }

    public String toString() {
        return name + " has " + fans + " fans in the world.";
    }
}
