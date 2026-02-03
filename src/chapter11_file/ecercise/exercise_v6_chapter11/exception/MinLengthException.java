package chapter11_file.ecercise.exercise_v6_chapter11.exception;

public class MinLengthException extends Exception{
    public MinLengthException() {
        super(" must be greater than 10 characters");
    }

    public MinLengthException (String message) {
        super(message);
    }
}
