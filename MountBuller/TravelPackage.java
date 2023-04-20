package MountBuller;

import java.io.Serializable;
import java.time.LocalDate;


public class TravelPackage implements Serializable {
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


    @Override
    public String toString() {
        return "{" +
            " packageID='" + getPackageID() + "'" +
            ", custId='" + getCustId() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", duration='" + getDuration() + "'" +
            "}";
    }

}