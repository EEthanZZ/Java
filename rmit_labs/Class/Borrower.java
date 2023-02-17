package rmit_labs.Class;

public class Borrower {
    private String firstname;
    private String lastname;
    private int id;
    private int phone;
    static int nextID = 1;
    private Book book;

    public Borrower(String firstname, String lastname, int phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        id = nextID++;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public void setId(int phone) {
        this.phone = phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String toString() {
        return "Borrower ID: " + id + ", name: " + firstname + " " + lastname + " " + phone;
    }
}