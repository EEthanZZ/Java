package Array.Whisky;

public class Whisky {
    private String from;
    private int age;
    private String cask;
    private double vol;

    public Whisky(String from, int age, String cask, double vol) {
        this.from = from;
        this.age = age;
        this.cask = cask;
        this.vol = vol;
    }

    public Whisky(String from, int age, String cask) {
        this.from = from;
        this.age = age;
        this.cask = cask;
    }

    public String getFrom() {
        return from;
    }

    public int getAge() {
        return age;
    }

    public String getCask() {
        return cask;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCask(String cask) {
        this.cask = cask;
    }

    public String toString() {
        return "From: " + from + " Year: " + age + " Cask: " + cask + " Vol: " + vol;
    }
}
