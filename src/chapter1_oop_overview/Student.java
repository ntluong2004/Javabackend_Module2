package chapter1_oop_overview;

import java.util.Scanner;

public class Student {
    String name;

    double score;

    double mathScore;

    double literatureScore;

    void importInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = input.nextLine();

        System.out.print("Enter Student Math Score: ");
        mathScore = Double.parseDouble(input.nextLine());

        System.out.print("Enter Student Literature Score: ");
        literatureScore = Double.parseDouble(input.nextLine());
    }

    void exportInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Math Score: " + mathScore);
        System.out.println("Student Literature Score: " + literatureScore);
        System.out.printf("Student Average Score: %f", calculateAverageScore());
    }

    double calculateAverageScore() {
        return (mathScore + literatureScore) / 2;
    }
}
