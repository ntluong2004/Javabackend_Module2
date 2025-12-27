package chapter3_static.chapter3_ex1;

public class StudentManagement {
    static void main() {
        Student s1 = new Student(1, "Luong", 5.6);
        Student s2 = new Student(2, "Luong", 5.6);
        Student s3 = new Student(3, "Luong", 5.6);
        Student s4 = new Student(4, "Luong", 5.6);
        Student s5 = new Student(5, "Luong", 5.6);

        System.out.println(Student.getStudentCount());

    }
}
