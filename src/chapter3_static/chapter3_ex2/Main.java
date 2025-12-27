package chapter3_static.chapter3_ex2;

public class Main {
    static void main() {

        double sum = MathUtil.add(5, 5);
        double subtract = MathUtil.subtract(5, 5);
        double multiple = MathUtil.multiply(5, 5);
        double divide = MathUtil.divide(5, 5);

        System.out.printf("sum = %.2f, sub = %.2f, multiple = %.2f, divide = %.2f", sum, subtract, multiple, divide);
    }
}
