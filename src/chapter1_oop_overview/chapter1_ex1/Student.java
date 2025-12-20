package chapter1_oop_overview.chapter1_ex1;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    void importInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your math score: ");
        mathScore = input.nextDouble();

        System.out.println("Enter your literature score: ");
        literatureScore = input.nextDouble();

    }

    double calculateAverageScore() {
        return (mathScore + literatureScore) / 2;
    }

    void exportInfo() {
        System.out.println("Name: " + name);
        System.out.println("Math score: " + mathScore);
        System.out.println("Literature score: " + literatureScore);
        System.out.println("Average: " + calculateAverageScore());
    }
}
