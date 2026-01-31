package chapter10_exception.exercise.exercise_v5_chapter10.validation;

import chapter10_exception.exercise.exercise_v5_chapter10.exception.EmptyFieldException;
import chapter10_exception.exercise.exercise_v5_chapter10.exception.NegativeNumberException;
import chapter10_exception.exercise.exercise_v5_chapter10.exception.NumberOutOfRangeException;

public class CommonValidation {

    public static void validateEmptyField(String value, String fieldName) throws EmptyFieldException {
        if (value == null || value.trim().isEmpty()) {
            throw new EmptyFieldException(fieldName + " field cannot be empty");
        }
    }

    public static void validateNegativeNumber(double number, String fieldName) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException(fieldName + " cannot be negative");
        }
    }

    public static void validateNumberOutOfRange(double number, int min, int max, String fieldName) throws NumberOutOfRangeException {
        if (number < min || number > max) {
            throw new NumberOutOfRangeException(fieldName + " must be from 0 - 100%");
        }
    }
}
