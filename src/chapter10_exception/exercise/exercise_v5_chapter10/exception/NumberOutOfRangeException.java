package chapter10_exception.exercise.exercise_v5_chapter10.exception;

public class NumberOutOfRangeException extends Exception{

    public NumberOutOfRangeException() {
        super("incorrect battery status");
    }

    public NumberOutOfRangeException(String message) {
        super(message);
    }
}
