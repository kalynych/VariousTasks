package arrays;

import java.util.ArrayList;
import java.util.List;

public class findOdd {
    public static int findIt(int[] a) {
        int sum; int x = 0;
        List<Integer> repeats = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(repeats.contains(a[i]))
                continue;
            else
                sum = 1;
            if (i < a.length - 1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == a[i]) {
                        sum++;
                    }
                }
                if (sum % 2 == 1) {
                    x = a[i];
                    break;
                }
            }
            else
                x = a[i];
            repeats.add(a[i]);
        }
        return x;
    }
}
