package Array.Food;

public class Snack extends Food {
    public String made;

    public Snack(String name, int price, String made) {
        super(name, price);
        this.made = made;
    }

    public String getMade() {
        return made;
    }

    public String toString() {
        return super.toString() + " made by " + made;
    }
}
