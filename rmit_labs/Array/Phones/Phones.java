package Array.Phones;

public class Phones {
    protected String brand;
    protected int price;
    protected boolean isNew;

    public Phones(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public String toString() {
        return brand + ": " + price;
    }
}