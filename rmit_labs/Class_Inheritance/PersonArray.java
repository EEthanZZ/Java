package Class_Inheritance;

public class PersonArray {
    protected String name_people;
    protected String add;
    protected String email;

    public PersonArray() {
        System.out.println("superclass called");
    }

    public PersonArray(String name_people, String add, String email) {
        this.name_people = name_people;
        this.add = add;
        this.email = email;
    }

    public String getName_people() {
        return name_people;
    }

    public String getAdd() {
        return add;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name_people + "lives at " + add + ", the email add is " + email;
    }
}