package chapter11_file.ecercise.exercise_v6_chapter11.exception;

public class EmptyFieldException  extends Exception{

    public EmptyFieldException() {
        super("The data field cannot be empty");
    }
    public EmptyFieldException(String message) {
        super(message);
    }
}
