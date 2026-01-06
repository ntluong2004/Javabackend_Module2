package chapter4_inheritance;

public class MathUtil {

    public static double sum(double... arr) {

        double total = 0;

        for (double item : arr) {
            total += item;
        }
        return total;
    }
}
