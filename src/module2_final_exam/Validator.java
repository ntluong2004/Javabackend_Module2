package module2_final_exam;

// File: Validator.java
import java.util.regex.Pattern;

public class Validator {
    public static void checkData(int birthDay, String email) throws BirthDayException, EmailException {
        if (birthDay < 1900 || birthDay > 2026) {
            throw new BirthDayException("Năm sinh không hợp lệ: " + birthDay);
        }
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!Pattern.compile(emailRegex).matcher(email).matches()) {
            throw new EmailException("Email không đúng định dạng: " + email);
        }
    }
}
