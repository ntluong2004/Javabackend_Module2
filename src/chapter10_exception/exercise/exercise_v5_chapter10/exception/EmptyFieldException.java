package chapter10_exception.exercise.exercise_v5_chapter10.exception;

public class EmptyFieldException  extends Exception{

    public EmptyFieldException() {
        super("The data field cannot be empty");
    }
    public EmptyFieldException(String message) {
        super(message);
    }
}
