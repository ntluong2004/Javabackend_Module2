package chapter11_file.ecercise.exercise_v6_chapter11.exception;

public class NumberOutOfRangeException extends Exception{

    public NumberOutOfRangeException() {
        super("incorrect battery status");
    }

    public NumberOutOfRangeException(String message) {
        super(message);
    }
}
