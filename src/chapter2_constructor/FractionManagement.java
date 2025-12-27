package chapter2_constructor;

public class FractionManagement {

    static void main() {
        Fraction a = new Fraction();
        a.export();

        Fraction b = new Fraction(1, 2);
        b.export();

        Fraction c = new Fraction(3);
        c.export();

        Fraction d = new Fraction(-6, -2);
        d.export();

        Fraction e = new Fraction(3, -1);
        e.export();

//        Fraction f = e.copy();
//        f.export();

    }
}
