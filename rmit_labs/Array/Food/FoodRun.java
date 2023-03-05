package Array.Food;

public class FoodRun {

    public static void main(String[] args) {
        int count = 0;
        Food f1 = new Food("Apple", 1);
        count++;
        Fruit fr1 = new Fruit("Orange", 2, "AUS");
        count++;
        Food f2 = new Food("Prinkles", 3);
        count++;
        Snack s1 = new Snack("Beef Jerk", 4, "beef");
        count++;
        fr1.setIsHealthy(true);
        s1.setIsHealthy(true);
        Food[] foods = new Food[4];
        foods[0] = f1;
        foods[1] = fr1;
        foods[2] = f2;
        foods[3] = s1;

        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
        System.out.println("Total foods: " + count);
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isHealthy()) {
                System.out.println(foods[i] + "\n is healthy");
            }
        }
    }
}
