package MountBuller;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;



public class MtBullerResort implements Serializable{
    private FileInputStream fis;
    private ObjectInputStream ois;
    private FileOutputStream fos;
    private ObjectOutputStream oos;

    private ArrayList<Customer> customers;
    private ArrayList<Accommodation> accommodations;
    private ArrayList<TravelPackage> travelpackages;

    public MtBullerResort(){
        customers = new ArrayList<Customer>();
        accommodations = new ArrayList<Accommodation>();
        travelpackages = new ArrayList<TravelPackage>();
    }

    public void populateLists(){
        new Accommodation(1, "A", 2, 10);
        accommodations.add(new Accommodation(2, "B", 2, 20));
        accommodations.add(new Accommodation(3, "C", 3, 30));
        accommodations.add(new Accommodation(4, "D", 1, 15));
        accommodations.add(new Accommodation(5, "E", 4, 40));
        accommodations.add(new Accommodation(6, "F", 2, 25));
        accommodations.add(new Accommodation(7, "G", 1, 10));
        accommodations.add(new Accommodation(8, "H", 3, 35));
        accommodations.add(new Accommodation(9, "I", 2, 20));
        accommodations.add(new Accommodation(10, "J", 4, 45));
        accommodations.add(new Accommodation(11, "K", 3, 50));
        
        new Customer("A","B",1);
        customers.add(new Customer("C","D",2));
        customers.add(new Customer("E","F",3));
        customers.add(new Customer("G","H",1));
    }
    //1: All accommodations
    public void displayAccommodations() {
        System.out.println("All accommodations:");
        for (Accommodation accommodation : accommodations) {
            System.out.println(accommodation);
        }
    }
    //2: Available accommodations
    public void displayAvailableAccommodations() {
        System.out.println("Available accommodations:");
        for (Accommodation accommodation : accommodations) {
            if (accommodation.isAvailable()) {
                System.out.println(accommodation);
            }
        }
    }
    //3: New customers
    public void addCustomer() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("First name:");
            String firstName = scanner.next();
            System.out.println("Last name:");
            String lastName = scanner.next();
            System.out.println("1: Beginner, 2: Intermediate, 3: Pro: ");
            int levelchoice = scanner.nextInt();
            switch (levelchoice) {
                case 1:
                levelchoice = 1;
                break;
                case 2:
                levelchoice = 2;
                break;
                case 3:
                levelchoice = 3;
                break;
                default:
                    System.out.println("Invalid choice, Only enter 1, 2 or 3");
                    return;
            }
            customers.add(new Customer(firstName, lastName,levelchoice));
        }
        System.out.println("Customer added");
    }
    //4: list all customers
    public void listCustomers() {
        System.out.println("All customers:");
        for (Customer customer : customers) {
            System.out.println("\n" + customer);
        }
    }

    //5: create new package
    public void createPackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer ID: ");
        int input1=0;
        try {
                input1 = scanner.nextInt();
        }catch (Exception e) {
            System.out.println(" Please enter a valid customer ID.");
            scanner.nextLine(); 
            listCustomers();}
        Customer customer = null;
        for (Customer c : customers) {
            if (c.getcID() == input1) {
                customer = c;
                break;
            }
        }
        if (customer == null) {
            System.out.println("Invalid customer ID");
            return;}
        System.out.println("Accommodation ID: ");
        int input2 = scanner.nextInt();
        Accommodation accommodation = null;
        boolean found = false;
        for (Accommodation a : accommodations) {
            if (a.getaccommodationID() == input2 && a.isAvailable()) {
                accommodation = a;
                accommodation.bookAccommodation();
                found = true;
                break;
            } else if (!a.isAvailable()) {
                System.out.println("Unavailable");
                return;
            }
        }
            if (!found) {
                System.out.println("Invalid Accommodation ID");
                return;
            }
            System.out.println("Enter start date ( in format of YYYY-MM-DD): ");
            LocalDate startDate = null;
            while (startDate == null) {
                try {
                    String inputdate = scanner.next();
                    startDate = LocalDate.parse(inputdate);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please enter in format of YYYY-MM-DD:");
                }
            }
            System.out.println("Enter duration in days: ");
            int duration = scanner.nextInt();
            TravelPackage travelPackage = new TravelPackage(customer, accommodation, startDate, duration);
            travelpackages.add(travelPackage);
            System.out.println("Package created successfully");
    }
//6: Add a life pass to package
    public void addLiftPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your package ID: ");
        int input=0;
        try{
            input = scanner.nextInt();
        }catch(Exception e) {
            System.out.println("Wrong. Please enter a valid package ID.");
            scanner.nextLine(); // consume the invalid input
            }
        TravelPackage travelPackage = null;
        for (TravelPackage pack : travelpackages) {
            if (pack.getPackageID() == input) {
                travelPackage = pack;
                break;}
        }
        if (travelPackage == null) {
            System.out.println("Not found. Enter 8 at the menumn to check your package ID");
            return;
        }
        travelPackage.setLiftPass(true);
        System.out.println("LifePass Successfully Added");
    }
//7: add a lesson fee
    public void addLessonFee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your package ID:");
        int input=0;
        try{
        input = scanner.nextInt();
        }catch(Exception e) {
            System.out.println("Invalid input. Please enter a valid package ID.");
            scanner.nextLine(); // consume the invalid input
            }
        TravelPackage travelPackage = null;
        for (TravelPackage pack : travelpackages) {
        if (pack.getPackageID() == input) {
            travelPackage = pack;
            break;}}
    if (travelPackage == null) {
        System.out.println("Not found. Check package ID");
        return;}
    System.out.println("How Many lessons? : ");
        int numbLesson=0;
        try{
            numbLesson = scanner.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // consume the invalid input
        }
        Customer customer =null;
    travelPackage.setHasLessonFee(true);
   travelPackage.setLessonsNo(numbLesson);
    System.out.println("Your Lesson fees  are added");
    System.out.println("Lesson fee added to package: $" +customer.lessonFee(numbLesson));
}
//8: list all packages
    public void listPackages() {
        for(TravelPackage p : travelpackages) {
                System.out.println(p.toString());
                break;
            }
    }
//9: save packages
    public void savePackages() {
        try {
            FileOutputStream fileOut = new FileOutputStream("TravelPackages.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(travelpackages);
            objectOut.close();
            System.out.println("Packages saved.");
        } catch (IOException e) {
            System.out.println("Packages not saved.: " + e.getMessage());
        }
    }
//10: load packages
    public void loadPackages() {
        try {
            FileInputStream fileIn = new FileInputStream("TravelPackages.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            travelpackages = (ArrayList<TravelPackage>) objectIn.readObject();
            objectIn.close();
            System.out.println("Packages loaded.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Packages not listed: " + e.getMessage());
        }
        listPackages();
    }
    public void run() {
        boolean flag = true;
        int choice = 0;
        Scanner choiceInput = new Scanner(System.in);
        while(flag){
            System.out.println(
                    """    
                            1. Display all accommodation
                            2. Display Only Available Accommodation
                            3. Add new customer
                            4. List Customers
                            5. Create package
                            6. Add lift pass to Package
                            7. Add lesson fee to Package
                            8. List Package
                            9. Save package to file
                            10. Read package from file
                            11. Quit
                            Choose your options:""");
        
        choice = choiceInput.nextInt();
        switch(choice){
            case 1:
            displayAccommodations();
            ;
            break;
            case 2:
            displayAvailableAccommodations();
            break;
            case 3:
            addCustomer();;
            break;
            case 4:
            listCustomers();;
            break;
            case 5:
            createPackage();;
            break;
            case 6:
            addLiftPass();;
            break;
            case 7:
            addLessonFee();;
            break;
            case 8:
            listPackages();
            break;
            case 9:
            savePackages();;
            break;
            case 10:
            loadPackages();;
            break;
            case 11:
            default:
            System.out.println("invalid option");
            flag = false;
        }
    }
    }
}