package chapter10_exception.exercise.exercise_v5_chapter10.validation;

import chapter10_exception.exercise.exercise_v5_chapter10.exception.MinLengthException;

public class PhoneValidation {

    public static void MinLengthException(String content, String field) throws MinLengthException {
        if (content.length() < 10) {
            throw new MinLengthException(field + "must greater than 10 characters");
        }
    }
}
