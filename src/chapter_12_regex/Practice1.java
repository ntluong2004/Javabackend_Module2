package chapter_12_regex;

public class Practice1 {
    static void main() {
        System.out.println("hello".equals("hello"));
        System.out.println("hello".matches("hello"));

        System.out.println("abc".matches("[abc]"));
        System.out.println("a".matches("[abc]"));
        System.out.println("b".matches("[abc]"));
        System.out.println("c".matches("[abc]"));
        System.out.println("d".matches("[abc]"));

//      tạo dãy ký tự liên tục
        System.out.println("d".matches("[a-z]"));

//      Ký tự bắt đầu của chuỗi nhập. Ví dụ: ^A nghĩa là A phải là ký tự đầu tiên trong chuỗi.
        System.out.println("%".matches("[^a-zA-Z]"));
        System.out.println("a".matches("[^a-zA-Z]"));

        // SVXXX => x laf soos 0-9
        System.out.println("SV001".matches("SV[0-9][0-9][0-9]"));
    }
}
