package Array.Lab3;

public class Garage extends Car {
    public static void main(String[] args) {
        int count = 0;
        Car[] cars = new Car[15];
        cars[0] = new Car("Toyota", "Rav4", 2020, 1.0);
        count++;
        cars[1] = new Car("Mazda", "CX-5", 2010, 2.0);
        count++;
        cars[2] = new Car("BMW", "x3", 2000, 3.0);
        count++;
        cars[3] = new Car("Honda", "???", 1990, 4.0);
        count++;
        cars[0].setIsGarage(true);
        cars[2].setIsGarage(true);
        for (int i = 0; i < count; i++) {
            if (cars[i].getIsInGarage())
                System.out.println(cars[i]);

        }
    }
}
