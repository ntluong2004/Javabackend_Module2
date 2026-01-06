package chapter2_constructor.chapter2_ex1;

import util.IntegerNumberUtil;

//import java.util.Scanner;

public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction() {
    }

//    public void importFraction() {
//        Scanner input = new Scanner(System.in);
//
//        numerator = input.nextInt();
//        do {
//            denominator = input.nextInt();
//
//            if (denominator == 0) {
//                System.out.println("\u001B[31m" + "Denominator is zero, please enter again \n" + "\u001b[0m");
//            }
//        }
//        while (denominator == 0);
//    }

    public void exportFraction() {

        if (numerator == 0) {
            System.out.println("0");
            return;
        }

        int commonDivision = IntegerNumberUtil.findGreatestCommonDivisor(numerator, denominator);
        numerator /= commonDivision;
        denominator /= commonDivision;


        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        if (denominator == 1) {
            System.out.println(numerator);
            return;
        }
        System.out.printf("%d/%d" + "\n", numerator, denominator);
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction copy() {
        return new Fraction(this.numerator, this.denominator);
    }

    public void addition(int value) {
        this.numerator = this.numerator + (value * denominator);
    }
}
