package chapter10_exception.exercise.exercise_v5_chapter10;

import java.util.Scanner;

public class ValidationUtil {
    static Scanner input = new Scanner(System.in);

    public static int functionCheck(int n1, int n2) {
        int choice;
        do {
            System.out.println("Enter number for function you want to use: ");

            while (!input.hasNextInt()) {
                System.out.println("----Error: Please enter a number, not letters or symbols!");
                input.next();
                System.out.println("Enter number for function you want to use: ");
            }

            choice = input.nextInt();
            input.nextLine();

            if (choice < n1 || choice > n2) {
                System.out.println("----This function is not valid, please enter again");
            }
        } while (choice < n1 || choice > n2);

        return choice;
    }
}
