package chapter1_oop_overview.chapter1_ex2;

public class FractionManagement {
    static void main() {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        fraction1.importFraction();
        fraction2.importFraction();

        fraction1.exportFraction();
        fraction1.checkFraction();

        fraction2.exportFraction();
        fraction2.checkFraction();

        System.out.print("Sum: ");
        Fraction sum = fraction1.sum(fraction2);
        sum.exportFraction();

        System.out.print("Multi: ");
        Fraction multiply = fraction1.multiply(fraction2);
        multiply.exportFraction();

        System.out.print("Divide: ");
        Fraction divide = fraction1.divide(fraction2);
        divide.exportFraction();

        System.out.print("Subtraction: ");
        Fraction sub = fraction1.subtraction(fraction2);
        sub.exportFraction();
    }
}
