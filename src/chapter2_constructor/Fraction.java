package chapter2_constructor;

import util.IntegerNumberUtil;

import java.util.Scanner;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction() {

    }

    void importFraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        numerator = scanner.nextInt();

        do {
            System.out.println("Enter denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Invalid denominator, please try again.");
            }
        }
        while (denominator == 0);
    }

    void export() {
        int commonDivison = IntegerNumberUtil.findGreatestCommonDivisor(numerator, denominator);
        if (numerator == 0) {
            System.out.println(0);
            return;
        }

        numerator /= commonDivison;
        denominator /= commonDivison;

        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }

        if (denominator == 1) {
            System.out.println(numerator);
            return;
        }
        System.out.printf("%d / %d\n", numerator, denominator);
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public void plus(int i) {

    }

    public Fraction copy(Fraction e) {
        return new Fraction(e.numerator, e.denominator);
    }
}
