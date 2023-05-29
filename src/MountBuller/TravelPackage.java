package MountBuller;

import java.io.Serializable;
import java.time.LocalDate;


public class TravelPackage implements Serializable {
    private Customer customers;
    private Accommodation accommodations;
    private int packageID;
    private int custId;
    private LocalDate startDate;
    private int duration;
    private double cost;
    private boolean liftPass=false;
    private double liftPassCost = 26.0;
    private double lessonFee;
    private int lessonsNo;
    private boolean hasLessonFee=false;
    private static int nextID=10;

    public TravelPackage(){
        packageID = nextID++;
    }
    public TravelPackage(int custId, int duration){
        this.custId = custId;
        this.duration = duration;
    }
    public TravelPackage(int custId, int duration, LocalDate starDate){
        this(custId, duration);
        this.startDate = starDate;
    }
    public TravelPackage(int custId, int duration, LocalDate starDate, int lessonsNo){
        this(custId, duration, starDate);
        this.lessonsNo = lessonsNo;
    }
    public TravelPackage( Customer customers, Accommodation accommodations, LocalDate startDate, int duration) {
        this.packageID = Integer.parseInt("" + customers.getcID() + nextID++);;
        this.customers= customers;
        this.accommodations = accommodations;
        this.startDate = startDate;
        this.duration = duration;
    }

    public int getPackageID() {
        return this.packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public int getCustId() {
        return this.custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isLiftPass() {
        return this.liftPass;
    }

    public boolean getLiftPass() {
        return this.liftPass;
    }

    public void setLiftPass(boolean liftPass) {
        this.liftPass = liftPass;
    }

    public double getLiftPassCost() {
        return this.liftPassCost;
    }

    public void setLiftPassCost(double liftPassCost) {
        this.liftPassCost = liftPassCost;
    }

    public double getLessonFee() {
        return this.lessonFee;
    }

    public void setLessonFee(double lessonFee) {
        this.lessonFee = lessonFee;
    }

    public int getLessonsNo() {
        return this.lessonsNo;
    }

    public void setLessonsNo(int lessonsNo) {
        this.lessonsNo = lessonsNo;
    }

    public boolean isHasLessonFee() {
        return this.hasLessonFee;
    }

    public boolean getHasLessonFee() {
        return this.hasLessonFee;
    }

    public void setHasLessonFee(boolean hasLessonFee) {
        this.hasLessonFee = hasLessonFee;
    }
    private double calculateLiftPassCost() {
        if (duration == 5) {
            // 10% discount for first 5 days
            liftPassCost = liftPassCost * 5 * 0.9; 
        } else if (duration > 5) {
                //life pass
            liftPassCost=200.0; 
        } else {
            liftPassCost = liftPassCost * duration;
        }
        return liftPassCost;
    }



    @Override
    public String toString() {
        String liftPassnull = "";
        if (liftPass==true) {
            liftPassnull = "Costs: $" + calculateLiftPassCost();
        }
        return "Package ID: " + packageID + "\n" +
                "Customer ID: " +customers.getcID()+" "+ customers.getFirstName() + " " + customers.getLastName() + " " +customers.getSkiLevel()+ "\n" +
                "Accommodation ID： + "+ accommodations.getaccommodationID()+ "\n" + accommodations.getType() + 
                "Start date: " + startDate.toString() + "\n" +
                "Duration in days: " + duration + "\n"+
                "Lift pass: " + (liftPass ? "Included " + liftPassnull : "Not included") + "\n" +
               "Lesson fee: " + (customers.lessonFee(lessonsNo));
    }

}