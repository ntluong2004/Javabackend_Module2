package chapter1_oop_overview;

import java.util.Scanner;

public class Fraction {
    int numerator;

    int denominator;


    void importNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("==== ENTER FRACTION ====");

        System.out.print("Enter Numerator: ");
        numerator = input.nextInt();

        do {
            System.out.print("Enter Denominator: ");
            denominator = input.nextInt();
            if (denominator == 0) {
                System.out.println("\u001B[31m" + "Denominator must dif 0, please enter again" + "\u001b[0m");
            }
        }
        while (denominator == 0);
    }

    void exportNumber() {

        System.out.printf("%d/%d" + "\n", numerator, denominator);

        if (numerator * denominator > 0) {
            System.out.println("This is a possive fraction");
        } else if (numerator == 0) {
            System.out.println("This fraction = zero");
        } else {
            System.out.println("This is not a negative fraction");
        }
    }


    Fraction sum(Fraction fraction) {
        Fraction sum = new Fraction();

        sum.numerator = numerator * fraction.denominator + denominator * fraction.numerator;
        sum.denominator = denominator * fraction.denominator;

        return sum;
    }

    Fraction multiply(Fraction fraction) {
        Fraction multiply = new Fraction();

        multiply.numerator = numerator * fraction.numerator;
        multiply.denominator = denominator * fraction.denominator;

        return multiply;
    }

    Fraction divide(Fraction fraction) {
    Fraction divide = new Fraction();

    divide.numerator = numerator * fraction.denominator;
    divide.denominator = denominator * fraction.numerator;

    return divide;
    }

    Fraction subtraction(Fraction fraction) {
        Fraction subtraction = new Fraction();

        subtraction.numerator = numerator * fraction.denominator - denominator * fraction.numerator;
        subtraction.denominator = denominator * fraction.denominator;

        return subtraction;
    }
}
