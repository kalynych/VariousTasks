package loops;

import java.util.Arrays;

public class general {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        {
            int j = a + b;
            System.out.println(j);
            System.out.println(a + b);
            System.out.println(Math.abs(a + b));
            System.out.println(Math.pow(2, Math.abs(a + b)));
        }

        String[] strings = null;
        System.out.println(strings);
        if (strings != null) {
            System.out.println(strings.length);
        }

        strings = new String[] {};
        System.out.println(strings);

        // two-dimensional arrays
        {
            int [][] c1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {1, 2, 3}
            };
            System.out.println(c1);
            System.out.println(Arrays.toString(c1[1]));
            System.out.println(Arrays.toString(c1));
            System.out.println(c1[1][0]);
            System.out.println(Arrays.deepToString(c1));

            {
                int[] arr = {33, -2, 4, 67, 4, 67, 4, 9, 4};
                int min = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
            }
        }


    }
}
