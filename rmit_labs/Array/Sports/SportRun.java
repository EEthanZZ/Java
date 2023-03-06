package Array.Sports;

public class SportRun {
    public static void main(String[] args) {
        int count = 0;
        Basketball ba1 = new Basketball("LBJ", 21, "2m");
        count++;
        Basketball ba2 = new Basketball("CP3", 10, "1.8m");
        count++;
        Boxing bx1 = new Boxing("mike", 15, "80kg");
        count++;
        Boxing bx2 = new Boxing("Tyson", 10, "100kg");
        count++;
        Sport[] sports = new Sport[5];
        sports[0] = ba1;
        sports[1] = ba2;
        sports[2] = bx1;
        sports[3] = bx2;
        for (int i = 0; i < count; i++) {
            System.out.println(sports[i]);
        }
        System.out.println("total sports players: " + count);
        bx1.is_champion(" is");
        System.out.println();
        System.out.println("Boxing only");
        for (int i = 0; i < count; i++) {
            if (sports[i] instanceof Boxing) {
                System.out.println(sports[i]);
            }
        }
    }

}