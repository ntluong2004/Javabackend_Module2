package chapter3_static.chapter3_ex3;


import java.time.LocalDate;

public class Main {
    static void main() {
        String s1 = "2025/12/27";
        LocalDate d1 = LocalDateUtil.fromString_yyyyMMdd(s1);
        System.out.println(d1);
        System.out.println();


        String s2 = "28/05/2025";
        LocalDate d2 = LocalDateUtil.fromString_ddMMyyyy(s2);
        System.out.println(d2);
        System.out.println();


        LocalDate today = LocalDate.now();
        System.out.println(LocalDateUtil.toString_yyyyMMdd(today));
        System.out.println(LocalDateUtil.toString_ddMMyyyy(today));
    }
}
