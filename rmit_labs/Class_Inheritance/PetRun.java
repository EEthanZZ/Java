package rmit_labs.Class_Inheritance;

public class PetRun {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.speak("hi");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Hibiki", 21);
        System.out.println(dog2);
        dog2.setBreed("Blend whisky");
        System.out.println(dog2);
        dog1.speak("nothing");
        Dog dog3 = new Dog("Glenallachie", 10, "single malt");
        System.out.println(dog3);
        dog3.eat("big meals");
    }
}