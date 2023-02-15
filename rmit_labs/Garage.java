package rmit_labs;

public class Garage {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.toString());
        Car car2 = new Car("Toyota", "Rav4", 2009);
        System.out.println(car2.toString());
        Car car3 = new Car("Mazda", "cx-5", 2022);
        System.out.println(car3);
        System.out.println(car3.getYear());
        car1.setYear(1999);
        System.out.println(car1);
    }
}