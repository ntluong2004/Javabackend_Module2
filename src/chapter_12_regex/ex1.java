package chapter_12_regex;

public class ex1 {
    static void main() {
        /**
         * a. Kiểm tra số điện thoại
         * Bắt đầu bằng số 0 hoặc (+84).
         * 2 số tiếp theo có thể là: 32, 33, 34, 35, 36, 37, 38, 39.
         * 7 số tiếp theo là số.
         */
        String sdt = "(+84)352404204";
        System.out.println(sdt.matches("(0|[(][+]84[)])3[2-9][0-9]{7}"));


        /**
         * b. Kiểm tra email
         * Chứa các ký tự từ A đến Z, a đến z.
         * Các ký tự số.
         * Ký tự gạch dưới.
         * Ký tự @.
         * Các ký tự trước @ có từ 6 đến 32 ký tự.
         * Chuỗi ký tự sau @ chia thành hai phần của domain mỗi phần có từ 2 đến 12 ký tự.
         */

        String email = "nguyentienluong2004_@gmail.com";
        System.out.println(email.matches("[A-Za-z0-9_]{6,32}@[A-Za-z0-9]{2,12}[.][A-Za-z0-9]{2,12}"));

        //Phiên bản khác
        System.out.println(email.matches("\\w{6,32}@[A-Za-z\\d]{2,12}[.][A-Za-z\\d]{2,12}"));

        /**
         * c. Kiểm tra Username
         * Chứa các ký tự từ A đến Z, a đến z, 0-9, dấu chấm (.) và dấu gạch dưới (_).
         * Độ dài từ 6 đến 32 ký tự.
         */

        String userName = "lwolf2004";
        System.out.println(userName.matches("[\\w.]{6,32}"));

        /**
         * d. Kiểm tra Password
         * Chứa cả ký tự hoa, thường, số, ký tự đặc biệt và dấu chấm (.).
         * Bắt đầu bằng ký tự in hoa.
         * Có từ 6 đến 32 ký tự.
         */

        String passWord = "Luong2004";
        System.out.println(passWord.matches("^[A-Z].[^ ]{5,31}"));
    }
}
