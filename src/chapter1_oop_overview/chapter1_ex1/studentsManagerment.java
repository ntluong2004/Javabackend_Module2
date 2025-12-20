package chapter1_oop_overview.chapter1_ex1;

import util.InputUtil;

import java.util.ArrayList;

public class studentsManagerment {
    static void main() {
        int n = InputUtil.inputGreatThan("", 0);

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();


        for (int i =0; i < n; i++){
            System.out.println("Import student "+ (i+1));
            student.importInfo();
            students.add(student);
        }

        System.out.println("Student List: ");
        for(int i = 0; i < n; i++){
            System.out.println("Student " + (i+1) );
            students.get(i).exportInfo();
        }
    }

}
