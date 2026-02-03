package chapter11_file.ecercise.exercise_v6_chapter11.validation;

import chapter11_file.ecercise.exercise_v6_chapter11.exception.MinLengthException;

public class PhoneValidation {

    public static void MinLengthException(String content, String field) throws MinLengthException {
        if (content.length() < 10) {
            throw new MinLengthException(field + "must greater than 10 characters");
        }
    }
}
