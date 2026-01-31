package chapter10_exception;

public class Under18YearOldException extends Exception {
    public Under18YearOldException(String message) {
        super(message);
    }
}
