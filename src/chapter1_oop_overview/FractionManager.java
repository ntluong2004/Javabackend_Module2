package chapter1_oop_overview;

public class FractionManager {
    static void main() {
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        fraction1.importNumber();
        fraction2.importNumber();

        Fraction sum = fraction1.sum(fraction2);
        Fraction mul = fraction1.multiply(fraction2);
        Fraction div = fraction1.divide(fraction2);
        Fraction sub = fraction1.subtraction(fraction2);


        sum.exportNumber();
        mul.exportNumber();
        div.exportNumber();
        sub.exportNumber();

    }
}
