package Array.Students_array;

public class International extends Student {
    private String language;

    public International(String name, int stuID, String language) {
        super(name, stuID);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String toString() {
        return super.toString() + " speaks " + language;
    }
}
