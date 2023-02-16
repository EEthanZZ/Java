package rmit_labs;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Porter", "J.K", 2000);
        System.out.println(book1);
        Borrower b1 = new Borrower("YC", "ZHU", 04040404);
        System.out.println(b1);
        System.out.println(b1.getBook());
        b1.setBook(book1);
        System.out.println(b1.getFirstname() + b1.getLastname() + "borrow: " + b1.getBook());
    }
}