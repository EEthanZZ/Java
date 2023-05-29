package MountBuller;

import java.io.Serializable;

public class Accommodation implements Serializable {
    private int accommodationID;
    private String type;
    private int capacity;
    private double pricePerNight;
    private boolean available;

    public Accommodation(int accommodationID, String type, int capacity, double pricePerNight) {
        this.accommodationID = accommodationID;
        this.type = type;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }

    public int getaccommodationID() {
        return accommodationID;}
    public String getType() {
        return type;
    }
   public void setType(String type) {
    this.type = type;}
    public int getCapacity() {
        return capacity;}
   public void setCapacity(int capacity) {
    this.capacity = capacity;}
   public double getPricePerNight() {
    return pricePerNight;}
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;}
    public boolean isAvailable() {
        return available;
    }
    public void bookAccommodation() {
        this.available = false;
    }

    @Override
    public String toString() {
        return String.format("Accommodation ID: %d\nType: %s\nCapacity: %d\nPrice per night: %.2f\n",
        accommodationID, type, capacity, pricePerNight);}
}