package chapter10_exception;

public class Demo4CustomException {

    static void main() {
        try {
            checkAge(15);
        } catch (Under18YearOldException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws Under18YearOldException {
        if (age < 18) {
            throw new Under18YearOldException("Not enough year old");
        }
    }
}
