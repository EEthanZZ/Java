package Class_Inheritance.lab2;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setName("Ethan");
        acc1.setCard_no(123);
        System.out.println(acc1);

        CAccount acc2 = new CAccount("John", 456, 100);
        System.out.println(acc2);

        SAccount acc3 = new SAccount("Mark", 789, 200);
        System.out.println(acc3);
    }
}
