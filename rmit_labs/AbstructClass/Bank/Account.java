package AbstructClass.Bank;

public abstract class Account {
    protected String accID;
    protected double balance;

    public Account(){
    }
    public Account(String accID, double balance){
        this.accID = accID;
        this.balance = balance;
    }
    public String getAccId(){
        return accID;
    }
    public void setAccID(String accID){
        this.accID = accID;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    //abstract method
    public abstract void withdraw(double amount);

    public String toString(){
        return "Account:" + accID + ". Balance: " + balance;
    }
}
