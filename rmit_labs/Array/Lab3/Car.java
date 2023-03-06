package Array.Lab3;

public class Car {
    // instance variables
    private String make;
    private String model;
    private int year;
    private double engine;
    private boolean isInGarage;

    public Car() {
        System.out.println("null Constructor");
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, double engine) {
        this(make, model, year);
        this.engine = engine;
    }

    // accressor methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngine() {
        return engine;
    }

    public boolean getIsInGarage() {
        return isInGarage;
    }

    public void setIsGarage(boolean isInGarage) {
        this.isInGarage = isInGarage;
    }

    public String toString() {
        return make + " " + model + " " + year +
                " " + "\nengine: " + engine;
    }
}
