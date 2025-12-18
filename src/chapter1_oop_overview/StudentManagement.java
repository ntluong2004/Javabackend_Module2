package chapter1_oop_overview;

import java.util.Scanner;

public class StudentManagement {
    static void main() {
        Scanner input = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("===== INPUT FIRST STUDENT =====");
        System.out.print("Enter Student Name: ");
        s1.name = input.nextLine();

        System.out.print("Enter Student Score: ");
        s1.score = Double.parseDouble(input.nextLine());

        System.out.println("===== INPUT FIRST STUDENT =====");
        System.out.print("Enter Student Name: ");
        s2.name = input.nextLine();

        System.out.print("Enter Student Score: ");
        s2.score = Double.parseDouble(input.nextLine());

        System.out.println("===== PRINT FIRST STUDENT =====");
        System.out.print("Student Name: " + s1.name + "\n");
        System.out.print("Student Score: " + s1.score + "\n");

        System.out.println("===== PRINT SECOND STUDENT =====");
        System.out.print("Student Name: " + s2.name + "\n");
        System.out.print("Student Score: " + s2.score + "\n");


    }
}
