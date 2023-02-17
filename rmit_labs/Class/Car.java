package rmit_labs.Class;

public class Car {
    private String make;
    private String model;
    private int year;
    private int carID;
    static int nextID = 1;

    public Car() {
        carID = nextID++;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carID = nextID++;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getCarID() {
        return carID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Car ID: " + carID + ", Make: " + make + ", Model: " + model + "Made in year of "
                + year;
    }
}