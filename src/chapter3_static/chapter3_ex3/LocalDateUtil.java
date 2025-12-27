package chapter3_static.chapter3_ex3;

//Đề bài
//Tạo một lớp LocalDateUtil gồm các phương thức tĩnh (static) để thực hiện các chức năng sau:
//
//Chuyển đổi chuỗi với định dạng dd/MM/yyyy sang LocalDate.
//Chuyển đổi chuỗi với định dạng yyyy/MM/dd sang LocalDate.
//Chuyển đổi LocalDate với định dạng sang chuỗi với định dạng dd/MM/yyyy.
//Chuyển đổi LocalDate với định dạng sang chuỗi với định dạng yyyy/MM/dd.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {


    public static LocalDate fromString_ddMMyyyy(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
return LocalDate.parse(date, formatter);
    }

    public static LocalDate fromString_yyyyMMdd(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return LocalDate.parse(date, formatter);
    }

    public static String toString_ddMMyyyy(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format((formatter));

    }

    public static String toString_yyyyMMdd(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format((formatter));
    }
}
