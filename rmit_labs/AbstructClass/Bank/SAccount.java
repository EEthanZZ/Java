package AbstructClass.Bank;

public class SAccount extends Account {
    private double minAmount;
    private double interestRate;

    public SAccount(){

    }
    public SAccount(String accID, double balance, double minAmount, double interestRate){
        super(accID,balance);
        this.minAmount = minAmount;
        this.interestRate = interestRate;
    }

    public double getMinAmount() {
        return this.minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance -amount >= minAmount){
            balance -= amount;
        }
        else{
            System.out.println("The amount you wish to withdraw is over limit");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " minAmount='" + getMinAmount() + "'" +
            ", interestRate='" + getInterestRate() + "'" +
            "}";
    }
    
}
