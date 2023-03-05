package Array.Food;

public class Food {
    protected String name;
    protected int price;
    protected boolean isHealthy;

    public Food(String name2, int price2) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public String toString() {
        return name + " costs $" + price + "/kg";
    }
}
