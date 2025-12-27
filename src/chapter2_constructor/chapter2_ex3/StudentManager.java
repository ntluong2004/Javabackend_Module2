package chapter2_constructor.chapter2_ex3;

public class StudentManager {
    static void main() {

        Student student1 = new Student("Luong", 9.5);
        Student student2 = new Student("Truong", 9.5);

        student1.setName("");

        student1.setScore(11);

        student1.exportStudent();

        student2.exportStudent();

    }
}
