package AbstructClass.Bank;

public class Bank {
    public static void main(String[] args) {
        SAccount sacc1 = new SAccount("s123", 3000, 10, 2.5);
        System.out.println(sacc1);
        sacc1.deposit(300);
        System.out.println("After depositing 300 balance is " + sacc1.getBalance());
        
        sacc1.withdraw(600);
        System.out.println("After withdrawing 600 balance is " + sacc1.getBalance());
    }
}
