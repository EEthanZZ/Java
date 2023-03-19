package AbstructClass.Bank;

public class CAccount extends Account{
    private double creditLimit;
    public CAccount(){}
    public CAccount(String accID, double balance, double creditLimit){
        super(accID, balance);
        this.creditLimit = creditLimit;
    }
    public double gerCreditLimit(){
        return creditLimit;
    }
    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        // create a positive withdrawn
        double overdrawn = Math.abs(balance - amount);
        if (overdrawn <= creditLimit){
            balance -= amount;
            System.out.println("Withdraw was successful! Now Balance is: " + balance);
        }
        else{
            System.out.println("Not available amount");
        }
    }
        public String toString() {
            return super.toString() + ". Credit Limit: " + creditLimit;
        }
    
}
