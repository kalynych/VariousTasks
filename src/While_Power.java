public class While_Power {
    public static void main(String[] args) {
        int power = 0;
        int number = 5;
        int result = 1;

        while (result < 1000000) {
            System.out.println(number + " in power " + power + " = " + result);
            result *= number;
            power++;
        }
    }
}