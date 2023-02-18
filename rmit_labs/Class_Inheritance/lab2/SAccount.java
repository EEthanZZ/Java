package Class_Inheritance.lab2;

public class SAccount extends Account {
    private int amount;

    public SAccount() {
        System.out.println("SubClass SA is called");
    }

    public SAccount(int amount) {
        this.amount = amount;
    }

    public SAccount(String name, int card_no, int amount) {
        super(name, card_no);
        this.amount = amount;
        System.out.println("Subclass is called");
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String toString(int amount) {
        return super.toString() + ". availiable amount is " + amount;
    }
}
