package Array.Pets;

public class PetsRun {
    public static void main(String[] args) {
        int count = 0;
        Dogs dog1 = new Dogs("Dog1", 10, "bulldog");
        count++;
        Cats cat1 = new Cats("Cat1", 20, "blue");
        count++;
        Dogs dog2 = new Dogs("Dog2", 30, "bb");
        count++;
        Cats cat2 = new Cats("Cat2", 40, "grey");
        count++;
        // Create array of type of pets:
        Pets[] pets_types = new Pets[5];
        pets_types[0] = dog1;
        pets_types[1] = cat1;
        pets_types[2] = dog2;
        pets_types[3] = cat2;
        System.out.println("------------");
        for (int i = 0; i < count; i++) {
            System.out.println(pets_types[i]);
        }
        System.out.println("\n\nOnly Dogs:");
        for (int i = 0; i < count; i++) {
            if (pets_types[i] instanceof Dogs) {
                System.out.println(pets_types[i]);
            }
        }
        System.out.println("\n\nOnly Cats");
        for (int i = 0; i < count; i++) {
            if (pets_types[i] instanceof Cats) {
                System.out.println(pets_types[i]);
            }
        }
        System.out.println("number of pets " + count);
    }

}
