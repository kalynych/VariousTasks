package arrays;

import java.util.Arrays;

public class randomArray {

    public static void main(String[] args) {

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            int random;
            do {
                random = (int) (Math.random() * Integer.MAX_VALUE);
            } while (random % 2 != 0);
            arr[i] = random;
                    }
        System.out.println("Array of random " + arr.length + " even integers: \n" + Arrays.toString(arr));
    }
}