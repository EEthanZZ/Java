package Quiz;

public class HourlyEmployee extends Employee{
    private double ratePerHour;
    private int hours;
    public HourlyEmployee(){
    }
    public HourlyEmployee(String name, String add, int phone){
        super(name,add,phone);
    }
    public HourlyEmployee(String name, String add, int phone, double ratePerHour, int hours){
        super(name,add,phone);
        this.ratePerHour = ratePerHour;
        this.hours = hours;
    }

    public double getRatePerHour() {
        return this.ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "{" + super.toString()+
            " ratePerHour='" + getRatePerHour() + "'" +
            ", hours='" + getHours() + "'" +
            "}";
    }

    }

