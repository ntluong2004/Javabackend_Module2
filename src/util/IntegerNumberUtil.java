package util;

public class IntegerNumberUtil {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = (int) Math.sqrt(n); i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPositiveNumber(int n) {
        return n > 0;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
