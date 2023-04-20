package MountBuller;

import java.io.Serializable;

public class Customer implements Serializable {
    private String firstName;
    private String lastName;
    private int level;
    private int cID;
    private static int nextID = 100;
    public Customer (String firstName, String lastName, int level){
        this.cID= nextID++;
        this.firstName = firstName;
        this.lastName =lastName;
        this.level = level;
    }

    public int getcID(){
        return cID;}
    public String getFirstName(){
        return firstName;}
    public void setFistName(String firstName){
        this.firstName=firstName;}
    public String getLastName() {
        return lastName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;}
    public String getLevel() {
        switch (level) {
            case 1:
                return "beginner";
            case 2:
                return "intermediate";
            case 3:
                return "expert";
            default:
                return "only input 1, 2 or 3";
        }
    }
    public void setLevel(int level) {
        this.level = level;}

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nID: " + cID + "\nSki Level: " + getLevel();
    }
}