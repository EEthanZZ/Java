package Class;

public class Movie {
    private String title;
    private String director;
    private int year;
    private int movieID;
    private int rating;
    static int nextID = 1;

    public Movie(String title, String director, int year, int rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.movieID = nextID++;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int rating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Movir ID: " + movieID + ", movie title: " + title + ", director: " + director +
                " rating: " + rating;
    }
}