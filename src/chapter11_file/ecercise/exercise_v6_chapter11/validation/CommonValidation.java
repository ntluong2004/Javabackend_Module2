package chapter11_file.ecercise.exercise_v6_chapter11.validation;

import chapter11_file.ecercise.exercise_v6_chapter11.exception.EmptyFieldException;
import chapter11_file.ecercise.exercise_v6_chapter11.exception.NegativeNumberException;
import chapter11_file.ecercise.exercise_v6_chapter11.exception.NumberOutOfRangeException;

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
