package chapter3_static.chapter3_ex1;
//    Đề bài
//Viết một lớp Student đại diện cho sinh viên, bao gồm các thông tin sau:
//
//Mã số sinh viên
//Tên
//Điểm
//Sử dụng biến tĩnh (static) để đếm số lượng sinh viên đã được tạo ra và viết phương thức tĩnh để truy xuất số lượng sinh viên.

public class Student {
    static int studentCount = 0;

    private int id;
    private String name;
    private double score;

    Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
    }

    static int getStudentCount() {
        return studentCount;
    }
}
