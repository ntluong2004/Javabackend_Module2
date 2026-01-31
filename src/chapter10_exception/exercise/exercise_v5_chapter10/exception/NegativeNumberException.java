package chapter10_exception.exercise.exercise_v5_chapter10.exception;

public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
        super("Can not be negative");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
