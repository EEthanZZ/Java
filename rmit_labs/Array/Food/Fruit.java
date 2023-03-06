package Array.Food;

public class Fruit extends Food {
    private String from;

    public Fruit(String name, int price, String from) {
        super(name, price);
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String toString() {
        return super.toString() + ", from: " + from;
    }
}
