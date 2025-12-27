package chapter2_constructor.chapter2_ex1;

public class FractionManagement {
    static void main() {
        Fraction a = new Fraction();
        a.exportFraction();                           // 0

        Fraction b = new Fraction(1, 2);
        b.exportFraction();                           // 1/2
        Fraction c = new Fraction(3);

        c.exportFraction();                           // 3
        Fraction d = new Fraction(-6, -2);

        d.exportFraction();                           // 3
        Fraction e = new Fraction(3, -1);

        e.exportFraction();

        Fraction f = e.copy();
        f.addition(100);
        e.exportFraction();
        f.exportFraction();

    }
}
