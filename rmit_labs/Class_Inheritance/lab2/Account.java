package Class_Inheritance.lab2;

public class Account {
    protected String name;
    protected int card_no;

    public Account() {
        System.out.println("superClass called");
    }

    public Account(String name, int card_no) {
        this.name = name;
        this.card_no = card_no;
        System.out.println("Supercalss Called");
    }

    public String getName() {
        return name;
    }

    public int getCard_no() {
        return card_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard_no(int card_no) {
        this.card_no = card_no;
    }

    public String toString(String name, int card_no) {
        return "The client " + name + " 's card number is " + card_no;
    }
}
