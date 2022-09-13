package loops;

import java.util.Arrays;

public class Pyramid {

    public static void main(String[] args) {

        int maxI = 6;
        String space = " ";

        for (int i = 0; i < maxI; i++){
            System.out.print(space.repeat((maxI - i)*2));

            for (int j = 0; j < i + 1; j++) {
                System.out.print(space);
                System.out.print((i - j));
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(space);
                System.out.print((j));
            }

            System.out.println();
        }
    }
}
