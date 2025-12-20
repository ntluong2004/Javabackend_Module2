package chapter1_oop_overview.chapter1_ex3;

import java.util.Scanner;

public class Points {
    double x;
    double y;

    void importPoints() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x points: ");
        x = input.nextInt();

        System.out.println("Enter y points: ");
        y = input.nextInt();
    }

    double distanceTo(Points points) {
        double i = (points.x - x) * (points.x - x) + (points.y - y) * (points.y - y);
        return Math.sqrt(i);
    }
}
