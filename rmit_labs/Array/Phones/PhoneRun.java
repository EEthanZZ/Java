package Array.Phones;

public class PhoneRun {
    public static void main(String[] args) {
        Phones[] phones = new Phones[4];
        Phones iphone1 = new Phones("iphone1", 2000);
        phones[0] = iphone1;
        Iphone iphone2 = new Iphone("iphone2", 3000, "M1");
        phones[1] = iphone2;
        iphone2.setIsNew(true);
        Phones sumsung1 = new Phones("sumsung1", 1000);
        phones[2] = sumsung1;
        Sumsung sumsung2 = new Sumsung("Sumsung2", 1999, "large");
        phones[3] = sumsung2;
        sumsung2.setIsNew(true);

        System.out.println("All phones: \n");
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i] + "\n");
        }
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getIsNew()) {

                System.out.println("This is the new phone");
                System.out.println(phones[i]);
            }
        }
    }
}
