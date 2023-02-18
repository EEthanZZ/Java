package Class_Inheritance.lab2;

public class CAccount extends Account {
    protected int limit;

    public CAccount() {
        System.out.println("Subclass CA is called");
    }

    public CAccount(int limit) {
        this.limit = limit;
        System.out.println("Credit account limit is " + limit);
    }

    public CAccount(String name, int card_no, int limit) {
        super(name, card_no);
        this.limit = limit;
        System.out.println("Superclass is called");
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public String toString() {
        return super.toString() + ". Client Credi limit is " + limit + ".";
    }
}
