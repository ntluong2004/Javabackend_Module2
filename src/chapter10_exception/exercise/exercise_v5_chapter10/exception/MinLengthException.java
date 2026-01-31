package chapter10_exception.exercise.exercise_v5_chapter10.exception;

public class MinLengthException extends Exception{
    public MinLengthException() {
        super(" must be greater than 10 characters");
    }

    public MinLengthException (String message) {
        super(message);
    }
}
