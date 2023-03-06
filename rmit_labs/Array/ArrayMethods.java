package Array;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] intArr = { 3, 6, 9, 1, 90, 33 };
        double[] dArr = { 1.56, 6.3, 7.7, 4.4 };

        Arrays.sort(dArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(dArr));

        int index = Arrays.binarySearch(intArr, 9);
        System.out.println("the value 9 is at " + index);
        int index2 = Arrays.binarySearch(dArr, 4.4);
        System.out.println(index2);

    }
}
