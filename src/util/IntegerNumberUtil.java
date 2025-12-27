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

    public static int findGreatestCommonDivisor(int a, int b) {
        int min = Math.min(Math.abs(a), Math.abs(b));

        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
