package Array.Phones;

public class Iphone extends Phones {
    private String chip;

    public Iphone(String brand, int price, String chip) {
        super(brand, price);
        this.chip = chip;
        // TODO Auto-generated constructor stub
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String toString() {
        return super.toString() + ".\nChip: " + chip;
    }
}
