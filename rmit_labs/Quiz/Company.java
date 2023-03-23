package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private ArrayList<Employee> employees;

    public void populateList(){
        Employee emp1 = new Employee("john", "Mel", 123);
        Employee emp2 = new Employee("mike", "Geelong", 456);
        Employee emp3 = new HourlyEmployee("Lucy", "syd", 123345, 30.30, 2);
        Employee emp4 = new HourlyEmployee("Susan", "qld", 9876, 90.90, 10);
    }
    public void addEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("Add:");
        String add = input.nextLine();
        System.out.println("Phone:");
        int phone = input.nextInt();
        Employee new_e = new Employee(name, add, phone);
        employees.add(new_e);
    }

    public void addHourlyEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("Add:");
        String add = input.nextLine();
        System.out.println("Phone:");
        int phone = input.nextInt();
        System.out.println("ratePerHour:");
        double ratePerHour = input.nextDouble();
        System.out.println("Rate:");
        int rate = input.nextInt();
        Employee new_h = new HourlyEmployee(name, add, phone, ratePerHour, rate);
        employees.add(new_h);
    }
    public void listEmlpyees(){
        for(Employee e: employees){
            System.out.println(e);
        }
    }
        public void run(){
        boolean flag=true;
        int choice = 0;
        Scanner input_1 = new Scanner(System.in);
        while(flag){
            System.out.println("1: Add an emplyee: \n" + 
            "2: Add an Hourly paid emplyee: \n" + 
            "3: List emplyeess: \n");
            choice = input_1.nextInt();
            switch(choice){
            case 1: 
            addEmployee();
            break;
            case 2:
            addHourlyEmployee();
            break;
            case 3:
            listEmlpyees();
            break;
            case 4:
            flag = false;
            System.out.println("Wrong");
        }
    }
    }
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.run();
    }
}
