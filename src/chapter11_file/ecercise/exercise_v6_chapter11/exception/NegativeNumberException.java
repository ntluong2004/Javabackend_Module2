package chapter11_file.ecercise.exercise_v6_chapter11.exception;

public class NegativeNumberException extends Exception{

    public NegativeNumberException() {
        super("Can not be negative");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
