package Array.Students;

public class international extends students {
    private String language;

    public international(String name, int stuID, String language) {
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
