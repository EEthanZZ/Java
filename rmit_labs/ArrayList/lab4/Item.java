package ArrayList.lab4;

public class Item {
    protected String name;
    protected double price;
    protected int qty;

    public Item(){
    }
    public Item(String name, int qty){
        this.name = name;
        this.qty = qty;
    }
    public Item(String name, double price, int qty){
        this(name, qty);
        this.price = price;
    }

    public String geteName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void SetPrice(double price){
        this.price = price;
    }
    public void SetQty(int qty){
        this.qty = qty;
    }
    public void SetName(String name){
        this.name = name;
    }

    public String toString(){
        return name + ": " + "qty " + qty + "Total: " + qty*price;
    }
}
