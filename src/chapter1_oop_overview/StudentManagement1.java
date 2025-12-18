package chapter1_oop_overview;

import util.InputUtil;

import java.util.ArrayList;
//import java.util.Scanner;

public class StudentManagement1 {

//    static Scanner input = new Scanner(System.in);

    static void main() {
        int n = InputUtil.inputGreatThan("students quantity", 0);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== IMPORT INFO =====");
        for (int i = 0; i < n; i++) {
            System.out.printf("===== INPUT STUDENT NUMBER %d =====" + "\n", (i + 1));

            Student student = new Student();

            student.importInfo();
            students.add(student);
        }

        System.out.println("===== EXPORT INFO =====");
        for (int i = 0; i < n; i++) {
            System.out.printf("==== INFO STUDENT NUMBER %d =====" + "\n", (i + 1));

            students.get(i).exportInfo();
        }

    }
}
