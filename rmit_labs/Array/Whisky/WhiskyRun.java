package Array.Whisky;

import java.util.Scanner;

public class WhiskyRun {

    public static void main(String[] args) {
        int count = 0;
        String choice = "y";
        Whisky[] whiskies = new Whisky[3];
        while (choice.equalsIgnoreCase("y")) {
            Scanner input = new Scanner(System.in);
            System.out.println("whisky from: ");
            String from = input.nextLine();
            System.out.println("whisky cask: ");
            String cask = input.nextLine();
            System.out.println("whisky age: ");
            int age = input.nextInt();
            System.out.println("Vol?");
            double vol = input.nextDouble();
            whiskies[count] = new Whisky(from, age, cask, vol);
            count++;
            Scanner keep_going = new Scanner(System.in);
            System.out.println("Keep going?: ");
            choice = keep_going.nextLine();
        }

        for (int i = 0; i < count; i++)
            System.out.println(whiskies[i]);

        // Whisky wsk1 = new Whisky("jp", 21, "re");
        // System.out.println(wsk1.toString());
    }
}
