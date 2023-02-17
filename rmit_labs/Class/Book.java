package rmit_labs.Class;

public class Book {
    private String title;
    private String author;
    private int year;
    private int bookID;
    static int nextID = 1;

    public Book(String title, String author, int yaer) {
        this.title = title;
        this.author = author;
        this.year = yaer;
        bookID = nextID++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getBookID() {
        return bookID;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book ID: " + bookID + " Title: " + author + "written in " + year + "year, by "
                + author;
    }
}