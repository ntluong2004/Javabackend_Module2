package util;

import java.util.Scanner;

public class InputUtil {
    static Scanner input = new Scanner(System.in);

    public static int inputGreatThan(String targer, int number) {
        int n;
        do {
            System.out.printf(" Enter %s ", targer);
            n = input.nextInt();
            if (n < number) {
                System.out.printf("\u001B[31m" + "%s < %d, please enter again" + "\u001b[0m", targer, number);
            }
        }
        while (n < number);
        return n;
    }
}
