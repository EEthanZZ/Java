package Array.Phones;

public class Sumsung extends Phones {
    private String dispaly;

    public Sumsung(String brand, int price, String display) {
        super(brand, price);
        this.dispaly = display;
    }

    public String getDisplay() {
        return dispaly;
    }

    public void setDisplay(String display) {
        this.dispaly = display;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDisplay: " + dispaly;
    }
}
